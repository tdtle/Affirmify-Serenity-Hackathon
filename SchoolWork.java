import java.util.ArrayList;

public class SchoolWork {

  private ArrayList<String> content = new ArrayList<String>();

  public SchoolWork(){};
  public void schoolwork(String num) {
    System.out.println("Your daily Affirmify:");
    switch (num) {
      case "1":
        System.out.println("I am inspired and energized by the possibilities ahead of me.");
        System.out.println("https://www.themuse.com/ https://www.peardeck.com/products/pear-deck-tutor https://noc.esdc.gc.ca/CareerHandbook/ChWelcome  https://www.betterhelp.com/");
        content.add("I am inspired and energized by the possibilities ahead of me.\n");
        break;
      case "2":
        System.out.println(" I am capable of handling whatever comes my way.");
        System.out.println("https://www.themuse.com/ https://www.peardeck.com/products/pear-deck-tutor https://noc.esdc.gc.ca/CareerHandbook/ChWelcome  https://www.betterhelp.com/");
        content.add(" I am capable of handling whatever comes my way.\n");
        break;
      case "3":
        System.out.println("I choose to respond with patience and understanding instead of reacting in anger.");
        System.out.println("https://www.themuse.com/ https://www.peardeck.com/products/pear-deck-tutor https://noc.esdc.gc.ca/CareerHandbook/ChWelcome  https://www.betterhelp.com/");
        content.add("I choose to respond with patience and understanding instead of reacting in anger.\n");
        break;
      case "4":
        System.out.println("I am free from the burdens of my past and open to new possibilities.");
        System.out.println("https://www.themuse.com/ https://www.peardeck.com/products/pear-deck-tutor https://noc.esdc.gc.ca/CareerHandbook/ChWelcome  https://www.betterhelp.com/");
        content.add("I am free from the burdens of my past and open to new possibilities.\n");
        break;
      case "5":
        System.out.println("I forgive myself for any mistakes and learn from them.");
        System.out.println("https://www.themuse.com/ https://www.peardeck.com/products/pear-deck-tutor https://noc.esdc.gc.ca/CareerHandbook/ChWelcome  https://www.betterhelp.com/");
        content.add("I forgive myself for any mistakes and learn from them.\n");
        break;
      case "6":
        System.out.println("My life is a work in progress, constantly evolving and growing.");
        System.out.println("https://www.edx.org/ https://www.khanacademy.org/ https://www.peardeck.com/products/pear-deck-tutor https://www.notion.so/");
        content.add("My life is a work in progress, constantly evolving and growing.\n");
        break;
      case "7":
        System.out.println(" I am open to discovering new interests and passions.");
        System.out.println("https://www.edx.org/ https://www.khanacademy.org/ https://www.peardeck.com/products/pear-deck-tutor https://www.notion.so/");
        content.add(" I am open to discovering new interests and passions.\n");
        break;
      case "8":
        System.out.println("I am not defined by the things that irritate me; I am defined by my response.");
        System.out.println("https://www.edx.org/ https://www.khanacademy.org/ https://www.peardeck.com/products/pear-deck-tutor https://www.notion.so/");
        content.add("I am not defined by the things that irritate me; I am defined by my response.\n");
        break;
      case "9":
        System.out.println("I appreciate and celebrate my strengths and accomplishments.");
        System.out.println("https://www.edx.org/ https://www.khanacademy.org/ https://www.peardeck.com/products/pear-deck-tutor https://www.notion.so/");
        content.add("I appreciate and celebrate my strengths and accomplishments.\n");
        break;
      case "10":
        System.out.println("I am present in my own life, engaged in the journey of self-discovery.");
        System.out.println("https://www.edx.org/ https://www.khanacademy.org/ https://www.peardeck.com/products/pear-deck-tutor https://www.notion.so/");
        content.add("I am present in my own life, engaged in the journey of self-discovery.\n");
        break;
      case "11":
        System.out.println("The more I express gratitude, the more joy I attract into my life.");
        System.out.println("https://www.notion.so/");
        content.add("The more I express gratitude, the more joy I attract into my life.\n");
        break;
      case "12":
        System.out.println("I am grateful for the opportunities for growth that come my way.");
        System.out.println("https://www.notion.so/");
        content.add("I am grateful for the opportunities for growth that come my way.\n");
        break;
      case "13":
        System.out.println("I am deeply loved, and I allow that love to penetrate every cell of my being.");
        System.out.println("https://www.notion.so/");
        content.add("I am deeply loved, and I allow that love to penetrate every cell of my being.\n");
        break;
      case "14":
        System.out.println("My mind is calm, and my heart is at peace.");
        System.out.println("https://www.notion.so/");
        content.add("My mind is calm, and my heart is at peace.\n");
        break;
      case "15":
        System.out.println("Satisfaction is my compass, guiding me toward positive and fulfilling experiences.");
        System.out.println("https://www.notion.so/");
        content.add("Satisfaction is my compass, guiding me toward positive and fulfilling experiences.\n");
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
      System.out.println("          Would you like to add any thoughts to your SCHOOL/WORK log reflection today?\n          This can be what you are learning from your daily affirmations and how you've been achiving them, rather how you will.\n          YES or NO?");
    }

    public void Add(String content) {
      this.content.add("Personal Log: " + content + "\n");
    }
    

}
