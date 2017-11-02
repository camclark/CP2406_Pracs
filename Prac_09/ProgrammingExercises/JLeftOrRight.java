import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JLeftOrRight extends JFrame implements MouseListener{
    private JLabel label= new JLabel("Do something with the mouse");
    String msg = "";

    public JLeftOrRight()
    {
        setLayout(new FlowLayout());
        addMouseListener(this);
        add(label);
    }
    @Override
    public void mouseEntered(MouseEvent e)
    {

    }
    @Override
    public void mouseExited(MouseEvent e)
    {
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
    }
    @Override
    public void mousePressed(MouseEvent e)
    {if (e.getButton() == MouseEvent.BUTTON1) {
        label.setText("Left clicked");
    }else if (e.getButton() == MouseEvent.BUTTON3){
        // mouse button 3 is right click on mac track pad
        label.setText("Right clicked");
    }
    }
    @Override
    public void mouseReleased(MouseEvent e)
    {
    }
    public static void main(String[] args)
    {
        JLeftOrRight mFrame = new JLeftOrRight();
        mFrame.setSize(400,300);
        mFrame.setVisible(true);
    }
}
