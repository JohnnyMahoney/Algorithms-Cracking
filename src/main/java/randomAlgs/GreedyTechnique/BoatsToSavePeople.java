package randomAlgs.GreedyTechnique;

import java.util.Arrays;

public class BoatsToSavePeople {

    public static int rescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;
        int amount = 0;

        while (start <= end) {
            if ((people[start] + people[end]) > limit) {
                end--;
            } else {
                start++;
                end--;
            }
            amount++;
        }

        return amount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 1, 2, 1, 1, 2, 3};
        int result = rescueBoats(arr, 3);
        System.out.println(result); //7
    }
}
