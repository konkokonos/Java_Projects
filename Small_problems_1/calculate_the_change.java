package Small_problems_1;
import java.util.*;

public class calculate_the_change {
    public static double calculate_bills(double change,int bill){
        if(bill<5)
            System.out.print((int)change/bill+" "+bill+" coins, ");
        else
            System.out.print((int)change/bill+" "+bill+" bills, ");
        return (change%bill);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double amount_to_pay;
        double amount_you_have;
        double change;

        System.out.print("Give the amount to pay: ");
        amount_to_pay = scanner.nextFloat();
        do{
            System.out.print("Give the amount you have: ");
            amount_you_have = scanner.nextFloat();
            change = amount_you_have - amount_to_pay;

            if(change<0)
                System.out.println("Please give more money!");
        }
        while(change<0);

        int[] bills ={500,200,100,50,20,10,5,2};
        System.out.print("I own you: ");
        for(int i=0; i<bills.length;i++){
            change = calculate_bills(change,bills[i]);
        }
        System.out.print(" "+(int)change+" 1 coins ");
        double cents = change - (int)change;
        if(cents>0.50){
            System.out.print("and "+(int)(cents/0.50)+" "+"50 cents");
        }
    }
}
