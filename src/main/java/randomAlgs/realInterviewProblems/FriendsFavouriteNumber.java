package randomAlgs.realInterviewProblems;

public class FriendsFavouriteNumber {

    public static int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX++;
            if (A[i] == Y)
                nY++;
            if (nX == nY)
                result = i;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {6, 42, 11, 7, 1, 42};
        int result = solution(7, 42, arr);
        System.out.println(result);
    }
}
