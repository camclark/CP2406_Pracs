// This program shows a customer
// what a shirt looks like in different colors
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class FixDebugSixteen4 extends JPanel implements ActionListener
{
    private int counter = 0;
    private int xTop[] = { 20, 40, 50, 60, 80, 75, 62, 66, 40, 38, 25, 20};
    private int yTop[] = {142,130,138,130,138,148,142,160,160,142,148,142};
    private Color[] colors = {Color.RED, Color.PINK, Color.YELLOW, Color.GREEN, Color.CYAN};
    Font font = new Font("Arial", Font.BOLD, 14);
    private int cycle = 0;
    private FixDebugSixteen4()
    {
        setBackground(Color.WHITE);
        JLabel header = new JLabel("Outfit planner");
        add(header);
        JButton changeButton = new JButton("Change clothes");
        add(changeButton);
        changeButton.addActionListener(this);
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setFont(font);
        int y = 80;
        g.setColor(colors[cycle]);
        g.fillPolygon(xTop, yTop, 12);
        g.setColor(Color.BLACK);
        int x = 100;
        g.drawString("Just look at the colors", x, y);
        int GAP = 20;
        g.drawString("in which you can buy", x, y += GAP);
        g.drawString("this beautiful shirt", x, y += GAP);
        double PRICE = 39.95;
        g.drawString("Only $" + PRICE, x, y += GAP);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++counter;
        cycle = counter % colors.length;
        repaint();
    }
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new FixDebugSixteen4());
        frame.setSize(350, 240);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}