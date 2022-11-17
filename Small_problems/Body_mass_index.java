package Small_problems;
import java.util.*;

public class Body_mass_index {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float height, weight, bmi;

        System.out.print("Please give your height in meters: ");
        height = scanner.nextFloat();
        System.out.print("Please give your weight in kilos: ");
        weight = scanner.nextFloat();
        bmi = (float)(weight/Math.pow(height,2));

        System.out.println("Your bmi is: " + bmi);
        if (bmi>=15.0 && bmi<18.5){
            System.out.println("You are underweight!");
        } else if (bmi>=18.5 && bmi<25.0) {
            System.out.println("You are normal weight!");
        } else if (bmi>=25.0 && bmi<30.0) {
            System.out.println("You are overweight!");
        }else if (bmi>30.0) {
            System.out.println("You are obese!");
        }
    }
}
