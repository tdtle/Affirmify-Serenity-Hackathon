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
        System.out.println("          Please write it as '0-4' or '5-7' or '8-10'");

        while (scanner.hasNextLine()) {
            String action = scanner.nextLine();

            if (action.equals("0-4")) {
                System.out.println("          Which emotion resonates? Please type the number.");
                System.out.println("          1.Unmotivated  2.Anxious  3.Anger  4.Shame  5.Sadness? (Do not add spaces or extra characters)");
                String action1 = scanner.nextLine();
                System.out.println("          Why are you feeling this way?");
                System.out.println("          'Appearances', 'Finances', 'School', 'Work', 'Family/Relationships', 'Other'.");
                String action2 = scanner.nextline().toLowerCase();
                While (action1 && action2) {
                    if (action2.equals("appearances")) {
                        Appearences app = new Appearences(action1);
                    } else if (action2.equals("finances")) {
                        Finances fin = new Finances(action1);;
                    } else if (action2.equals("school")) {
                        School sch = new School(action1);
                    } else if (action2.equals("work")) {
                        Work wrk = new Work(action1);
                    } else if (action2.equals("family/relationships")) {
                        FamilyRship fm = new FamilyRship(action1);
                    } else if (action2.equals("other")) {
                        Other oth = new Other(action1);
                    }else if (action1.equals(null) || action1.equals("") || action2.equals(null) || action2.equals("")) {
                        System.out.println("          Please try again!");
                        System.out.println("          Which emotion resonates?");
                        System.out.println("          1.Unmotivated  2.Anxious  3.Anger  4.Shame  5.Sadness? (Do not add spaces or extra characters)");
                        String action1 = scanner.nextLine();
                    }
                }
            
            } else if (action.equals("5-7")) {
                System.out.println("          Which emotions resonates?");
                System.out.println("          6.Contentment, 7.Boredom, 8.Annoyance, 9.Indifference, 10.Neutrality? (Do not add spaces or extra characters)");
                String action1 = scanner.nextLine();
                System.out.println("          Why are you feeling this way?");
                System.out.println("          Appearances, Finances, School, Work, Family/Relationships, Other.");
                String action2 = scanner.nextline().toLowerCase();
                While (action1 && action2) {
                    if (action2.equals("appearances")) {
                        Appearences app = new Appearences(action1);
                    } else if (action2.equals("finances")) {
                        Finances fin = new Finances(action1);;
                    } else if (action2.equals("school")) {
                        School sch = new School(action1);
                    } else if (action2.equals("work")) {
                        Work wrk = new Work(action1);
                    } else if (action2.equals("family/relationships")) {
                        FamilyRship fm = new FamilyRship(action1);
                    } else if (action2.equals("other")) {
                        Other oth = new Other(action1);
                    }else if (action1.equals(null) || action1.equals("") || action2.equals(null) || action2.equals("")) {
                        System.out.println("          Please try again!");
                        System.out.println("          Which emotion resonates?");
                        System.out.println("          1.Contentment, 2.Boredom, 3.Annoyance, 4.Indifference, 5.Neutrality? (Do not add spaces or extra characters)");
                        String action1 = scanner.nextLine();
                    }
                }
            } else if (action.equals("8-10")) {
                System.out.println("        Which emotions resonate? Please type the number");
                System.out.println("        11.Joy  12.Gratitude  13.Love  14.Peace  15.Satisfaction? (Do not add spaces or extra characters)");
                String action1 = scanner.nextLine();
                System.out.println("          Why are you feeling this way?");
                System.out.println("          Appearances, Finances, School, Work, Family/Relationships, Other.");
                String action2 = scanner.nextline().toLowerCase();
                While (action1 && action2) {
                    if (action2.equals("appearances")) {
                        Appearences app = new Appearences(action1);
                    } else if (action2.equals("finances")) {
                        Finances fin = new Finances(action1);;
                    } else if (action2.equals("school")) {
                        School sch = new School(action1);
                    } else if (action2.equals("work")) {
                        Work wrk = new Work(action1);
                    } else if (action2.equals("family/relationships")) {
                        FamilyRship fm = new FamilyRship(action1);
                    } else if (action2.equals("other")) {
                        Other oth = new Other(action1);
                    }else if (action1.equals(null) || action1.equals("") || action2.equals(null) || action2.equals("")) {
                        System.out.println("          Please try again!");
                        System.out.println("          Which emotion resonates?");
                        System.out.println("        1.Joy  2.Gratitude  3.Love  4.Peace  5.Satisfaction? (Do not add spaces or extra characters)");
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
