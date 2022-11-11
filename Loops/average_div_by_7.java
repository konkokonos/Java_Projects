package Loops;

public class average_div_by_7 {
    public static void main(String[] args) {
        int sum=0, count=0;
        for(int i=0; i<=100; i++) {
            if((i%7) == 0) {
                sum +=i;
                ++count;
            }
        }
        System.out.print("Average of numbers that are divisible by 7 is: "+(double)(sum/count));
    }
}
