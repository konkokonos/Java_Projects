package Loops;

public class print_odd_numbers {
    public static void main(String[] args) {
        for(int i=1; i<=99; i++) {
            if(i%2 == 0)
                continue;
            else
                System.out.println(i);
        }
    }
}
