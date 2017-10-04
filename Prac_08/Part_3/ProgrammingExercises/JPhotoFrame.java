/*
Create an application for Paula’s Portraits, a photography studio. The application allows users to compute the price of
a photography session. Paula’s base price is $40 for an in-studio photo session with one person. The in-studio fee is
$75 for a session with two or more subjects, and $95 for a session with a  pet. A $90 fee is added to take photos on
location instead of in the studio.

Include a set of mutually exclusive check boxes to select the portrait subject and
another set of mutually exclusive check boxes for the session location. Include labels as appropriate to explain the
application’s functionality. Save the file as JPhotoFrame.java
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPhotoFrame extends JFrame implements ItemListener
{
    FlowLayout flow = new FlowLayout();
    JLabel mainLabel = new JLabel(" -- Paula's Portraits -- ");
    Font font = new  Font("Calibre",Font.BOLD, 40);

    JCheckBox locationBox = new JCheckBox("On location",false);
    JCheckBox studioBox = new JCheckBox("In studio", false);
    JCheckBox oneBox = new JCheckBox("One person subject          ", false);
    JCheckBox moreBox = new JCheckBox("Two or more people subjects", false);
    JCheckBox petBox = new JCheckBox("Pet subject                 ", false);

    JLabel priceLabel = new JLabel("Portait fee");
    JTextField totPrice = new JTextField(10);
    String output;

    private final double LOCATION_PRICE = 90.00;
    private double ONE_PERSON_SUBJECT_PRICE = 40.00, MORE_PERSON_SUBJECTS_PRICE = 75.00;
    double PET_SUBJECT_PRICE = 95.00;
    double locPrice = 0.00;
    double subPrice = 0.0;
    public JPhotoFrame()
    {
        super("Portait options selection");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(flow);
        mainLabel.setFont(font);
        add(mainLabel);
        ButtonGroup subjectsGroup = new ButtonGroup();
        subjectsGroup.add(oneBox);
        subjectsGroup.add(moreBox);
        subjectsGroup.add(petBox);
        add(oneBox);
        add(moreBox);
        add(petBox);
        ButtonGroup locGroup = new ButtonGroup();
        locGroup.add(locationBox);
        locGroup.add(studioBox);
        add(locationBox);
        add(studioBox);

        add(priceLabel);
        add(totPrice);
        totPrice.setText("$0");
        oneBox.addItemListener(this);
        moreBox.addItemListener(this);
        petBox.addItemListener(this);
        locationBox.addItemListener(this);
        studioBox.addItemListener(this);
    }
    @Override
    public void itemStateChanged(ItemEvent check)
    {
        Object source = check.getItem();
        int select;
        select = check.getStateChange();
        if(source == locationBox) {
            if(select == ItemEvent.SELECTED)
                locPrice = locPrice + LOCATION_PRICE;
            else
                locPrice = locPrice - LOCATION_PRICE;
        }
        else if(source == oneBox) {
            if(select == ItemEvent.SELECTED)
                subPrice = subPrice + ONE_PERSON_SUBJECT_PRICE;
            else
                subPrice = subPrice - ONE_PERSON_SUBJECT_PRICE;
        }
        else if(source == moreBox) {
            if(select == ItemEvent.SELECTED)
                subPrice = subPrice + MORE_PERSON_SUBJECTS_PRICE;
            else
                subPrice = subPrice - MORE_PERSON_SUBJECTS_PRICE;
        }
        else {
            if(source == petBox) {
                if(select == ItemEvent.SELECTED)
                    subPrice = subPrice + PET_SUBJECT_PRICE;
                else
                    subPrice = subPrice - PET_SUBJECT_PRICE;
            }
        }
        output = " " + (subPrice + locPrice);
        totPrice.setText(output);
    }
    public static void main(String[] args)
    {
        JPhotoFrame frame = new JPhotoFrame();
        frame.setSize(650, 250);
        frame.setVisible(true);
    }
}