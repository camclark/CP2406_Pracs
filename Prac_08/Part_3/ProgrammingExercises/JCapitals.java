import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCapitals extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    JComboBox<String> countryBox = new JComboBox<String>();
    JLabel capitalLabel = new JLabel();
    String[] countries = {"Japan", "China", "India", "Russia", "Singapore"};
    String[] capitals = {"Tokyo", "Beijing", "New Delhi", "Moscow", "Pulau Ujong"};

    String myCountry;
    String output;
    int countryNum;
    public JCapitals(){
        super("Capitals of select countries");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(flow);

        countryBox.addItemListener(this);

        for(int x = 0; x < countries.length; ++x){
            countryBox.addItem(countries[x]);
        }

        add(countryBox);
        add(capitalLabel);
    }
    @Override
    public void itemStateChanged(ItemEvent check){
        Object source = check.getSource();
        if(source == countryBox){
            countryNum = countryBox.getSelectedIndex();
            capitalLabel.setText("The capital of " + countries[countryNum] + " is " + capitals[countryNum]);
        }
    }
    public static void main(String[] arguments)
    {
        JFrame aFrame = new JCapitals();
        aFrame.setSize(400,150);
        aFrame.setVisible(true);
    }
}
