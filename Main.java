import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StrincTokenizer;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("          How was your day?");
        System.out.println("          Rate your day as 0-4, 5-7, 8-10");
        System.out.println("          Please write it as '0-4' or '5-7' or '8-10'");

        while (scanner.hasNextLine()) {
            String action = scanner.nextLine();

            if (action.equals("0-4")) {
                System.out.println("          Which emotion resonates? Please type the number.");
                System.out.println("          1.Unmotivated  2.Anxious  3.Anger  4.Shame  5.Sadness? (Do not add spaces or extra characters)");
                String action1 = scanner.nextLine();
                System.out.println("          Why are you feeling this way?");
                System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                String action2 = scanner.nextline().toLowerCase();
                While (action1 && action2) {
                    if (action2.equals("appearances")) {
                        Appearences app = new Appearences(action1);
                        //what you learned from the daily affirmationa nd how you think you can achieve 
                        //it in the future
                        
                    } else if (action2.equals("finances")) {
                        Finances fin = new Finances(action1);;
                    } else if (action2.equals("school/work")) {
                        SchoolWork sch = new SchoolWork(action1);
                    } else if (action2.equals("family/relationships")) {
                        FamilyRship fm = new FamilyRship(action1);
                    } else if (action2.equals("other")) {
                        Other oth = new Other(action1);
                    }else {
                        System.out.println("          Please try again!");
                        System.out.println("          Which emotion resonates?");
                        System.out.println("          1.Unmotivated  2.Anxious  3.Anger  4.Shame  5.Sadness? (Do not add spaces or extra characters)");
                        String action1 = scanner.nextLine();
                        System.out.println("          Why are you feeling this way?");
                        System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                        String action2 = scanner.nextline().toLowerCase();
                    }
                }
            
            } else if (action.equals("5-7")) {
                System.out.println("          Which emotions resonates?");
                System.out.println("          6.Contentment, 7.Boredom, 8.Annoyance, 9.Indifference, 10.Neutrality? (Do not add spaces or extra characters)");
                String action1 = scanner.nextLine();
                System.out.println("          Why are you feeling this way?");
                System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                String action2 = scanner.nextline().toLowerCase();
                While (action1 && action2) {
                    if (action2.equals("appearances")) {
                        Appearences app = new Appearences(action1);
                    } else if (action2.equals("finances")) {
                        Finances fin = new Finances(action1);;
                    } else if (action2.equals("school/work")) {
                        SchoolWork sch = new SchoolWork(action1);
                    } else if (action2.equals("family/relationships")) {
                        FamilyRship fm = new FamilyRship(action1);
                    } else if (action2.equals("other")) {
                        Other oth = new Other(action1);
                    }else  {
                        System.out.println("          Please try again!");
                        System.out.println("          Which emotion resonates?");
                        System.out.println("          6.Contentment, 7.Boredom, 8.Annoyance, 9.Indifference, 10.Neutrality? (Do not add spaces or extra characters)");
                        String action1 = scanner.nextLine();
                        System.out.println("          Why are you feeling this way?");
                        System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                        String action2 = scanner.nextline().toLowerCase();
                    }
                }
            } else if (action.equals("8-10")) {
                System.out.println("        Which emotions resonate? Please type the number");
                System.out.println("        11.Joy  12.Gratitude  13.Love  14.Peace  15.Satisfaction? (Do not add spaces or extra characters)");
                String action1 = scanner.nextLine();
                System.out.println("          Why are you feeling this way?");
                System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                String action2 = scanner.nextline().toLowerCase();
                While (action1 && action2) {
                    if (action2.equals("appearances")) {
                        Appearences app = new Appearences(action1);
                    } else if (action2.equals("finances")) {
                        Finances fin = new Finances(action1);;
                    } else if (action2.equals("school/work")) {
                        SchoolWork sch = new SchoolWork(action1);
                    } else if (action2.equals("family/relationships")) {
                        FamilyRship fm = new FamilyRship(action1);
                    } else if (action2.equals("other")) {
                        Other oth = new Other(action1);
                    }else {
                        System.out.println("          Please try again!");
                        System.out.println("          Which emotion resonates?");
                        System.out.println("        11.Joy  12.Gratitude  13.Love  14.Peace  15.Satisfaction? (Do not add spaces or extra characters)");
                        String action1 = scanner.nextLine();
                        System.out.println("          Why are you feeling this way?");
                        System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                        String action2 = scanner.nextline().toLowerCase();
                    }
                }

            } else {
                System.out.println("          Please Try Again with the corrrect response!");                
                System.out.println("          How was your day?");
                System.out.println("          Rate your day as 0-4, 5-7, 8-10");
                System.out.println("          Again, please write it as "0-4" or "5-7" or "8-10"");
            }
        }
        
        
        
    }
}

