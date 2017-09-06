// Allows user to enter a series of words
// and displays them reversed
//import javax.swing.*;
//import java.util.Arrays;
//

import javax.swing.*;
public class DebugEight4
{
    public static void main(String[] args)
    {
        int x = 0;
        String array[] = new String[100];
        String entry;
        final String STOP = "XXX";
        StringBuffer message = new StringBuffer("The words in reverse order are\n");

        entry = JOptionPane.showInputDialog(null, "Enter any word\n" +
                "Enter " + STOP + " when you want to stop");
        while(!(entry.equals(STOP)))
        {
            array[x] = entry;
            x++;
            entry = JOptionPane.showInputDialog(null, "Enter another word\n" +
                    "Enter " + STOP + " when you want to stop");
        }
        for(int y = x - 1; y >= 0; --y)
        {
            message.append(array[y]).append('\n');
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
