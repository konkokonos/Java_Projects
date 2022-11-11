package Math;
import java.util.Scanner;

public class average_three_numbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter three numbers");
        double first_number = myObj.nextInt();
        double second_number = myObj.nextInt();
        double third_number = myObj.nextInt();
        double average_number = (first_number + second_number + third_number)/3 ;

        System.out.println("Average number: " + average_number);
    }
}
