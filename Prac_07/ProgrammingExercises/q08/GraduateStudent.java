/*
Create three Student subclasses named UndergraduateStudent,
GraduateStudent, and StudentAtLarge, each with a unique setTuition() method. Tuition for an UndergraduateStudent is
$4,000 per semester, tuition for a GraduateStudent is $6,000 per semester, and tuition for a StudentAtLarge is $2,000
per semester.
 */

public class GraduateStudent extends q8Student{
    int SEMESTER_TUITION_FEE = 6000;

    public GraduateStudent(int IDNumber, String lastName) {
        super(IDNumber, lastName);
        setAnnualTuition();

    }

    @Override
    public void setAnnualTuition() {
        this.annualTuition = SEMESTER_TUITION_FEE;
    }
}
