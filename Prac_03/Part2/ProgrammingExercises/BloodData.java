/*
Create a class named BloodData that includes fields that hold a blood type (the four blood types are O, A, B and AB)
 and an Rh factor (the factors are + and -). Create a default constructor that sets the fields to “O” and “+”,
 and an overloaded constructor that requires values for both fields. Include get and set methods for each field.
 Save this file as BloodData.java.
 Create an application named Test BloodData that demonstrates each method works correctly.
 */

import javax.swing.*;

public class BloodData {
    private String bloodType;
    private String rhFactor;

    public BloodData()

    {
        bloodType = "O";
        rhFactor = "+";

    }

    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public void showData() {
        System.out.println(String.format("Blood type: %s  Rh Factor %s", bloodType, rhFactor));
    }

    public void setBloodType(String bloodType){
        if (bloodType == null || bloodType.isEmpty()) {
            complainAboutUnusableString();
        } else if (bloodType.equals("O") || bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB")) {
            this.bloodType = bloodType;
        } else {
            complainAboutUnusableString("A, B, AB or O");
        }


    }

    public void setBloodrhFactor(String rhFactor)
    {
        if (rhFactor == null || rhFactor.isEmpty()) {
            complainAboutUnusableString();
        } else if (rhFactor.equals("-") || rhFactor.equals("+")) {
            this.rhFactor = rhFactor;
        } else {
            complainAboutUnusableString("- or +");
        }

    }

    public static void complainAboutUnusableString(){
        JOptionPane.showMessageDialog(null, "Error: Unusable string");
    }

    public static void complainAboutUnusableString(String acceptableString){
        JOptionPane.showMessageDialog(null, "Error: Acceptable strings are " + acceptableString);
    }
}
