/*
Create a class named CollegeCourse that includes data fields that hold the department (for example, ENG), the course
number (for example, 101), the credits (for example, 3), and the fee for the course (for example, $360). All of the
fields are required as arguments to the constructor, except for the fee, which is calculated at $120 per credit hour.
Include a display() method that displays the course data. Create a subclass named LabCourse that that adds $50 to the
course fee. Override the parent class display() method to indicate that the course is a lab course and to display all
the data. Write an application named UseCourse that prompts the use for course information. If the user enters a class
in any of the following departments, create a LabCourse: BIO, CHM, CIS, or PHY. If the user enters any other department,
 create a CollegeCourse that does not include the lab fee. Then display the course data.

Save the files as CollegeCourse.java, LabCourse.java and UseCourse.java
 */

import javax.swing.*;
public class UseCourse
{
    public static void main(String[] args)
    {
        String dept, inStr;
        String[] labCourses = {"BIO", "CHM", "CIS", "PHY"};
        int id, credits;
        int found = 0;
        int x;
        dept = JOptionPane.showInputDialog(null, "Enter department");
        inStr = JOptionPane.showInputDialog(null,
                "Enter course number");
        id = Integer.parseInt(inStr);
        inStr = JOptionPane.showInputDialog(null, "Enter credits");
        credits = Integer.parseInt(inStr);
        for(x = 0; x < labCourses.length; ++x)
            if(dept.equals(labCourses[x]))
                found = 1;
        if(found == 1)
        {
            LabCourse course = new LabCourse(dept, id, credits);
            course.display();
        }
        else
        {
            CollegeCourse course = new CollegeCourse(dept, id, credits);
            course.display();
        }
    }
}