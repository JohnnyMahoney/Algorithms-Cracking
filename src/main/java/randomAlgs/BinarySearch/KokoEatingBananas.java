package randomAlgs.BinarySearch;

import randomAlgs.realInterviewProblems.ParseCSV;

import java.util.Arrays;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canEatAll(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }


        }

        return left;
    }

    private static boolean canEatAll(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;
        }
        return hours <= h;
    }


    public static void main(String[] args) {

        int[] piles1 = {1, 4, 3, 2};
        int h1 = 9;
        System.out.println(minEatingSpeed(piles1, h1));

        int[] piles2 = {25, 10, 23, 4};
        int h2 = 4;
        System.out.println(minEatingSpeed(piles2, h2));
    }
}
