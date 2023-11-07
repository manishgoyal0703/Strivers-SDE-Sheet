package striverssdesheet.Arrays2;


import java.util.Arrays;

public class RepeatAndMissingNumber {

    public static void main(String[] args) {
        int[] myArray = new int[10];
        for(int i=1; i<=myArray.length; i++){
            myArray[i-1] = i;
        }
        myArray[5] = 7;
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(repeatedNumber(myArray)));
    }

    public static int[] repeatedNumber(final int[] A) {
        int size = A.length;
        int sumofElements = (size*(size+1))/2;
        int sum =0;
        for (int element: A) {
            sum += element;
        }
        int missingNumber = sum - sumofElements;
        int duplicate = sumofElements + missingNumber - sum;
        return new int[] {missingNumber, duplicate};
    }
}
