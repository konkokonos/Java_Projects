package Small_problems_1;
import java.util.*;

public class Chars_ints_spchars {
    public static void main(String[] args){
        String characters ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers="123456789";
        String special_characters="!@#$%^&*(){}|:;'";
        int ch=0, n=0, sc=0;
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Please give a string: ");
        String my_string=scanner.nextLine();
        for(int i=0; i<characters.length(); i++){
           char c = characters.charAt(i);
           if (my_string.contains(""+c))
                ch +=1;
        }
        for(int i=0; i<numbers.length(); i++){
            char c = numbers.charAt(i);
            if (my_string.contains(""+c))
                n +=1;
        }
        for(int i=0; i<special_characters.length(); i++){
            char c = special_characters.charAt(i);
            if (my_string.contains(""+c))
                sc +=1;
        }

        System.out.println("Exit:");
        System.out.println("We have "+ ch +" characters");
        System.out.println("We have "+ n +" numbers");
        System.out.println("We have "+ sc +" special characters");
    }

}
