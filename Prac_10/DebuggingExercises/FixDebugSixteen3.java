// This program displays promotional messages
// with the click of a button
// The button is disabled when all messages are on screen
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class FixDebugSixteen3 extends JPanel implements ActionListener
{
    private JButton findOutButton = new JButton("Find Out");
    FlowLayout flow = new FlowLayout();
    private String[] reason= {"Our products","Our people",
            "Our committment","Our service","YOU!!"};
    private Font boldFont =new Font("TimesRoman", Font.BOLD, 20);
    private int counter = 0;

    private FixDebugSixteen3()
    {
        setBackground(Color.PINK);
        JLabel firstText = new JLabel("Our company is growing!");
        add(firstText);
        JLabel secText = new JLabel("What makes us better that most?");
        add(secText);
        add (findOutButton);
        findOutButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++counter;
        if(counter >= reason.length)
            findOutButton.setEnabled(false);
        repaint();

    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setFont(boldFont);
        g.setColor(Color.BLUE);
        int y = 50;
        int x = 30;
        int GAP = 20;
        for(int i = 0; i < counter; ++i)
            g.drawString(reason[i], x, y += GAP);
    }
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new FixDebugSixteen3());
        frame.setSize(350, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}