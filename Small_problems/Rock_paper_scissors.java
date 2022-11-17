package Small_problems;
import java.util.*;

public class Rock_paper_scissors {
    public static void main(String[] args) {

        String[] choices = {"Rock", "Paper", "Scissors"};
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int rand_choice = rand.nextInt(3); // 0,1,2
        String computer = choices[rand_choice];
        System.out.print("Dwse mia apo tis epiloges Rock,Paper,Scissors: ");
        String person = scanner.nextLine();
        System.out.println("Machine's choice: "+computer);
        System.out.println("*********");
        if (computer.equals(person)) {
            System.out.println("Human - Machine: 1 - 1");
        } else if (person.equals("Rock") && computer.equals("Paper")) {
            System.out.println("Human - Machine: 0 - 1");
        } else if (person.equals("Rock") && computer.equals("Scissors")) {
            System.out.println("Human - Machine: 1 - 0");
        } else if (person.equals("Paper") && computer.equals("Rock")) {
            System.out.println("Human - Machine: 1 - 0");
        } else if (person.equals("Paper") && computer.equals("Scissors")) {
            System.out.println("Human - Machine: 0 - 1");
        } else if (person.equals("Scissors") && computer.equals("Rock")) {
            System.out.println("Human - Machine: 0 - 1");
        } else if (person.equals("Scissors") && computer.equals("Paper")) {
            System.out.println("Human - Machine: 1 - 0");
        }
    }
}