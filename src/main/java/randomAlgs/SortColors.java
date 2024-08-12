package randomAlgs;

public class SortColors {
    public static int[] sortColors(int[] colors) {
        int start = 0;
        int current = 0;
        int end = colors.length - 1;

        while(current <= end){
            if(colors[current] == 0) {
                int flag = colors[start];
                colors[start] = colors[current];
                colors[current]= flag;
                start++;
                current++;
            } else if (colors[current] == 1) {
                current++;
            } else {
                int flag = colors[end];
                colors[end] = colors[current];
                colors[current]= flag;
                end--;
            }

        }
        return colors;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 0, 0, 1, 2, 1};
        sortColors(arr);

        for (int element: arr) {
            System.out.println(element + "");
        }

    }
}
