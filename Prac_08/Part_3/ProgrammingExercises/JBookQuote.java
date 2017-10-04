
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote extends JFrame implements ActionListener{
    FlowLayout flow = new FlowLayout();
    JLabel bookQuote1 = new JLabel("The garden was so muddy");
    JLabel bookQuote2 = new JLabel("that the little digger stuck");
    JButton bookButton = new JButton("Click for title");
    JLabel bookQuote3 = new JLabel("    Title: The little yellow digger     ");

    public JBookQuote (){
        super("Book quote");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(flow);
        add(bookQuote1);
        add(bookQuote2);
        add(bookButton);
        bookButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        add(bookQuote3);
        validate();
        repaint();
    }

    public static void main(String[] arguments)
    {
        JFrame aFrame = new JBookQuote();
        aFrame.setSize(350,150);
        aFrame.setVisible(true);
    }
}