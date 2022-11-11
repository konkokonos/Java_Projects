package Loops;
import java.util.*;

public class sum__average_111_8899 {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for(int i=111;i<=8899; i++) {
            sum +=i;
            ++count;
        }
        System.out.print("The average from 111 to 8899 is: "+(sum/count));
    }
}
