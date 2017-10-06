import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Create a JFrame and set the layout to BorderLayout. In each region, place a JButton that displays the name of a classic
movie that has the region name in its title. For example, the east button might indicate the movie East of Eden. When
the user clicks the button, display the year of the movie's release and the name of one of its stars.
 */

public class JMovieFrame extends JFrame implements ActionListener{
    JPanel panel1 = new JPanel(new BorderLayout());
    JButton button1 = new JButton("East of Eden");
    JTextArea label1 = new JTextArea("Click button for movie info");


    public JMovieFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(panel1);
        setSize(350, 400);
        panel1.add(button1, BorderLayout.WEST);
        panel1.add(label1, BorderLayout.EAST);

        button1.addActionListener(this);

        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == button1){
            label1.setText("1955 ‧ Drama/Drama ‧ 1h 57m \nCast: James Dean as Cal Trask\n" +
                    "Julie Harris as Cathy Ames\n" + "Raymond Massey as Adam Trask");
        }

    }

    public static void main(String[] args)
    {
        JMovieFrame frame = new JMovieFrame();
    }
}

