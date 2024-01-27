import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StrincTokenizer;
imprt java.util.*;


public class Main {
    public static void main(String[] args) {
        Library myLib = new library();
        //FINISHHHHHHHHHHH MYLIB
        Scanner scanner = new Scanner(System.in);
        System.out.println("          How was your day?");
        System.out.println("          Rate your day as 0-4, 5-7, 8-10");
        System.out.println("          Please write it as "0-4" or "5-7" or "8-10"");

        while (scanner.hasNextLine()) {
            String action = scanner.nextLine();

            if (action.equals("0-4")) {
                System.out.println("          Which emotion resonates?");
                System.out.println("          Unmotivated, Anxious, Anger, Shame, Sadness?");
                String action1 = scanner.nextLine();
                if (action1.equals("Unmotivated")) {

                }
            
            } else if (action.equals("5-7")) {

            } else if (ations.equals("8-10")) {
                System.out.println("        Which emotions resonate with you today?");
                System.out.println("    Joy    Gratitude    Love    Peace    Satisfaction");
                Scanner emotions = new Scanner(System.in);


            } else if (action == null || action.equals("") {
                System.out.println("          Please Try Again with the corrrect response!");                System.out.println("          How was your day?");
                System.out.println("          Rate your day as 0-4, 5-7, 8-10");
                System.out.println("          Please write it as "0-4" or "5-7" or "8-10"");
            }
        }
        
        
        
    }
}
