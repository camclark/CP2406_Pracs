/*
Create a class named CollegeCourse that includes data fields that hold the department (for example, ENG), the course
number (for example, 101), the credits (for example, 3), and the fee for the course (for example, $360). All of the
fields are required as arguments to the constructor, except for the fee, which is calculated at $120 per credit hour.
Include a display() method that displays the course data.
 */

import javax.swing.*;
public class CollegeCourse
{
    protected String dept;
    protected int id;
    protected double credits;
    protected double price;
    public CollegeCourse(String dep, int num, double cr)
    {
        final int FEEPERCREDIT = 120;
        dept = dep;
        id = num;
        credits = cr;
        price = cr * FEEPERCREDIT;
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null,
                dept + id + "\nNon-lab course\n" +  credits +
                        " credits\nTotal fee is $" + price);
    }
}
