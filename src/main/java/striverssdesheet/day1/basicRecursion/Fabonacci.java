package striverssdesheet.day1.basicRecursion;

public class Fabonacci {

    public static void main(String[] args) {
        System.out.println(fab(5));
    }

    public static int fab(int n){
        if(n<=1){
            return 1;
        } else {
            return fab(n-1) + fab(n-2);
        }
    }
}
