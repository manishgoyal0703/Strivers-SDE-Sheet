package striverssdesheet.day1.basicRecursion;

public class PrintNto1 {

    public static void main(String[] args) {
        recursion(0, 5);
    }

    public static int recursion(int i, int n){

        if(i==n){
            return i;
        }
        else {
            System.out.println(recursion(i+1, n));
            return i;
        }
    }
}
