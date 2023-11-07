package striverssdesheet.Arrays;

import striverssdesheet.Common.Matrix;
import java.util.*;

public class SetMatrixZeros {


    public static void main(String[] args) {
        int row  = 5;
        int column = 5;
        int matrix[][] = Matrix.createMatrix(row, column);
        matrix[0][0] = 0;
        matrix[0][4] = 0;
        System.out.println("matrix with zero's: " + Arrays.deepToString(matrix));
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<row; i++){
           for(int j=0; j<column; j++){
               if(matrix[i][j]==0){
                   list1.add(i);
                   list2.add(j);
               }
           }
       }

        for(int line=0; line< list1.size(); line++){
            int rowEntry = list1.get(line);
            int rowColumn = list2.get(line);
            for(int i=0; i<column; i++){
                matrix[rowEntry][i]=0;
            }
            for(int j=0; j<row; j++){
                matrix[j][rowColumn] = 0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));



    }


}
