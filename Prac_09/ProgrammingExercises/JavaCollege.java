/*
Create a JFrame for Java Junior College. Use menus to allow the user to access information about different campuses,
major fields of study offered, and activities. Include at least two options in each menu.
Save the file as JavaCollege.java
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCollege extends JFrame implements ActionListener{
    private JMenuBar mainBar = new JMenuBar();
    private JMenu menu0 = new JMenu("File");
    private JMenu menu1 = new JMenu("Campuses");
    private JMenu menu2 = new JMenu("Study Majors");
    private JMenu menu3 = new JMenu("Activities");

    private JMenuItem exit = new JMenuItem("Exit");

    private JMenuItem jcuTsv = new JMenuItem("James Cook Uni Townsville");
    private JMenuItem jcuCns = new JMenuItem("James Cook Uni Cairns");
    private JMenuItem jcuMak = new JMenuItem("James Cook Uni Mackay");

    private JMenuItem engi = new JMenuItem("Engineering");
    private JMenuItem it = new JMenuItem("Information Technology");
    private JMenuItem med = new JMenuItem("Medicine");

    private JMenuItem scuba = new JMenuItem("Scuba Diving");
    private JMenuItem rockclimb = new JMenuItem("Rockclimbing");
    private JMenuItem hiphop = new JMenuItem("HipHop Dance");

    private JLabel label1 = new JLabel("James Cook University Information");
    private JLabel label2 = new JLabel("Click the menus for more information");

    private Container con = getContentPane();



    public JavaCollege(){
        setLayout(new FlowLayout());
        setJMenuBar(mainBar);
        mainBar.add(menu0);
        mainBar.add(menu1);
        mainBar.add(menu2);
        mainBar.add(menu3);

        menu0.add(exit);
        menu1.add(jcuTsv);
        menu1.add(jcuCns);
        menu1.add(jcuMak);
        menu2.add(engi);
        menu2.add(it);
        menu2.add(med);
        menu3.add(scuba);
        menu3.add(rockclimb);
        menu3.add(hiphop);

        con.setLayout(new BorderLayout());

        con.add(label1, BorderLayout.NORTH);
        con.add(label2, BorderLayout.SOUTH);

        exit.addActionListener(this);
        jcuTsv.addActionListener(this);
        jcuCns.addActionListener(this);
        jcuMak.addActionListener(this);
        engi.addActionListener(this);
        it.addActionListener(this);
        med.addActionListener(this);
        scuba.addActionListener(this);
        rockclimb.addActionListener(this);
        hiphop.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if(source == exit)
            System.exit(0);
        else if(source == jcuTsv){
            label1.setText("jcuTsv");
            label2.setText("James Cook University Townsville");
        } else if(source == jcuCns){
            label1.setText("jcuCns");
            label2.setText("James Cook University Cairns");
        } else if(source == jcuMak){
            label1.setText("jcuMak");
            label2.setText("James Cook University Mackay");
        } else if(source == engi){
            label1.setText("jcu Engineering");
            label2.setText("<html>At JCU we offer degree programs across Chemical, Civil, Electrical and Electronics, <br>" +
                    "Electrical Systems and Internet of Things, and Mechanical Engineering disciplines.");
        } else if(source == it){
            label1.setText("jcu Information Technology");
            label2.setText("<html>JCU has searched the world for expert IT staff who have practical industry experience," +
                    "along with up-to-the-minute technical knowledge. ");
        } else if(source == med){
            label1.setText("jcu Medicine");
            label2.setText("<html>The James Cook University Medical Program leads positive change in health and medical" +
                    "care for communities of tropical Australia and beyond through socially accountable health" +
                    "education, discoveries, partnerships and advocacy that make a difference.");
        }  else if(source == scuba){
            label1.setText("jcu Scuba");
            label2.setText("Come dive with our club, discounts for students");
        }   else if(source == rockclimb){
            label1.setText("jcu Rockclimbing");
            label2.setText("Come rockclimb with our club, discounts for students");
        }   else if(source == hiphop){
            label1.setText("jcu HipHop Dance");
            label2.setText("Come dance with our club, discounts for students");
        }
    }

    public static void main(String[] args)
    {
        JavaCollege mFrame = new JavaCollege();
        mFrame.setSize(600, 150);
        mFrame.setVisible(true);
    }
}
