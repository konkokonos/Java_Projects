package Small_problems_1;
import java.util.*;

public class Strange_for {
    public static void main(String[] args){
        int number_1, number_2, number_3 ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give the first number: ");
        number_1 = scanner.nextInt();
        System.out.print("Please give the second number: ");
        number_2 = scanner.nextInt();
        System.out.print("Please give the third number: ");
        number_3 = scanner.nextInt();

        for(int i=0; i<number_1; i++){
            if(i == number_2)
                continue;
            if(i == number_3)
                break;
            System.out.println(i);
        }
    }
}
