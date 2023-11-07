package striverssdesheet.day1.basicRecursion;

public class PrintNTimes {

    public static void main(String[] args) {
        int count =4;
        callRecursion(1,count);
    }

    public static void callRecursion(int start, int total){
        if(start>total) return ;
        System.out.println("Manish");
        callRecursion(start+1, total);
    }

}
