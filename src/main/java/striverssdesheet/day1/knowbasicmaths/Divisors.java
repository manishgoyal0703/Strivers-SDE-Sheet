package striverssdesheet.day1.knowbasicmaths;

public class Divisors {

    public static void main(String[] args) {
        int number = 36;
        System.out.println("Divisors for the number : 36 are: ");
        for (int i=1; i<=Math.sqrt(number); i++){
            if (number%i==0) {
                System.out.print(i + " ");

                int otherDivisor = number / i;
                if (otherDivisor != i) {
                    System.out.print(otherDivisor + " ");
                }
            }
        }
    }
}
