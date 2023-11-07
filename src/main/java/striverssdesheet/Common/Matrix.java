package striverssdesheet.Common;

import java.util.Arrays;

public class Matrix {

    public static int[][] createMatrix(int row, int column){
        int[][] matrix = new int[row][column];
        int counter = 1;
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix[i][j] = counter;
                counter++;
            }
        }
        System.out.println("******************* Matrix created ***********************");
        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }
}
