import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StrincTokenizer;
import java.util.*;


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
                System.out.println("          Which emotion resonates? Please type the number.");
                System.out.println("          1.Unmotivated  2.Anxious  3.Anger  4.Shame  5.Sadness?");
                String action1 = scanner.nextLine();
                While (action1) {
                    if (action1.equals("1")) {

                    } else if (action1.equals("2")) {
                    
                    } else if (action1.equals("3")) {
                    
                    } else if (action1.equals("4")) {
                    
                    } else if (action1.equals("5")) {
                    
                    } else if (action1.equals(null) || action1.equals("") {
                        System.out.println("          Please try again!");
                        System.out.println("          Which emotion resonates?");
                        System.out.println("          Unmotivated, Anxious, Anger, Shame, Sadness? Do not add spaces or extra characters");
                        String action1 = scanner.nextLine();
                    }
                }
            
            } else if (action.equals("5-7")) {
                System.out.println("          Which emotions resonates? Please type the number.");
                System.out.println("          1.Contentment  2.Boredom  3.Annoyance  4.Indfferennce  5.Neutraility");
                String action1 = scanner.nextLine.toLowerCase();
                while (action1) {
                    if (action1.equals("1")) {

                    } else if (action1.equals("2")) {
                    
                    } else if (action1.equals("3")) {
                    
                    } else if (action1.equals("4")) {
                    
                    } else if (action1.equals("5")) {
                    
                    } else {
                        System.out.println("          Please try again!");
                        System.out.println("          Which emotion resonates?");
                        System.out.println("          Contentment, Boredom, Annoyance, Indfferennce, Neutraility. Do not add spaces or extra characters");
                        String action1 = scanner.nextLine().toLowerCase();
                    }
                }

            } 
            else if (action.equals("8-10")) {
                System.out.println("        Which emotions resonate? Please type the number");
                System.out.println("        1.Joy  2.Gratitude  3.Love  4.Peace  5.Satisfaction");
                String action1 = scanner.nextLine();

                while (action1){
                    if (action1.equals("1")) {

                    } else if (action1.equals("2")) {
                    
                    } else if (action1.equals("3")) {
                    
                    } else if (action1.equals("4")) {
                    
                    } else if (action1.equals("5")) {
                    
                    }
                    else if (action1.equals(null) || action1.equals("")){
                        System.out.println("          Please try again!");
                        System.out.println("          Which emotion resonates?");
                        System.out.println("          Joy, Gratitude, Love, Peace, Satisfaction? Do not add spaces or extra characters");
                        String action1 = scanner.nextLine();
                    }


                }


            } else if (action == null || action.equals("") {
                System.out.println("          Please Try Again with the corrrect response!");                
                System.out.println("          How was your day?");
                System.out.println("          Rate your day as 0-4, 5-7, 8-10");
                System.out.println("          Please write it as "0-4" or "5-7" or "8-10"");
            }
        }
        
        
        
    }
}
