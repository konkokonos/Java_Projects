package Loops;
import java.util.Arrays;

public class sort_an_array {
    public static void main (String[] args) {
        int[] array = {4,2,1,3,5,9,6,8,7};

        for(int i = 0 ; i < array.length;i++) {
            for(int j = i+1 ; j< array.length;j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
