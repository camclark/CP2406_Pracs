/*
Create an abstract Student class for Parker University.  The class contains fields for student ID number, last name, and
annual tuition. Include a constructor that requires parameters for the ID number and name. Include get and set methods
for each field; the setTuition() method is abstract. Create three Student subclasses named UndergraduateStudent,
GraduateStudent, and StudentAtLarge, each with a unique setTuition() method. Tuition for an UndergraduateStudent is
$4,000 per semester, tuition for a GraduateStudent is $6,000 per semester, and tuition for a StudentAtLarge is $2,000
per semester.

Write an application that creates an array of at least six objects to demonstrate how the methods work for
objects of each Student type. Save the files as Student.java, UndergraduateStudent.java, GraduateStudent.java,
StudentAtLarge.java, and StudentDemo.java
*/

public class DemoStudents {
    public static void main(String[] args) {
        q8Student students[] = new q8Student[6];
        int i;

        students[0] = new UndergraduateStudent(1300, "Dean");
        students[1] = new StudentAtLarge(1301, "Clark");
        students[2] = new GraduateStudent(1302, "Wickens");
        students[3] = new GraduateStudent(1303, "Drane");
        students[4] = new UndergraduateStudent(1304, "James");
        students[5]= new StudentAtLarge(1305, "Mickson");

        for(i = 0; i < students.length; ++i)
            System.out.println("\nStudent #" +
                    students[i].getIDNumber() + " Name: " +
                    students[i].getLastName() + "  Tuition: " +
                    students[i].getAnnualTuition() + "/yr");
    }
}
