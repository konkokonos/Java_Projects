package Math;

public class is_even {
    static int a;

    static int is_ev(int a) {
        if ((a%2) == 0)
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
        a=22;
        //a=23;
        int result = is_ev(a);
        if (result == 0)
            System.out.println("The number is even!");
        else
            System.out.println("The number is not even!");
    }
}
