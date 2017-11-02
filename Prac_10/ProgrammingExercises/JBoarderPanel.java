import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class JBoarderPanel extends JPanel implements ActionListener {
    private String myName = "";
    private Font serifItalic = new Font("Serif", Font.ITALIC, 20);
    private final int NUM = 5;
    Color[] colors = new Color[NUM];
    JTextField field = new JTextField(15);

    public JBoarderPanel() {
        colors[1] = Color.CYAN;
        colors[2] = Color.MAGENTA;
        colors[3] = Color.BLUE;
        colors[4] = Color.GREEN;
        add(field);
        field.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        myName = field.getText();
        repaint();
    }

    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        int a;
        int x = 60;
        int y = 100;
        int FACTOR = 10;


        for (a = 1; a < NUM; ++a) {
            gr.setColor(colors[a]);
            int border = a * FACTOR;
            gr.setFont(serifItalic);
            gr.drawString(myName, x, y);
            int leading = gr.getFontMetrics().getLeading();
            int ascent = gr.getFontMetrics().getAscent();
            int height = gr.getFontMetrics().getHeight();
            int width = gr.getFontMetrics().stringWidth(myName);
            gr.drawRect(x - border, y - (ascent + leading + border), width + 2 * border, height + 2 * border);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JBoarderPanel());
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}