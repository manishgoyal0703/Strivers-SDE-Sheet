package striverssdesheet.day1.knowbasicmaths;

public class GCD {

    //GCD(Greatest common divisor) or HCF(Highest common factor)
    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.gcd(4,6));
    }

    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }


}
