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
           if (action1.equals("Unmotivated") || action1.equals("unmotivated") {

                } else if (action1.equals("Anxious") || action1.equals("anxious") {
                    
                } else if (action1.equals("Anger") || action1.equals("anger") {
                    
                } else if (action1.equals("Shame") || action1.equals("shame") {
                    
                } else if (action1.equals("Sadness") || action1.equals("sadness") {
                    
                }
            
            } else if (action.equals("5-7")) {
                System.out.println("          Which emotions resonates?");
                System.out.println("          Contentment, Boredom, Annoyance, Indfferennce, Neutraility. (Do not add spaces or extra characters)");
                String FiveToSevenEmotion = scanner.nextLine.toLowerCase(); 
                if (FiveToSevenEmotion.equals("contentment"))
                

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
