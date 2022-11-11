package Math;
import java.util.*;

public class minimum_of_numbers {
    static int min;

    private static int minimum(int a, int b) {
        if(a<b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        min = minimum(a,b);
        min = minimum(min,c);

        System.out.print("minimum=" + min);
        scanner.close();
    }
}
