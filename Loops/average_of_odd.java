package Loops;

public class average_of_odd {
    public static void main(String[] args) {
        int sum=0, count=0;
        for(int i=0; i<=100; i++) {
            if(i%2 != 0) {
                sum +=i;
                ++count;
            }
        }
        System.out.print("The average of odd numbers is: "+(sum/count));
    }
}
