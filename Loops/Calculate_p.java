package Loops;

public class Calculate_p {
    public static void main(String[] args) {
        int count=0;
        double sum=0.0, big_sum=1.0;
        for(double i=1.0; i<100000.0; i++) {
            if((i%2) != 0) {
                if(count == 1) {
                    sum-=(1/i);
                    count = 0;
                }
                else {
                    sum +=(1/i);
                    count++;
                }
            }
        }
        System.out.println(4.0*sum);
    }
}
