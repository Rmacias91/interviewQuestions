import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] input = new int[][]{
                {1,2,0,3}, {4,5,6,7}, {0,8,9,10},{11,12,13,14},{2,2,2,2}
        };
        System.out.println("Done");
        System.out.println(Arrays.deepToString(solution(input)));
    }


    private static int[][] solution(int[][] input){
        int rows = input.length;
        int columns = input[0].length;
        List<int[]> zeroList = new ArrayList<>();
        //(X)Double for loop one for columns and rows
        //(X)If I find a zero, mark in in a hash map
        //Go through hash map and zero out where columns are rows are for it.
        for(int row =0; row <= rows -1; row ++){
            for(int column = 0; column <= columns-1; column++){
                int value = input[row][column];
                if(value == 0){
                    zeroList.add(new int[]{row,column});
                }
            }
        }

        for(int i = 0; i<=zeroList.size()-1; i++){
            int[] zeroLoc = zeroList.get(i);
            int row = zeroLoc[0];
            int column = zeroLoc[1];

            //column
            for(int curCol =0; curCol <= columns-1; curCol++){
                input[row][curCol] = 0;
            }

            //row
            for(int curRow = 0; curRow <= rows-1; curRow++){
                input[curRow][column] = 0;
            }
        }
        return input;
    }
}
