import java.util.ArrayList;

public class Other {
  
  private ArrayList<String> content = new ArrayList<String>();

  public Other(){};
  public void other(String num) {
    System.out.println("Your daily Affirmify:");
    switch (num) {
      case "1":
        System.out.println("My motivation is a reflection of my inner strength and resilience.");
        content.add("My motivation is a reflection of my inner strength and resilience.\n");
        System.out.println("https://www.betterhelp.com/ https://www.ted.com/talks/matthieu_ricard_the_h");
        break;
      case "2":
        System.out.println("I choose peace over worry and joy over fear.");
        content.add("I choose peace over worry and joy over fear.\n");
        System.out.println("https://www.betterhelp.com/ https://www.ted.com/talks/matthieu_ricard_the_h");
        break;
      case "3":
        System.out.println("I breathe in calmness, and I exhale anger.");
        content.add("I breathe in calmness, and I exhale anger.\n");
        System.out.println("https://www.betterhelp.com/ https://www.ted.com/talks/matthieu_ricard_the_h");
        break;
      case "4":
        System.out.println("Shame does not control me; I am in control of how I respond and grow from it.");
        content.add("Shame does not control me; I am in control of how I respond and grow from it.\n");
        System.out.println("https://www.betterhelp.com/ https://www.ted.com/talks/matthieu_ricard_the_h");
        break;
      case "5":
        System.out.println("I am in charge of my own happiness, and I choose to be happy.");
        content.add("I am in charge of my own happiness, and I choose to be happy.\n");
        System.out.println("https://www.betterhelp.com/ https://www.ted.com/talks/matthieu_ricard_the_h");
        break;
      case "6":
        System.out.println("My life has purpose, and I actively contribute to it.");
        content.add("My life has purpose, and I actively contribute to it.\n");
        System.out.println("https://positivepsychology.com/how-to-be-happy/");
        break;
      case "7":
        System.out.println("Boredom is an opportunity for creativity, and I embrace it.");
        content.add("Boredom is an opportunity for creativity, and I embrace it.\n");
        System.out.println("https://positivepsychology.com/how-to-be-happy/");
        break;
      case "8":
        System.out.println("I am open to finding solutions rather than dwelling on annoyances.");
        content.add("I am open to finding solutions rather than dwelling on annoyances.\n");
        System.out.println("https://positivepsychology.com/how-to-be-happy/");
        break;
      case "9":
        System.out.println("I release the habit of indifference and embrace a positive connection with myself.");
        content.add("I release the habit of indifference and embrace a positive connection with myself.\n");
        System.out.println("https://positivepsychology.com/how-to-be-happy/");
        break;
      case "10":
        System.out.println("I appreciate and celebrate my strengths and accomplishments.");
        content.add("I appreciate and celebrate my strengths and accomplishments.\n");
        System.out.println("https://positivepsychology.com/how-to-be-happy/");
        break;
      case "11":
        System.out.println("I am in tune with the rhythm of joy, and I dance through life with a joyful heart.");
        content.add("I am in tune with the rhythm of joy, and I dance through life with a joyful heart.\n");
        System.out.println("https://greatergood.berkeley.edu/podcasts/series/the_science_of_happiness%C2%A0");
        break;
      case "12":
        System.out.println("Today, I choose to focus on what I have rather than what I lack.");
        content.add("Today, I choose to focus on what I have rather than what I lack.\n");
        System.out.println("https://greatergood.berkeley.edu/podcasts/series/the_science_of_happiness%C2%A0");
        break;
      case "13":
        System.out.println("I attract love by being my authentic and genuine self.");
        content.add("I attract love by being my authentic and genuine self.\n");
        System.out.println("https://greatergood.berkeley.edu/podcasts/series/the_science_of_happiness%C2%A0");
        break;
      case "14":
        System.out.println("Today, I choose peace over worry, and I carry this peace into tomorrow.");
        content.add("Today, I choose peace over worry, and I carry this peace into tomorrow.\n");
        System.out.println("https://greatergood.berkeley.edu/podcasts/series/the_science_of_happiness%C2%A0");
        break;
      case "15":
        System.out.println("Satisfaction flows through me, enhancing my overall well-being.");
        content.add("Satisfaction flows through me, enhancing my overall well-being.\n");
        System.out.println("https://greatergood.berkeley.edu/podcasts/series/the_science_of_happiness%C2%A0");
        break;
      default:
        break;
    }
  }

    public void Access() {
      if (this.content.size() == 0) {
        System.out.println("          You SADLY have made no progress in this department bestie. :(\n          Good news is you still have time!");
      }

      for (int i = 1; i <= content.size(); i++) {
        System.out.println("Log " + i);
        System.out.println(this.content.get(i-1));
      }
      System.out.println("          Would you like to add any thoughts to your Other log reflection today?\n          This can be what you are learning from your daily affirmations and how you've been achiving them, rather how you will.\n          YES or NO?");
    }

    public void Add(String content) {
      this.content.add("Personal Log: " + content + "\n");
    }


}
