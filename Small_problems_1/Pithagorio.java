package Small_problems_1;
import java.util.*;
import java.lang.Math;

public class Pithagorio
{
    public static int squares(int pleura)
    {
        return pleura*pleura;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Parakalw dwste thn timh ths prwths pleuras: ");
        int pleura1 = scanner.nextInt();
        System.out.print("Parakalw dwste thn timh ths dueterhs pleuras: ");
        int pleura2 = scanner.nextInt();

        System.out.print("To mhkos ths ypotinousas einai:"+ (double)Math.sqrt(squares(pleura1)+squares(pleura2)));
    }
}
