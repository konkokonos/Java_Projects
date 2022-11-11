package Loops;

public class Harmonic {
    public static void main(String[] args) {
        int n = 50000;
        double sum=0.0;

        for(double i =1; i<=n; i++) {
            sum +=(1/i);
        }
        System.out.print("Harmonic for 50000 is: "+sum);
    }

}
