import java.util.ArrayList;
import java.util.Collections;

public class FamilyRship {
  
  private ArrayList<Content> content;

  public FamilyRship(String num) {
    System.out.println("Your daily Affirmify:");
    content = new Arraylist<Content>();
    switch (num) {
      case "1":
        System.out.println("I attract positive and supportive people into my life.");
        System.out.println("https://www.boundariesbooks.com/ https://www.youtube.com/@watchwellcast https://www.betterhelp.com/");
        content.add("I attract positive and supportive people into my life.\n");
        break;
      case "2":
        System.out.println(" I am deserving of love, kindness, and understanding.");
        System.out.println("https://www.boundariesbooks.com/ https://www.youtube.com/@watchwellcast https://www.betterhelp.com/");
        content.add(" I am deserving of love, kindness, and understanding.\n");
        break;
      case "3":
        System.out.println("I let go of resentment and embrace forgiveness.");
        System.out.println("https://www.boundariesbooks.com/ https://www.youtube.com/@watchwellcast https://www.betterhelp.com/");
        content.add("I let go of resentment and embrace forgiveness.\n");
        break;
      case "4":
        System.out.println("My past mistakes do not define my worth or my ability to grow.");
        System.out.println("https://www.boundariesbooks.com/ https://www.youtube.com/@watchwellcast https://www.betterhelp.com/");
        content.add("My past mistakes do not define my worth or my ability to grow.\n");
        break;
      case "5":
        System.out.println("I am not defined by my past; I am empowered by my present.");
        System.out.println("https://www.boundariesbooks.com/ https://www.youtube.com/@watchwellcast https://www.betterhelp.com/");
        content.add("I am not defined by my past; I am empowered by my present.\n");
        break 
      case "6":
        System.out.println("I actively invest time and effort into my relationships.");
        System.out.println("https://artonfoundation.bg/en/119.emotional-intelligence-in-love-and-relationships.html https://www.youtube.com/@watchwellcast");
        content.add("I actively invest time and effort into my relationships.\n");
        break;
      case "7":
        System.out.println("I choose to see my relationships with new eyes, appreciating the person they are becoming. Be proactive in planning activities and surprises.");
        System.out.println("https://artonfoundation.bg/en/119.emotional-intelligence-in-love-and-relationships.html https://www.youtube.com/@watchwellcast");
        content.add("I choose to see my relationships with new eyes, appreciating the person they are becoming. Be proactive in planning activities and surprises.\n");
        break;
      case "8":
        System.out.println("I choose to see the bigger picture, minimizing the impact of annoyances.");
        System.out.println("https://artonfoundation.bg/en/119.emotional-intelligence-in-love-and-relationships.html https://www.youtube.com/@watchwellcast");
        content.add("I choose to see the bigger picture, minimizing the impact of annoyances.\n");
        break;
      case "9":
        System.out.println("I communicate openly and honestly to strengthen my connections.");
        System.out.println("https://artonfoundation.bg/en/119.emotional-intelligence-in-love-and-relationships.html https://www.youtube.com/@watchwellcast");
        content.add("I communicate openly and honestly to strengthen my connections.\n");
        break;
      case "10":
        System.out.println("I am engaged in the dynamics of my relationships, seeking to understand and be understood.");
        System.out.println("https://artonfoundation.bg/en/119.emotional-intelligence-in-love-and-relationships.html https://www.youtube.com/@watchwellcast");
        content.add("I am engaged in the dynamics of my relationships, seeking to understand and be understood.\n");
        break;
      case "11":
        System.out.println("My life is filled with moments of pure and unbridled joy.");
        System.out.println("https://www.health.harvard.edu/staying-healthy/ways-to-keep-your-relationship-strong");
        content.add("My life is filled with moments of pure and unbridled joy.\n");
        break;
      case "12":
        System.out.println("My heart is filled with gratitude for the love and support I receive.");
        System.out.println("https://www.health.harvard.edu/staying-healthy/ways-to-keep-your-relationship-strong");
        content.add("My heart is filled with gratitude for the love and support I receive.\n");
        break;
      case "13":
        System.out.println("My relationships are a reflection of the love I hold within.");
        System.out.println("https://www.health.harvard.edu/staying-healthy/ways-to-keep-your-relationship-strong");
        content.add("My relationships are a reflection of the love I hold within.\n");
        break;
      case "14":
        System.out.println("My thoughts are clear, and my mind is a haven of peace.");
        System.out.println("https://www.health.harvard.edu/staying-healthy/ways-to-keep-your-relationship-strong");
        content.add("My thoughts are clear, and my mind is a haven of peace.\n");
        break;
      case "15":
        System.out.println("I am content with who I am, where I am, and where I am headed.");
        System.out.println("https://www.health.harvard.edu/staying-healthy/ways-to-keep-your-relationship-strong");
        content.add("I am content with who I am, where I am, and where I am headed.\n");
        break; 
    }

    public FamilyRship(String action, String temp) {
      for (int i = 1; i <= content.size(); i++) {
        System.out.println("Log " + i);
        System.out.println(this.content.get(i-1));
      }
      System.out.println("          Would you like to add any thoughts to your Family/Relationship log reflection today?\n          This can be what you are learning from your daily affirmations and how you've been achiving them, rather how you will.\n          YES or NO?");
    }

    public void Add(String content) {
      this.content.add("\nPersonal Log: " + content + "\n");  
    }

  }
}
