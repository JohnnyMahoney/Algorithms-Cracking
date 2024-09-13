package randomAlgs.ModifiedBinarySearch;

public class FirstBadVersion {

    public static int firstBad(int[] versions, int n) {

        int start = 0;
        int end = versions.length -1;

        while(start <= end) {
            int middle = (start+end) /2;
            if(versions[middle] == n && versions[middle-1] != n) {
                return middle;
            }
            else if(versions[middle-1] == n){
                end = middle - 1;
            }
            else
                start = middle + 1;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] versions = {1,2,3,4,4};
        int result = firstBad(versions, 4);
        System.out.println(result);
    }
}
