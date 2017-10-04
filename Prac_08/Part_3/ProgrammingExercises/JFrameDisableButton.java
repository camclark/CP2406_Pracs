import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener {
    public int clicksUntilDisable = 8;

    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Click me!");
    JLabel prompt = new JLabel(clicksUntilDisable + " clicks remaining");

    public JFrameDisableButton() {
        super("Book quote");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(flow);
        add(button);
        add(prompt);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicksUntilDisable = clicksUntilDisable - 1;
        if (clicksUntilDisable == 0){
            button.setEnabled(false);
            prompt.setText("That's enough!");
        } else {
            prompt.setText(clicksUntilDisable + " press remaining");
        }
        validate();
        repaint();
    }

    public static void main(String[] arguments) {
        JFrame aFrame = new JFrameDisableButton();
        aFrame.setSize(350, 150);
        aFrame.setVisible(true);
    }
}
