package randomAlgs.ModifiedBinarySearch;

public class FirstBadVersion {

    public static int firstBad(int[] versions, int n) {

        int start = 0;
        int end = versions.length - 1;

        while (start < end) {
            int middle = start + (end - start) / 2;
            if (versions[middle] == n) {
                end =  middle;
            }  else
                start = middle + 1;

        }
        return start;
    }

    public static void main(String[] args) {
        int[] versions = {1, 2, 3,2,3,5,5,3,2,1,2,3,23,1,1,2,3,4,4, 4};
        int result = firstBad(versions, 4);
        System.out.println(result);
    }
}
