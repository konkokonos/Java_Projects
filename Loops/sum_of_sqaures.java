package Loops;

public class sum_of_sqaures {
    public static int squares(int n) {
        int number = n*n;
        return number;
    }

    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i<=100; i++) {
            int number = squares(i);
            sum +=number;
        }
        System.out.print("Sum of alla squares is: "+sum);
    }
}
