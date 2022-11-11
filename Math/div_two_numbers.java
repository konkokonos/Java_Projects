package Math;

public class div_two_numbers {
    static double c;
    static double div(double a, double b) {
        c = a/b;
        return c;
    }

    public static void main(String[] args) {
        double a=5.4 , b=1.3 ;
        c = div(a,b);
        System.out.println(c);
    }
}
