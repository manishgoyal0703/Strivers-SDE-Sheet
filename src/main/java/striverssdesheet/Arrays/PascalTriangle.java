package striverssdesheet.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class PascalTriangle {

    public static void main(String[] args) {
//        System.out.println(variation1(4,2));
//        variation2(6);
//        variation3(14);

//        System.out.println(optimalVariation1(4,2));
//        optimalVariation2(7);
//        System.out.println();
//        optimalVariation3(7);

        optimalVariation4(5);

    }

    public static List<Integer> optimalVariation4(int n){
        int result = n-1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(result);
        for(int i=1;i<n-1; i++){
            result = result*(n-1-i);
            result = result/(i+1);
            list.add(result);
        }
        return list;
    }

    public static long optimalVariation1(long row, long column){
        long result =1;
        for(long i=0; i<column; i++ ){
            result = result*(row-i);
            result = result/(i+1);
        }
        return result;
    }

    public static void optimalVariation2(long n){
        long result = n-1;
        System.out.print(1+ " " + result + " ");
        for(int i=1;i<n-1; i++){
            result = result*(n-1-i);
            result = result/(i+1);
            System.out.print(result + " ");
        }
    }
    public static void optimalVariation3(long n){
        if(n==1){
            System.out.println(1);
            return;
        }
        if(n==2){
            System.out.println(1);
            System.out.println(1 + " " + 1);
            return;
        }
        System.out.println(1);
        System.out.println(1 + " " + 1);
        for (long i =3; i<=n; i++){
            optimalVariation2(i);
            System.out.println();
        }
    }


    //    Variation 1: Given row number r and column number c.
//    Print the element at position (r, c) in Pascal’s triangle.
    public static long variation1(long row, long column){
//   Formula nCr = n!/(n-r)!r!
        return factorial(row)/(factorial(row-column)*factorial(column));
    }

    //    Variation 2: Given the row number n. Print the n-th row of Pascal’s triangle.
    public static void variation2(long row){
        for(long i =0; i<=row; i++){
            System.out.print(factorial(row)/(factorial(row-i)*factorial(i)) +" ");
        }
        System.out.println();
    }

    //    Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.
    public static void variation3(long row){
        long startRow = 0;
        while(startRow<=row){
            LongStream.range(startRow, row).forEach(i-> System.out.print(" "));
            for(long i =0; i<=startRow; i++){
                System.out.print(factorial(startRow)/(factorial(startRow-i)*factorial(i)) +" ");
            }
            System.out.println();
            startRow++;
        }

    }

    public static long factorial(long n){
        if(n==0) return 1l;
        return n*factorial(n-1);
    }




}
