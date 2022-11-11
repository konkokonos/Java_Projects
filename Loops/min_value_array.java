package Loops;

public class min_value_array {
    static int min_value;
    static int find_min_value(int[] array) {
        int min=array[0];

        for(int i=0; i<array.length; i++) {
            if(min>array[i])
                min = array[i];
        }

        return min;
    }
    public static void main(String[] args) {
        int[] array = {4,7,6,8,2};
        min_value = find_min_value(array);
        System.out.print("Min value from array is: "+min_value);
    }
}
