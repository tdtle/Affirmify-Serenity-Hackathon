import java.util.ArrayList;

public class Appearances {
  
  private ArrayList<String> content = new ArrayList<String>();

  public Appearances(){}

  public void appearances(String num) {
    System.out.println("Your daily Affirmify:");
    switch (num) {
      case "1":
        System.out.println("My self-worth is not determined by societal standards of beauty.");
        System.out.println("https://www.nationaleatingdisorders.org/ https://www.psychologytoday.com/ca/basics/body-image https://www.betterhelp.com/");
        this.content.add("My self-worth is not determined by societal standards of beauty.\n");
        break;
      case "2":
        System.out.println("I am enough just as I am.");
        System.out.println("https://www.nationaleatingdisorders.org/ https://www.psychologytoday.com/ca/basics/body-image https://www.betterhelp.com/");
        this.content.add("I am enough just as I am.\n");
        break;
      case "3":
        System.out.println("I am surrounded by love and understanding, which helps dissipate my anger.");
        System.out.println("https://www.nationaleatingdisorders.org/ https://www.psychologytoday.com/ca/basics/body-image https://www.betterhelp.com/");
        this.content.add("I am surrounded by love and understanding, which helps dissipate my anger.\n");
        break;
      case "4":
        System.out.println("I release the need to compare myself to others; I am unique and valuable.");
        System.out.println("https://www.nationaleatingdisorders.org/ https://www.psychologytoday.com/ca/basics/body-image https://www.betterhelp.com/");
        this.content.add("I release the need to compare myself to others; I am unique and valuable.\n");
        break;
      case "5":
        System.out.println("My beauty is a reflection of my inner strength and resilience.");
        System.out.println("https://www.nationaleatingdisorders.org/ https://www.psychologytoday.com/ca/basics/body-image https://www.betterhelp.com/");
        this.content.add("My beauty is a reflection of my inner strength and resilience.\n");
        break;
      case "6":
        System.out.println("I am present in my own life, engaged in the journey of self-discovery.");
        System.out.println("https://bodyimagemovement.com/ https://www.psychologytoday.com/ca/basics/body-image");
        this.content.add("I am present in my own life, engaged in the journey of self-discovery.\n");
        break;
      case "7":
        System.out.println("I am a masterpiece in progress, and I appreciate the artistry of my existence.");
        System.out.println("https://bodyimagemovement.com/ https://www.psychologytoday.com/ca/basics/body-image");
        this.content.add("I am a masterpiece in progress, and I appreciate the artistry of my existence.\n");
        break;
      case "8":
        System.out.println("I am deserving of self-love and acceptance just as I am right now.");
        System.out.println("https://bodyimagemovement.com/ https://www.psychologytoday.com/ca/basics/body-image");
        this.content.add("I am deserving of self-love and acceptance just as I am right now.\n");
        break;
      case "9":
        System.out.println(" I choose to see the beauty within me and acknowledge my worth.");
        System.out.println("https://bodyimagemovement.com/ https://www.psychologytoday.com/ca/basics/body-image");
        this.content.add(" I choose to see the beauty within me and acknowledge my worth.\n");
        break;
      case "10":
        System.out.println("I choose to see the value and uniqueness in who I am.");
        System.out.println("https://bodyimagemovement.com/ https://www.psychologytoday.com/ca/basics/body-image");
        this.content.add("I choose to see the value and uniqueness in who I am.\n");
        break;
      case "11":
        System.out.println("I am a magnet for joy, and I attract positivity into my life.");
        System.out.println("https://www.psychologytoday.com/ca/basics/body-image");
        this.content.add("I am a magnet for joy, and I attract positivity into my life.\n");
        break;
      case "12":
        System.out.println("Gratitude is a constant presence in my life, guiding my thoughts and actions.");
        System.out.println("https://www.psychologytoday.com/ca/basics/body-image");
        this.content.add("Gratitude is a constant presence in my life, guiding my thoughts and actions.\n");
        break;
      case "13":
        System.out.println("I am a channel of love, and it flows through me effortlessly.");
        System.out.println("https://www.psychologytoday.com/ca/basics/body-image");
        this.content.add("I am a channel of love, and it flows through me effortlessly.\n");
        break;
      case "14":
        System.out.println("I am at peace with my past, present, and future.");
        System.out.println("https://www.psychologytoday.com/ca/basics/body-image");
        this.content.add("I am at peace with my past, present, and future.\n");
        break;
      case "15":
        System.out.println(" I am content with where I am in life and excited about where I am going.");
        System.out.println("https://www.psychologytoday.com/ca/basics/body-image");
        this.content.add(" I am content with where I am in life and excited about where I am going.\n");
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
      System.out.println("          Would you like to add any thoughts to your APPERENCES log reflection today?\n          This can be what you are learning from your daily affirmations and how you've been achiving them, rather how you will.\n          YES or NO?");
    }

    public void Add(String content) {
      this.content.add("Personal Log: " + content + "\n");
    }
    
  }


