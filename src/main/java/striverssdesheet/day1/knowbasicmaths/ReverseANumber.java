package striverssdesheet.day1.knowbasicmaths;

import java.util.Collections;

public class ReverseANumber {

    public static void main(String[] args) {

        int num =12345;
        int reversedNumber =0;
        while(num!=0){
            int rem = num%10;
            reversedNumber = reversedNumber*10 + rem;
            num = num/10;
        }
        System.out.println(reversedNumber);

        String s = new StringBuilder(String.valueOf(reversedNumber)).reverse().toString();
        int output = Integer.valueOf(s);
        System.out.println(output);


    }
}
