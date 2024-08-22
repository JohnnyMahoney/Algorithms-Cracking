import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArray {

    public static List<Integer> duplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            int element = Math.abs(arr[i]) -1;
            if(arr[element] < 0 ) duplicates.add(Math.abs(arr[i]));

            arr[element] = - arr[element];
        }


        return duplicates;
    }



    public static void main(String[] args) {
        int[] arr = {5,8,2,3,7,8,5,2};
       List<Integer> duplicates =  duplicates(arr);
       String answer =  duplicates.toString();
        System.out.println(answer);

    }
}
