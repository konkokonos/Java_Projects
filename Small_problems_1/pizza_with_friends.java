package Small_problems_1;
import java.util.*;

public class pizza_with_friends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_friends;
        int number_of_pizzas;
        int prize_for_pizza;

        System.out.print("Δώστε μία τιμή για την pizza σε ευρώ: ");
        prize_for_pizza = scanner.nextInt();
        System.out.print("Παρακαλώ πείτε μου πόσα άτομα-φίλοι είστε: ");
        number_of_friends = scanner.nextInt();
        System.out.print("Παρακαλώ πείτε μου πόσες πίτσες θα φάτε: ");
        number_of_pizzas = scanner.nextInt();

        System.out.println("Περίσσεψαν "+ (8*number_of_pizzas)%number_of_friends +" κομμάτια πίτσας");
        System.out.println("Κάθε φίλος πρέπει να πληρώσει "+ (double)((prize_for_pizza*number_of_pizzas)/number_of_friends)+ " ευρώ");
    }
}
