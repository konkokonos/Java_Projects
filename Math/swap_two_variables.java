package Math;

public class swap_two_variables {
    public static void main (String[] args) {
        int x = 12, y = 25;
        x = x ^ y ^ (y = x);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
