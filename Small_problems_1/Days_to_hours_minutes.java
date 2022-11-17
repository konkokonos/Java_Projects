package Small_problems_1;
import java.util.*;

public class Days_to_hours_minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Δώστε παρακαλώ πόσες μέρες θέλετε για μετατροπή: ");
        int days = scanner.nextInt();
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.print(hours + " ώρες, " + minutes + " λεπτά, " + seconds + " δευτερόλεπτα");

    }
}
