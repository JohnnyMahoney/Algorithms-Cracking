package randomAlgs;

public class LandAndWaterCase {

    public static int numsIsIsland(char[][] grid) {

        int islandCount = 0;

        for(int i=0; i< grid.length;i++){
            for(int j=0; j< grid[0].length;j++){
                if(grid[i][j] == '1') {
                    ++islandCount;
                    changeLandToWater(grid,i,j);
                }
            }
        }
        return islandCount;
    }
    public static void changeLandToWater(char[][]grid, int i, int j){
        if(i<0 || i >= grid.length || j< 0 || j >= grid[0].length || grid[i][j] =='0') return;

        grid[i][j] = '0';
        changeLandToWater(grid, i-1, j);
        changeLandToWater(grid, i+1, j);
        changeLandToWater(grid, i, j-1);
        changeLandToWater(grid, i, j+1);


    }


    public static void main(String[] args) {
        char[][] arr = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '1', '1'}
        };
        int result = numsIsIsland(arr);
        System.out.println(result);
    }
}
