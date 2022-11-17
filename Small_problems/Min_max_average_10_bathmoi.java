package Small_problems;
import java.util.*;

public class Min_max_average_10_bathmoi {
    public static double average(int[] array) {
        int sum = 0;
        double average;

        for (int i = 0; i < (array.length); i++)
            sum += array[i];
        average = (double) sum / (double) (array.length);
        return average;
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int i = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("DWSTE 10 BATHMOUS:\n");
        while (true) {
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
                scanner.nextLine();
                i++;
                if (i == 10)
                    break;
            } else {
                scanner.nextLine();
                System.out.println("Παρακαλώ να βάζετε μόνο αριθμούς!");
            }
        }
        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[(numbers.length) - 1];
        double aver = average(numbers);

        System.out.println("\nΟ μέσος όρος των μαθημάτων είναι: " + aver);
        System.out.println("Ο μέγιστος βαθμός είναι: " + max);
        System.out.println("Ο ελάχιστος βαθμός είναι:" + min);
    }
}
