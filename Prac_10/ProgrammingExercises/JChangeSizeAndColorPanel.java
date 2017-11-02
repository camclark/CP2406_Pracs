import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class JChangeSizeAndColorPanel extends JPanel implements ActionListener {
    private int countClicks = 0;
    private final int START_X = 10;
    private int xPos = START_X;
    private final int START_SIZE = 40;
    private int size = START_SIZE;
    private Color color;

    private JChangeSizeAndColorPanel() {
        setBackground(Color.WHITE);
        JButton aButton = new JButton("Click me");
        add(aButton);
        aButton.addActionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font font = new Font("Arial", Font.BOLD, size);
        g.setFont(font);
        g.setColor(color);
        int YPOS = 120;
        String phrase = "Party like it's 1995";
        g.drawString(phrase, xPos, YPOS);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (countClicks == 0)
            color = Color.RED;
        else if (countClicks == 1)
            color = Color.BLACK;
        else if (countClicks == 2)
            color = Color.RED;
        countClicks++;
        int CHANGE = 8;
        size -= CHANGE;
        int MOVE_TO_RIGHT = 100;
        xPos += MOVE_TO_RIGHT;
        int MAX_CLICKS = 3;
        if (countClicks > MAX_CLICKS) {
            color = Color.BLACK;
            xPos = START_X;
            size = START_SIZE;
            countClicks = 0;
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JChangeSizeAndColorPanel());
        frame.setSize(600, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}