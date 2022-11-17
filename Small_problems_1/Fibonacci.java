package Small_problems_1;
import java.util.*;

public class Fibonacci {
    static int n;
    static int fibonacci(int n) {
        int a =0, b=1, sum=0;
        for(int i =1; i<n; i++) {
            sum = a+b;
            a = b;
            b =sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give the number you want to calculate the Fibonacci: ");
        n = scanner.nextInt();
        int result = fibonacci(n);
        System.out.print("F"+n+"="+result);
    }
}