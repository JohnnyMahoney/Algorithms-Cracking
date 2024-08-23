package randomAlgs;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositiveBrood {

    public static int findValue(int[] arr) {
        int value  =0;
        Set<Integer> uniqueValues = new HashSet<>();

        for(int i =0; i< arr.length;i++) {
            uniqueValues.add(arr[i]);
        }
        for(int i =0; i<= arr.length;i++) {
            if(!uniqueValues.contains(i)) return i;
        }
        return value;
    }


    public static void main(String[] args) {
        int[] arr = {7,1,2,4,6,9,0,8};
       int result = findValue(arr);
        System.out.println(result);

    }
}
