package Small_problems;
import java.util.*;

public class Prime_numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number, prime =0;

        System.out.print("Please give a number: ");
        number = scanner.nextInt();
        for(int num=2; num<=number; num++) {
            for (int i=1; i<=num; i++) {
                if (num%i == 0) {
                    prime += 1;
                }
            }
            if (prime == 2)
                System.out.print(num + ", ");
            prime = 0;
        }
    }
}
