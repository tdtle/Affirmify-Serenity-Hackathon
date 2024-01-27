import java.util.ArrayList;
import java.util.Collections;

public class Appearances {
  
  private ArrayList<Content> content;

  public Appearances(String num) {
    System.out.println("Your daily Affirmify:");
    content = new Arraylist<Content>();
    switch (num) {
      case "1":
        System.out.println("My self-worth is not determined by societal standards of beauty.");
        System.out.println("https://www.nationaleatingdisorders.org/ https://www.psychologytoday.com/ca/basics/body-image https://www.betterhelp.com/");
        content.add("My self-worth is not determined by societal standards of beauty.");
        break;
      case "2":
        System.out.println("I am enough just as I am.");
        System.out.println("https://www.nationaleatingdisorders.org/ https://www.psychologytoday.com/ca/basics/body-image https://www.betterhelp.com/");
        content.add("I am enough just as I am.");
        break;
      case "3":
        System.out.println("I am surrounded by love and understanding, which helps dissipate my anger.");
        System.out.println("https://www.nationaleatingdisorders.org/ https://www.psychologytoday.com/ca/basics/body-image https://www.betterhelp.com/");
        content.add("I am surrounded by love and understanding, which helps dissipate my anger.");
        break;
      case "4":
        System.out.println("I release the need to compare myself to others; I am unique and valuable.");
        System.out.println("https://www.nationaleatingdisorders.org/ https://www.psychologytoday.com/ca/basics/body-image https://www.betterhelp.com/");
        content.add("I release the need to compare myself to others; I am unique and valuable.");
        break;
      case "5":
        System.out.println("My beauty is a reflection of my inner strength and resilience.");
        System.out.println("https://www.nationaleatingdisorders.org/ https://www.psychologytoday.com/ca/basics/body-image https://www.betterhelp.com/");
        content.add("My beauty is a reflection of my inner strength and resilience.");
        break 
      case "6":
        System.out.println("I am present in my own life, engaged in the journey of self-discovery.");
        content.add("I am present in my own life, engaged in the journey of self-discovery.");
        break;
      case "7":
        System.out.println("I am a masterpiece in progress, and I appreciate the artistry of my existence.");
        System.out.println("https://bodyimagemovement.com/ https://www.psychologytoday.com/ca/basics/body-image");
        content.add("I am a masterpiece in progress, and I appreciate the artistry of my existence.");
        break;
      case "8":
        System.out.println("I am deserving of self-love and acceptance just as I am right now.");
        System.out.println("https://bodyimagemovement.com/ https://www.psychologytoday.com/ca/basics/body-image");
        content.add("I am deserving of self-love and acceptance just as I am right now.");
        break;
      case "9":
        System.out.println(" I choose to see the beauty within me and acknowledge my worth.");
        System.out.println("https://bodyimagemovement.com/ https://www.psychologytoday.com/ca/basics/body-image");
        content.add(" I choose to see the beauty within me and acknowledge my worth.");
        break;
      case "10":
        System.out.println("I choose to see the value and uniqueness in who I am.");
        System.out.println("https://bodyimagemovement.com/ https://www.psychologytoday.com/ca/basics/body-image");
        content.add("I choose to see the value and uniqueness in who I am.");
        break;
      case "11":
        System.out.println("I am a magnet for joy, and I attract positivity into my life.");
        System.out.println("https://www.psychologytoday.com/ca/basics/body-image");
        content.add("I am a magnet for joy, and I attract positivity into my life.");
        break;
      case "12":
        System.out.println("Gratitude is a constant presence in my life, guiding my thoughts and actions.");
        System.out.println("https://www.psychologytoday.com/ca/basics/body-image");
        content.add("Gratitude is a constant presence in my life, guiding my thoughts and actions.");
        break;
      case "13":
        System.out.println("I am a channel of love, and it flows through me effortlessly.");
        System.out.println("https://www.psychologytoday.com/ca/basics/body-image");
        content.add("I am a channel of love, and it flows through me effortlessly.");
        break;
      case "14":
        System.out.println("I am at peace with my past, present, and future.");
        System.out.println("https://www.psychologytoday.com/ca/basics/body-image");
        content.add("I am at peace with my past, present, and future.");
        break;
      case "15":
        System.out.println(" I am content with where I am in life and excited about where I am going.");
        System.out.println("https://www.psychologytoday.com/ca/basics/body-image");
        content.add(" I am content with where I am in life and excited about where I am going.");
        break; 
    }

    public Apperences(String action, String temp) {
      for (int i = 1; i <= content.size(); i++) {
        System.out.println("Log " + i);
        System.out.println(content.get(i-1));
      }
      System.out.println("
    }
  }
}
