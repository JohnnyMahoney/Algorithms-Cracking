package randomAlgs.Matrix;

public class IslandPerimeter {
    public static int perimeter(int[][] grid){

        for(int i = 0; i<grid.length; i++) {
            for(int j =0; j< grid[0].length;j++) {
                if(grid[i][j] == 1) {
                    return calculatePerimeter(grid,i,j);
                }
            }
        }
        return 0;
    }

    private static int calculatePerimeter(int[][] grid, int i, int j) {
        if (i<0 || i>=grid.length || j<0|| j>=grid[0].length || grid[i][j] == 0) {
            return 1;
        }
        if (grid[i][j] == -1) {
            return 0;
        }

        grid[i][j] = -1;

        int perimeter = 0;
        perimeter += calculatePerimeter(grid,i-1,j);
        perimeter += calculatePerimeter(grid,i+1,j);
        perimeter += calculatePerimeter(grid,i,j-1);
        perimeter += calculatePerimeter(grid,i,j+1);

        return perimeter;
    }

    public static void main(String[] args) {
        int[][] island = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int result = perimeter(island);
        System.out.println(result);
    }
}
