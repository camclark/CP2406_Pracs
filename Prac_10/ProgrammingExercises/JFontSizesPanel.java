import javax.swing.*;
import java.awt.*;

public class JFontSizesPanel extends JPanel
{
    int i;

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int vertPos = 10;
        int START = 6;
        int STOP = 20;
        for(i = START; i <= STOP; ++i)
        {
            Font myFont = new Font("Arial", Font.BOLD, i);
            g.setFont(myFont);
            int HORIZ_POS = 50;
            String phrase = "I AM THE MACHINE";
            g.drawString(phrase, HORIZ_POS, vertPos);
            int INCREASE = 20;
            vertPos += INCREASE;
        }
    }
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new JFontSizesPanel());
        frame.setSize(360, 340);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}