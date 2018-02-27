// FixDebugSeven3.java
// Works with StringBuffer class to create Pig Latin
// Pig Latin is a made-up language in which you
// remove the first letter of a word and attach
// it to the end, along with "ay". For example,
// "Dog" becomes "ogDay"
import javax.swing.*;
public class DebugSeven3
{
   public static void main(String[] args)
   {
      StringBuffer str = new StringBuffer(" ");
      String userEntry;
      char first;
      userEntry = JOptionPane.showInputDialog(null, "Enter a word\n" +
        "and I will convert it to Pig Latin");    
      str.insert(0,userEntry);
      first = str.charAt(1);
      // str.deleteCharAt(3);
      str.append(first);
      str.append("ay");
      JOptionPane.showMessageDialog(null,"Pig Latin version:\n" + str);
   }
}