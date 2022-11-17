package Small_problems;
import java.util.*;

public class Username_password{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String username = "Konstantinos";
        String password = "JVg56@";
        String user,pass;
        boolean u = false, p = false;

        do {
            System.out.print("Please give the Username: ");
            user = scanner.nextLine();
            if (user.equals(username))
                u = true;
            else
                System.out.println("Please give a valid username!");
            }while(!u);

        do {
            System.out.print("Please give the password: ");
            pass = scanner.nextLine();
            if (pass.equals(password)){
                p = true;
                System.out.println("Welcome to the App!");
            } else
                System.out.println("Please give the valid password");
            }while(!p);
    }
}
