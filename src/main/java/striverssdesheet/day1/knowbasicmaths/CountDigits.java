package striverssdesheet.day1.knowbasicmaths;

public class CountDigits {

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(String.valueOf(n).length());
        int length = (int)Math.floor(Math.log10(n) + 1);
        System.out.println(length);

    }
}
