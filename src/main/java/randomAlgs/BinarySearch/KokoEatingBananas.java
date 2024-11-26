package randomAlgs.BinarySearch;

import randomAlgs.realInterviewProblems.ParseCSV;

import java.util.Arrays;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int hours = 0;
        int k = 0;
        int i = 0;
        while (i < piles[piles.length - 1]) {
            i += 1;
            for (int j = 0; j < piles.length; j++) {
                k = i;
                hours += 1;
                while (piles[j] - k > 0) {
                    k += i;
                    hours += 1;
                }
            }
            if (hours > h) {
                hours = 0;
            } else {
                return i;
            }

        }
        return 0;
    }


    public static void main(String[] args) {

        int[] piles = {25,10,23,4};
        int result = minEatingSpeed(piles, 4);
        System.out.println(result);
    }
}
