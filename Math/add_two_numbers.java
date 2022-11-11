package Math;

public class add_two_numbers
{
    static double add(double a, double b)
    {
        double c = a+b;
        return c;
    }

    public static void main(String[] args)
    {
        double a=2 , b=4 ;
        double c = add(a,b);
        System.out.println(c);
    }
}