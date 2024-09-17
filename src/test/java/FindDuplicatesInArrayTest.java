import randomAlgs.Other.FindDuplicatesInArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDuplicatesInArrayTest {

    @Test
    void testDuplicatesWithMultipleDuplicates() {
        int[] arr = {5, 8, 2, 3, 7, 8, 5, 2};
        List<Integer> expected = Arrays.asList(5, 8, 2);
        List<Integer> result = FindDuplicatesInArray.duplicates(arr);

        Set<Integer> expectedSet = new HashSet<>(expected);
        Set<Integer> resultSet = new HashSet<>(result);

        assertEquals(expectedSet, resultSet, "Метод повинен повертати всі унікальні дублікатні значення.");
    }
}
