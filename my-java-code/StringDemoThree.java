import javax.swing.JOptionPane;

public class StringDemoThree
{
	public static void main(String[] args)
	{
		String inputPhrase = null;
		String initials;
	    StringBuilder ID = new StringBuilder();
		
		inputPhrase = JOptionPane.showInputDialog(null, "Enter your full name and address.", "INPUT", JOptionPane.INFORMATION_MESSAGE);
		
	    int inputPhraseLength = inputPhrase.length();

	    int first = inputPhrase.indexOf(' ');
        int second = inputPhrase.indexOf(' ', ++first);
        int third = inputPhrase.indexOf(' ', ++second);
                
        char firstInitial = inputPhrase.charAt(0);
        firstInitial = Character.toUpperCase(firstInitial);
        
        char secondInitial = inputPhrase.charAt(first);
        secondInitial = Character.toUpperCase(secondInitial);
        
        char thirdInitial = inputPhrase.charAt(second);
        thirdInitial = Character.toUpperCase(thirdInitial);
        
        ID.insert(0, firstInitial);
        ID.insert(1, secondInitial);
        ID.insert(2, thirdInitial);

        for (int i = 0; i > inputPhraseLength; i++)
        {
        	if (Character.isDigit(i) == true)
        	{
        		ID.append(i);
        	}
        	i++;
        }
        JOptionPane.showMessageDialog(null, "Your ID is " + ID);
        // JOptionPane.showConfirmDialog(null, "Your ID is " + firstInitial + secondInitial + thirdInitial, "CONFIRM ID", JOptionPane.OK_OPTION);
	}
}
