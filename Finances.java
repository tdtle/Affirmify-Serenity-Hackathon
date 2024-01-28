import java.util.ArrayList;

public class Finances {
  
  private ArrayList<String> content = new ArrayList<String>();


  public Finances(){};
  public void finances(String num) {
    System.out.println("Your daily Affirmify:");
    switch (num) {
      case "1":
        System.out.println("I am motivated by the vision of the success that awaits me.");
        content.add("I am motivated by the vision of the success that awaits me.\n");
        System.out.println("https://www.ynab.com/ https://www.kiplinger.com/ https://www.betterhelp.com/");
        break;
      case "2":
        System.out.println("I choose to focus on what I can control and let go of what I cannot.");
        content.add("I choose to focus on what I can control and let go of what I cannot.\n");
        System.out.println("https://www.ynab.com/ https://www.kiplinger.com/ https://www.betterhelp.com/");
        break;
      case "3":
        System.out.println("I am resilient in the face of frustration, and I choose a positive response.");
        content.add("I am resilient in the face of frustration, and I choose a positive response.\n");
        System.out.println("https://www.ynab.com/ https://www.kiplinger.com/ https://www.betterhelp.com/");
        break;
      case "4":
        System.out.println("I trust the journey, even when I do not understand it.");
        content.add("I trust the journey, even when I do not understand it.\n");
        System.out.println("https://www.ynab.com/ https://www.kiplinger.com/ https://www.betterhelp.com/");
        break;
      case "5":
        System.out.println(" I am worthy of all the good things life has to offer.");
        content.add(" I am worthy of all the good things life has to offer.\n");
        System.out.println("https://www.ynab.com/ https://www.kiplinger.com/ https://www.betterhelp.com/");
        break;
      case "6":
        System.out.println("Every day, I am taking steps toward a more secure financial future.");
        content.add("Every day, I am taking steps toward a more secure financial future.\n");
        System.out.println("https://goodbudget.com/ https://www.helpguide.org/articles/stress/coping-with-financial-stress.htm");
        break;
      case "7":
        System.out.println("Boredom is a signal to explore new activities and experiences, explore new financial opportunities.");
        content.add("Boredom is a signal to explore new activities and experiences, explore new financial opportunities.\n");
        System.out.println("https://goodbudget.com/ https://www.helpguide.org/articles/stress/coping-with-financial-stress.htm");
        break;
      case "8":
        System.out.println("I am grateful for the lessons hidden within moments of irritation.");
        content.add("I am grateful for the lessons hidden within moments of irritation.\n");
        System.out.println("https://goodbudget.com/ https://www.helpguide.org/articles/stress/coping-with-financial-stress.htm");
        break;
      case "9":
        System.out.println("I am grateful for the resources I have, and I use them wisely.");
        content.add("I am grateful for the resources I have, and I use them wisely.\n");
        System.out.println("https://goodbudget.com/ https://www.helpguide.org/articles/stress/coping-with-financial-stress.htm");
        break;
      case "10":
        System.out.println("I am grateful for the abundance that flows into my life, and I manage it wisely.");
        content.add("I am grateful for the abundance that flows into my life, and I manage it wisely.\n");
        System.out.println("https://goodbudget.com/ https://www.helpguide.org/articles/stress/coping-with-financial-stress.htm");
        break;
      case "11":
        System.out.println("Joy is the fuel for my soul, and I allow it to light up my life.");
        content.add("Joy is the fuel for my soul, and I allow it to light up my life.\n");
        System.out.println("https://goodbudget.com/");
        break;
      case "12":
        System.out.println("I am grateful for the abundance that surrounds me.");
        content.add("I am grateful for the abundance that surrounds me.\n");
        System.out.println("https://goodbudget.com/");
        break;
      case "13":
        System.out.println("Love and abundance are my birthrights, and I embrace them with gratitude.");
        content.add("Love and abundance are my birthrights, and I embrace them with gratitude.\n");
        System.out.println("https://goodbudget.com/");
        break;
      case "14":
        System.out.println("I let go of the need for control and surrender to the flow of life.");
        content.add("I let go of the need for control and surrender to the flow of life.\n");
        System.out.println("https://goodbudget.com/");
        break;
      case "15":
        System.out.println("I release the need for more and embrace the abundance of what I already have.");
        content.add("I release the need for more and embrace the abundance of what I already have.\n");
        System.out.println("https://goodbudget.com/");
        break;
      default:
        break;
    }
  }

    public void Access() {
      if (this.content.size() == 0) {
        System.out.println("          You SADLY have made no progress in this department bestie. :(\n          Good news is you still have time!");
      }

      for (int i = 1; i <= this.content.size(); i++) {
        System.out.println("Log " + i);
        System.out.println(this.content.get(i-1));
      }
      System.out.println("          Would you like to add any thoughts to your FINANCES log reflection today?\n          This can be what you are learning from your daily affirmations and how you've been achiving them, rather how you will.\n          YES or NO?");
    }

    public void Add(String content) {
      this.content.add("Personal Log: " + content + "\n");
    }

  }
