package striverssdesheet.day1.knowbasicmaths;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int n = 153;
        int input = 153;
        int output= 0;
        while(n!=0){
            int rem = n%10;
            n = n/10;
            output+=Math.pow(rem, 3);
        }
        if(output == input){
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }
}
