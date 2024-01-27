import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("          How was your day?");
        System.out.println("          Rate your day as 0-4, 5-7, 8-10");
        System.out.println("          Type -1 and press enter to END Affirmify   OR   type 0 to skip the talking about your emotions part.");
        System.out.println("          Please write it as '0-4' or '5-7' or '8-10' or '0' or '-1'");

        while (scanner.hasNextLine()) {
            String action = scanner.nextLine();

            if (action.equals("0-4")) {
                System.out.println("          Which emotion resonates? Please type the number.");
                System.out.println("          1.Unmotivated  2.Anxious  3.Anger  4.Shame  5.Sadness? (Do not add spaces or extra characters)");
                String action1 = scanner.nextLine();
                System.out.println("          Why are you feeling this way?");
                System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                String action2 = scanner.nextLine().toLowerCase();

                while (action1 != null && action2 != null) {
                    if (action2.equals("appearances")) {
                        Appearences app = new Appearences(action1);
                        break;
                    } else if (action2.equals("finances")) {
                        Finances fin = new Finances(action1);
                        break;
                    } else if (action2.equals("school/work")) {
                        SchoolWork sch = new SchoolWork(action1);
                        break;
                    } else if (action2.equals("family/relationships")) {
                        FamilyRship fm = new FamilyRship(action1);
                        break;
                    } else if (action2.equals("other")) {
                        Other oth = new Other(action1);
                        break;
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
                String action2 = scanner.nextLine().toLowerCase();
                while (action1 != null && action2 != null) {
                    if (action2.equals("appearances")) {
                        Appearences app = new Appearences(action1);
                        break;
                    } else if (action2.equals("finances")) {
                        Finances fin = new Finances(action1);
                        break;
                    } else if (action2.equals("school/work")) {
                        SchoolWork sch = new SchoolWork(action1);
                        break;
                    } else if (action2.equals("family/relationships")) {
                        FamilyRship fm = new FamilyRship(action1);
                        break;
                    } else if (action2.equals("other")) {
                        Other oth = new Other(action1);
                        break;
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
                System.out.println("          Which emotions resonate? Please type the number");    
                System.out.println("          11.Joy  12.Gratitude  13.Love  14.Peace  15.Satisfaction? (Do not add spaces or extra characters)");
                String action1 = scanner.nextLine();
                System.out.println("          Why are you feeling this way?");
                System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                String action2 = scanner.nextLine().toLowerCase();
                while (action1 != null && action2 != null) {
                    if (action2.equals("appearances")) {
                        Appearences app = new Appearences(action1);
                        break;
                    } else if (action2.equals("finances")) {
                        Finances fin = new Finances(action1);
                        break;
                    } else if (action2.equals("school/work")) {
                        SchoolWork sch = new SchoolWork(action1);
                        break;
                    } else if (action2.equals("family/relationships")) {
                        FamilyRship fm = new FamilyRship(action1);
                        break;
                    } else if (action2.equals("other")) {
                        Other oth = new Other(action1);
                        break;
                    }else {
                        System.out.println("          Please try again!");
                        System.out.println("          Which emotion resonates?");                      
                        System.out.println("          11.Joy  12.Gratitude  13.Love  14.Peace  15.Satisfaction? (Do not add spaces or extra characters)");
                        String action1 = scanner.nextLine();
                        System.out.println("          Why are you feeling this way?");
                        System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                        String action2 = scanner.nextline().toLowerCase();
                    }
                }

            } else if (action.equals("0")) {
                System.out.println("          Would you like to see your progress in whats been causing your feelings lately.\n          Choose from 0-5:\n          0.END Affirmify, 1.Appearences, 2.Finances, 3.School/Work, 4. Family/Relationships, 5.Other");
                String action1 = scanner.nextLine();
                if (action1.equals("1")) {
                    Appearences app = new Appearences(action1, "print");
                    String action2 = scanner.nextLine().toLowerCase();
                    if (action2.equals("yes")) 
                    {
                        System.out.println("Please enter your personal log: ");
                        String action3 = scanner.nextLine();
                        app.Add(action3);
                    }
                } else if (action2.equals("2")) {
                    Finances fin = new Finances(action1, "print");
                    String action2 = scanner.nextLine().toLowerCase();
                    if (action2.equals("yes")) 
                    {
                        System.out.println("Please enter your personal log: ");
                        String action3 = scanner.nextLine();
                        fin.Add(action3);
                    }
                } else if (action2.equals("3")) {
                    SchoolWork sch = new SchoolWork(action1, "print");
                    String action2 = scanner.nextLine().toLowerCase();
                    if (action2.equals("yes")) 
                    {
                        System.out.println("Please enter your personal log: ");
                        String action3 = scanner.nextLine();
                        sch.Add(action3);
                    }
                } else if (action2.equals("4")) {
                    FamilyRship fm = new FamilyRship(action1, "print");
                    String action2 = scanner.nextLine().toLowerCase();
                    if (action2.equals("yes")) 
                    {
                        System.out.println("Please enter your personal log: ");
                        String action3 = scanner.nextLine();
                        fm.Add(action3);
                    }
                } else if (action2.equals("5")) {
                    Other oth = new Other(action1, "print");
                    String action2 = scanner.nextLine().toLowerCase();
                    if (action2.equals("yes")) 
                    {
                        System.out.println("Please enter your personal log: ");
                        String action3 = scanner.nextLine();
                        oth.Add(action3);
                    }
                }else if (action2.equals("0")) {
                    System.out.println("          Thanks for joining Affirmify today! Hope to see you and your mental health tomorow! :)");
                    break outerloop;
                }
            } else if (action.equals("-1")) {
                System.out.println("          Thanks for joining Affirmify today! Hope to see you and your mental health tomorow! :)");
                break outerloop;
            } else {
                System.out.println("          Please Try Again with the corrrect response!");                
                System.out.println("          How was your day?");
                System.out.println("          Rate your day as 0-4, 5-7, 8-10");
                System.out.println("          Type -1 and press enter to END Affirmify or type 0 to skip the talking about your emotions part.");
                System.out.println("          Don't forget to write it as '0-4' or '5-7' or '8-10' :)");
            }
        }
        
        
        
    }
}

