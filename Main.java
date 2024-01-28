import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("\nWELCOME TO DAILY AFFIRMATIONS FROM YOUR BESTIE, AFFIRMIFY!\n");

        Appearances app = new Appearances();
        Finances fin = new Finances();
        SchoolWork sch = new SchoolWork();
        FamilyRship fm = new FamilyRship();
        Other oth = new Other();

        Scanner scanner = new Scanner(System.in);
        System.out.println("          How was your day?");
        System.out.println("          Rate your day from 1-10");
        System.out.println("          Type -1 and press enter to END Affirmify   OR   type 0 to skip the talking about your emotions part.");

        outerloop:
        while (scanner.hasNextLine()) {
            int action = Integer.parseInt(scanner.nextLine());

            if (action >= 1 && action <= 4) {
                System.out.println("          Which emotion resonates? Please type the number.");
                System.out.println("          1.Unmotivated  2.Anxious  3.Anger  4.Shame  5.Sadness? (Do not add spaces or extra characters)");
                String action1 = scanner.nextLine();

                if (action1.equals("1") || action1.equals("2") || action1.equals("3") || action1.equals("4") || action1.equals("5")) {
                } else {
                    System.out.println("          Please try again and enter the correct number");
                    System.out.println("          Which emotion resonates? Please type the number.");
                    System.out.println("          1.Unmotivated  2.Anxious  3.Anger  4.Shame  5.Sadness? (Do not add spaces or extra characters)");
                    action1 = scanner.nextLine();
                }

                System.out.println("          Why are you feeling this way?");
                System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                String action2 = scanner.nextLine().toLowerCase();

                if (action2.equals("appearances") || action2.equals("finances") || action2.equals("school/work") || action2.equals("family/relationships") || action2.equals("other")) {
                } else {
                    System.out.println("          Please try again and enter the correct input");
                    System.out.println("          Why are you feeling this way?");
                    System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                    action2 = scanner.nextLine().toLowerCase();
                }

                while (action1 != null && action2 != null) {
                    if (action2.equals("appearances")) {
                        app.appearances(action1);
                        break;
                    } else if (action2.equals("finances")) {
                        fin.finances(action1);
                        break;
                    } else if (action2.equals("school/work")) {
                        sch.schoolwork(action1);
                        break;
                    } else if (action2.equals("family/relationships")) {
                        fm.familyrship(action1);
                        break;
                    } else if (action2.equals("other")) {
                        oth.other(action1);
                        break;
                    } else {
                        System.out.println("          Please try again!");
                        System.out.println("          Which emotion resonates?");
                        System.out.println("          1.Unmotivated  2.Anxious  3.Anger  4.Shame  5.Sadness? (Do not add spaces or extra characters)");
                        action1 = scanner.nextLine();
                        System.out.println("          Why are you feeling this way?");
                        System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                        action2 = scanner.nextLine().toLowerCase();
                    }

                }

            } else if (action >= 5 && action <= 7) {
                System.out.println("          Which emotions resonates? Please type a number!");
                System.out.println("          6.Contentment, 7.Boredom, 8.Annoyance, 9.Indifference, 10.Neutrality? (Do not add spaces or extra characters)");
                String action1 = scanner.nextLine();

                if (action1.equals("6") || action1.equals("7") || action1.equals("8") || action1.equals("9") || action1.equals("10")) {
                } else {
                    System.out.println("          Please try again and enter the coorect number");
                    System.out.println("          Which emotion resonates? Please type the number.");
                    System.out.println("          6.Contentment, 7.Boredom, 8.Annoyance, 9.Indifference, 10.Neutrality? (Do not add spaces or extra characters)");
                    action1 = scanner.nextLine();
                }

                System.out.println("          Why are you feeling this way?");
                System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                String action2 = scanner.nextLine().toLowerCase();

                if (action2.equals("appearances") || action2.equals("finances") || action2.equals("school/work") || action2.equals("family/relationships") || action2.equals("other")) {
                } else {
                    System.out.println("          Please try again and enter the correct input");
                    System.out.println("          Why are you feeling this way?");
                    System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                    action2 = scanner.nextLine().toLowerCase();
                }

                while (action1 != null && action2 != null) {
                    if (action2.equals("appearances")) {
                        app.appearances(action1);
                        break;
                    } else if (action2.equals("finances")) {
                        fin.finances(action1);
                        break;
                    } else if (action2.equals("school/work")) {
                        sch.schoolwork(action1);
                        break;
                    } else if (action2.equals("family/relationships")) {
                        fm.familyrship(action1);
                        break;
                    } else if (action2.equals("other")) {
                        oth.other(action1);
                        break;
                    } else {
                        System.out.println("          Please try again!");
                        System.out.println("          Which emotion resonates? Please type the number!");
                        System.out.println("          6.Contentment, 7.Boredom, 8.Annoyance, 9.Indifference, 10.Neutrality? (Do not add spaces or extra characters)");
                        action1 = scanner.nextLine();
                        System.out.println("          Why are you feeling this way?");
                        System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                        action2 = scanner.nextLine().toLowerCase();
                    }
                }
            } else if (action >= 8 && action <= 10) {
                System.out.println("          Which emotions resonate? Please type the number");
                System.out.println("          11.Joy  12.Gratitude  13.Love  14.Peace  15.Satisfaction? (Do not add spaces or extra characters)");
                String action1 = scanner.nextLine();

                if (action1.equals("11") || action1.equals("12") || action1.equals("13") || action1.equals("14") || action1.equals("15")) {
                } else {
                    System.out.println("          Please try again and enter the correct number");
                    System.out.println("          Which emotion resonates? Please type the number.");
                    System.out.println("          11.Joy  12.Gratitude  13.Love  14.Peace  15.Satisfaction? (Do not add spaces or extra characters)");
                    action1 = scanner.nextLine();
                }

                System.out.println("          Why are you feeling this way?");
                System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                String action2 = scanner.nextLine().toLowerCase();

                if (action2.equals("appearances") || action2.equals("finances") || action2.equals("school/work") || action2.equals("family/relationships") || action2.equals("other")) {
                } else {
                    System.out.println("          Please try again and enter the correct input");
                    System.out.println("          Why are you feeling this way?");
                    System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                    action2 = scanner.nextLine().toLowerCase();
                }

                while (action1 != null && action2 != null) {
                    if (action2.equals("appearances")) {
                        app.appearances(action1);
                        break;
                    } else if (action2.equals("finances")) {
                        fin.finances(action1);
                        break;
                    } else if (action2.equals("school/work")) {
                        sch.schoolwork(action1);
                        break;
                    } else if (action2.equals("family/relationships")) {
                        fm.familyrship(action1);
                        break;
                    } else if (action2.equals("other")) {
                        oth.other(action1);
                        break;
                    } else {
                        System.out.println("          Please try again!");
                        System.out.println("          Which emotion resonates? Please type a number!");
                        System.out.println("          11.Joy  12.Gratitude  13.Love  14.Peace  15.Satisfaction? (Do not add spaces or extra characters)");
                        action1 = scanner.nextLine();
                        System.out.println("          Why are you feeling this way?");
                        System.out.println("          'Appearances', 'Finances', 'School/Work', 'Family/Relationships', 'Other'");
                        action2 = scanner.nextLine().toLowerCase();
                    }
                }

            } else if (action == 0) {
                System.out.println("          Hey again bestie, so since you did not want to talk about how your feeling right now.\n          Why don't we take a look at the progress you've made with one of your journals. If you do not want to, choose 0.\n          Choose from 0-5:\n          0. No, 1.Appearances, 2.Finances, 3.School/Work, 4. Family/Relationships, 5.Other");
                String action1 = scanner.nextLine();
                while (action1 != null) {

                    if (action1.equals("1")) {
                        System.out.println("Your current Appearances log is...");
                        app.Access();
                        String action2 = scanner.nextLine().toLowerCase();
                        if (action2.equals("yes")) {
                            System.out.println("Please enter your personal log: ");
                            String action3 = scanner.nextLine();
                            app.Add(action3);
                        } else if (action2.equals("no")) {
                            System.out.println("          Would you like to continue today? Yes or No?");
                            String actiontemp = scanner.nextLine().toLowerCase();
                            if (actiontemp.equals("yes")) {
                                System.out.println("          Hello Again!");
                                System.out.println("          Give your day another rating bestie --> 1-10");
                                System.out.println("          Type -1 and press enter to END Affirmify      OR      Type 0 and press enter to skip the talking about your emotions part.");
                                continue outerloop;
                            } else if (actiontemp.equals("no")) {
                                System.out.println("Hope to see you tomorrow!");
                                break outerloop;
                            }

                        } else {
                            System.out.println("          Hey again bestie, so since you did not want to talk about how your feeling right now.\n          Why don't we take a look at the progress you've made with one of your journals. If you do not want to, choose 0.\n          Choose from 0-5:\n          0. No, 1.Appearances, 2.Finances, 3.School/Work, 4. Family/Relationships, 5.Other");
                            action1 = scanner.nextLine();
                            continue;
                        }
                        action1 = null;
                    } else if (action1.equals("2")) {
                        fin.Access();
                        String action2 = scanner.nextLine().toLowerCase();
                        if (action2.equals("yes")) {
                            System.out.println("Please enter your personal log: ");
                            String action3 = scanner.nextLine();
                            fin.Add(action3);
                        } else if (action2.equals("no")) {
                            System.out.println("          Would you like to continue today? Yes or No?");
                            String actiontemp = scanner.nextLine().toLowerCase();
                            if (actiontemp.equals("yes")) {
                                System.out.println("          Hello Again!");
                                System.out.println("          Give your day another rating bestie --> 1-10");
                                System.out.println("          Type -1 and press enter to END Affirmify      OR      Type 0 and press enter to skip the talking about your emotions part.");
                                continue outerloop;
                            } else if (actiontemp.equals("no")) {
                                System.out.println("Hope to see you tomorrow!");
                                break outerloop;
                            }

                        } else {
                            System.out.println("          Hey again bestie, so since you did not want to talk about how your feeling right now.\n          Why don't we take a look at the progress you've made with one of your journals. If you do not want to, choose 0.\n          Choose from 0-5:\n          0. No, 1.Appearances, 2.Finances, 3.School/Work, 4. Family/Relationships, 5.Other");
                            action1 = scanner.nextLine();
                            continue;
                        }
                        action1 = null;
                    } else if (action1.equals("3")) {
                        sch.Access();
                        String action2 = scanner.nextLine().toLowerCase();
                        if (action2.equals("yes")) {
                            System.out.println("Please enter your personal log: ");
                            String action3 = scanner.nextLine();
                            sch.Add(action3);
                        } else if (action2.equals("no")) {
                            System.out.println("          Would you like to continue today? Yes or No?");
                            String actiontemp = scanner.nextLine().toLowerCase();
                            if (actiontemp.equals("yes")) {
                                System.out.println("          Hello Again!");
                                System.out.println("          Give your day another rating bestie --> 1-10");
                                System.out.println("          Type -1 and press enter to END Affirmify      OR      Type 0 and press enter to skip the talking about your emotions part.");
                                continue outerloop;
                            } else if (actiontemp.equals("no")) {
                                System.out.println("Hope to see you tomorrow!");
                                break outerloop;
                            }

                        } else {
                            System.out.println("          Hey again bestie, so since you did not want to talk about how your feeling right now.\n          Why don't we take a look at the progress you've made with one of your journals. If you do not want to, choose 0.\n          Choose from 0-5:\n          0. No, 1.Appearances, 2.Finances, 3.School/Work, 4. Family/Relationships, 5.Other");
                            action1 = scanner.nextLine();
                            continue;
                        }
                        action1 = null;
                    } else if (action1.equals("4")) {
                        fm.Access();
                        String action2 = scanner.nextLine().toLowerCase();
                        if (action2.equals("yes")) {
                            System.out.println("Please enter your personal log: ");
                            String action3 = scanner.nextLine();
                            fm.Add(action3);
                        } else if (action2.equals("no")) {
                            System.out.println("          Would you like to continue today? Yes or No?");
                            String actiontemp = scanner.nextLine().toLowerCase();
                            if (actiontemp.equals("yes")) {
                                System.out.println("          Hello Again!");
                                System.out.println("          Give your day another rating bestie --> 1-10");
                                System.out.println("          Type -1 and press enter to END Affirmify      OR      Type 0 and press enter to skip the talking about your emotions part.");
                                continue outerloop;
                            } else if (actiontemp.equals("no")) {
                                System.out.println("Hope to see you tomorrow!");
                                break outerloop;
                            }

                        } else {
                            System.out.println("          Hey again bestie, so since you did not want to talk about how your feeling right now.\n          Why don't we take a look at the progress you've made with one of your journals. If you do not want to, choose 0.\n          Choose from 0-5:\n          0. No, 1.Appearances, 2.Finances, 3.School/Work, 4. Family/Relationships, 5.Other");
                            action1 = scanner.nextLine();
                            continue;
                        }
                        action1 = null;
                    } else if (action1.equals("5")) {
                        oth.Access();
                        String action2 = scanner.nextLine().toLowerCase();
                        if (action2.equals("yes")) {
                            System.out.println("Please enter your personal log: ");
                            String action3 = scanner.nextLine();
                            oth.Add(action3);
                        } else if (action2.equals("no")) {
                            System.out.println("          Would you like to continue today? Yes or No?");
                            String actiontemp = scanner.nextLine().toLowerCase();
                            if (actiontemp.equals("yes")) {
                                System.out.println("          Hello Again!");
                                System.out.println("          Give your day another rating bestie --> 1-10");
                                System.out.println("          Type -1 and press enter to END Affirmify      OR      Type 0 and press enter to skip the talking about your emotions part.");
                                continue outerloop;
                            } else if (actiontemp.equals("no")) {
                                System.out.println("Hope to see you tomorrow!");
                                break outerloop;
                            }

                        } else {
                            System.out.println("          Hey again bestie, so since you did not want to talk about how your feeling right now.\n          Why don't we take a look at the progress you've made with one of your journals. If you do not want to, choose 0.\n          Choose from 0-5:\n          0. No, 1.Appearances, 2.Finances, 3.School/Work, 4. Family/Relationships, 5.Other");
                            action1 = scanner.nextLine();
                            continue;
                        }
                        action1 = null;
                    } else if (action1.equals("0")) {
                        action1 = null;
                    } else {
                        System.out.println("          Error, Please choose from 1-5:");
                        action1 = scanner.nextLine();
                    }
                }
            } else if (action == -1) {
                System.out.println("          Thanks for joining Affirmify today! Hope to see you and your mental health tomorow! :)");
                break outerloop;
            } else {
                System.out.println("          Please try Again with the correct response!");
                System.out.println("          How was your day?");
                System.out.println("          Rate your day from 1-10");
                System.out.println("          Type -1 and press enter to END Affirmify or type 0 to skip the talking about your emotions part. :|");
                continue outerloop;
            }

            if (action != 0) {
                System.out.println();
                System.out.println("          Would you like to delve in deeper and take a look at your progress with one of your journals? If so which one?\n          Please choose from 1-5:\n          0. No, 1.Appearances, 2.Finances, 3.School/Work, 4. Family/Relationships, 5.Other");
                String action1 = scanner.nextLine();
                while (action1 != null) {

                    if (action1.equals("1")) {
                        System.out.println("Your current Appearances log is...");
                        app.Access();
                        String action2 = scanner.nextLine().toLowerCase();
                        if (action2.equals("yes")) {
                            System.out.println("Please enter your personal log: ");
                            String action3 = scanner.nextLine();
                            app.Add(action3);
                        } else if (action2.equals("no")) {
                            System.out.println("          Would you like to continue today? Yes or No?");
                            String actiontemp = scanner.nextLine().toLowerCase();
                            if (actiontemp.equals("yes")) {
                                System.out.println("          Hello Again!");
                                System.out.println("          Give your day another rating bestie --> 1-10");
                                System.out.println("          Type -1 and press enter to END Affirmify      OR      Type 0 and press enter to skip the talking about your emotions part.");
                                continue outerloop;
                            } else if (actiontemp.equals("no")) {
                                System.out.println("Hope to see you tomorrow!");
                                break outerloop;
                            }
                        } else {
                            System.out.println("          Would you like to delve in deeper and take a look at your progress with one of your journals? If so which one?\n          Choose from 0-5:\n          0. No, 1.Appearances, 2.Finances, 3.School/Work, 4. Family/Relationships, 5.Other");
                            action1 = scanner.nextLine();
                            continue;
                        }
                        action1 = null;
                    } else if (action1.equals("2")) {
                        fin.Access();
                        String action2 = scanner.nextLine().toLowerCase();
                        if (action2.equals("yes")) {
                            System.out.println("Please enter your personal log: ");
                            String action3 = scanner.nextLine();
                            fin.Add(action3);
                        } else if (action2.equals("no")) {
                            System.out.println("          Would you like to continue today? Yes or No?");
                            String actiontemp = scanner.nextLine().toLowerCase();
                            if (actiontemp.equals("yes")) {
                                System.out.println("          Hello Again!");
                                System.out.println("          Give your day another rating bestie --> 1-10");
                                System.out.println("          Type -1 and press enter to END Affirmify      OR      Type 0 and press enter to skip the talking about your emotions part.");
                                continue outerloop;
                            } else if (actiontemp.equals("no")) {
                                System.out.println("Hope to see you tomorrow!");
                                break outerloop;
                            }

                        } else {
                            System.out.println("          Would you like to delve in deeper and take a look at your progress with one of your journals? If so which one?\n          Please choose from 0-5:\n          0. No, 1.Appearances, 2.Finances, 3.School/Work, 4. Family/Relationships, 5.Other");
                            action1 = scanner.nextLine();
                            continue;
                        }
                        action1 = null;
                    } else if (action1.equals("3")) {
                        sch.Access();
                        String action2 = scanner.nextLine().toLowerCase();
                        if (action2.equals("yes")) {
                            System.out.println("Please enter your personal log: ");
                            String action3 = scanner.nextLine();
                            sch.Add(action3);
                        } else if (action2.equals("no")) {
                            System.out.println("          Would you like to continue today? Yes or No?");
                            String actiontemp = scanner.nextLine().toLowerCase();
                            if (actiontemp.equals("yes")) {
                                System.out.println("          Hello Again!");
                                System.out.println("          Give your day another rating bestie --> 1-10");
                                System.out.println("          Type -1 and press enter to END Affirmify      OR      Type 0 and press enter to skip the talking about your emotions part.");
                                continue outerloop;
                            } else if (actiontemp.equals("no")) {
                                System.out.println("Hope to see you tomorrow!");
                                break outerloop;
                            }

                        } else {
                            System.out.println("          Would you like to delve in deeper and take a look at your progress with one of your journals? If so which one?\n          Please choose from 0-5:\n          0. No, 1.Appearances, 2.Finances, 3.School/Work, 4. Family/Relationships, 5.Other");
                            action1 = scanner.nextLine();
                            continue;
                        }
                        action1 = null;
                    } else if (action1.equals("4")) {
                        fm.Access();
                        String action2 = scanner.nextLine().toLowerCase();
                        if (action2.equals("yes")) {
                            System.out.println("Please enter your personal log: ");
                            String action3 = scanner.nextLine();
                            fm.Add(action3);
                        } else if (action2.equals("no")) {
                            System.out.println("          Would you like to continue today? Yes or No?");
                            String actiontemp = scanner.nextLine().toLowerCase();
                            if (actiontemp.equals("yes")) {
                                System.out.println("          Hello Again!");
                                System.out.println("          Give your day another rating bestie --> 1-10");
                                System.out.println("          Type -1 and press enter to END Affirmify      OR      Type 0 and press enter to skip the talking about your emotions part.");
                                continue outerloop;
                            } else if (actiontemp.equals("no")) {
                                System.out.println("Hope to see you tomorrow!");
                                break outerloop;
                            }

                        } else {
                            System.out.println("          Would you like to delve in deeper and take a look at your progress with one of your journals? If so which one?\n          Please choose from 0-5:\n          0. No, 1.Appearances, 2.Finances, 3.School/Work, 4. Family/Relationships, 5.Other");
                            action1 = scanner.nextLine();
                            continue;
                        }
                        action1 = null;
                    } else if (action1.equals("5")) {
                        oth.Access();
                        String action2 = scanner.nextLine().toLowerCase();
                        if (action2.equals("yes")) {
                            System.out.println("Please enter your personal log: ");
                            String action3 = scanner.nextLine();
                            oth.Add(action3);
                        } else if (action2.equals("no")) {
                            System.out.println("          Would you like to continue today? Yes or No?");
                            String actiontemp = scanner.nextLine().toLowerCase();
                            if (actiontemp.equals("yes")) {
                                System.out.println("          Hello Again!");
                                System.out.println("          Give your day another rating bestie --> 1-10");
                                System.out.println("          Type -1 and press enter to END Affirmify      OR      Type 0 and press enter to skip the talking about your emotions part.");
                                continue outerloop;
                            } else if (actiontemp.equals("no")) {
                                System.out.println("Hope to see you tomorrow!");
                                break outerloop;
                            }

                        } else {
                            System.out.println("          Would you like to delve in deeper and take a look at your progress with one of your journals? If so which one?\n          Please choose from 0-5:\n          0. No, 1.Appearances, 2.Finances, 3.School/Work, 4. Family/Relationships, 5.Other");
                            action1 = scanner.nextLine();
                            continue;
                        }
                        action1 = null;
                    } else if (action1.equals("0")) {
                        action1 = null;
                    } else {
                        System.out.println("          Error, Please choose from 1-5:");
                        action1 = scanner.nextLine();
                    }
                }
            }

            System.out.println("          Would you like to continue today? Yes or No?");
            String actiontemp = scanner.nextLine().toLowerCase();
            if (actiontemp.equals("yes")) {
                System.out.println("          Hello Again!");
                System.out.println("          Give your day another rating bestie --> 1-10");
                System.out.println("          Type -1 and press enter to END Affirmify      OR      Type 0 and press enter to skip the talking about your emotions part.");
            } else if (actiontemp.equals("no")) {
                System.out.println("          Thanks for joining Affirmify today! Hope to see you and your mental health tomorrow! :)");
                System.exit(0);
            }

        }
    }

}
