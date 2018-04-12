package everybodypush;
import java.util.Scanner;

/**
 *
 * @author ejw5285
 */
public class EverybodyPush {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Hello World???");
//        System.out.println("IST is for winners.");
        Scanner scnr = new Scanner(System.in);
        String input = "";
        System.out.println("Hello my name is Siri, how may I help I?");
        System.out.println("Enter a question");
        input = scnr.nextLine();
        if(input.equals("What is your name?"))
        {
            System.out.println("My name is Siri!");
        }
        
    }
    
}
