import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
Create an application that uses a graphic interface to capture employee data and writes that data to a random
access outfile. The data required for each employee includes and employee ID number from 1 through 99 inclusive, the
first and last names of the employee, and the employee's hourly pay rate. Allow the user to enter data one record at a
time and to click a button to save each record.
 */

public class CreateRandomEmployeeFile extends JFrame implements ActionListener
{
    private JLabel title = new JLabel("Employee data");
    Font bigFont = new Font("Helvetica", Font.BOLD, 24);
    private JLabel prompt = new JLabel("    Enter employee data    ");
    private JTextField idField = new JTextField(4);
    private JTextField firstField = new JTextField(14);
    private JTextField lastField = new JTextField(14);
    private JTextField payField = new JTextField(8);
    private JLabel idLabel = new JLabel("ID");
    private JLabel fnLabel = new JLabel("     First name     ");
    private JLabel lnLabel = new JLabel("Last name");
    private JLabel payLabel = new JLabel("Pay rate");
    private JButton enterButton = new JButton("Enter data");
    private Container con = getContentPane();
    DataOutputStream ostream;
    RandomAccessFile empFile;
    final int RECORD_SIZE = 32;
    final int NUM_RECORDS = 100;
    StringBuffer blankName = new StringBuffer(10);
    public CreateRandomEmployeeFile()
    {
        super("Create File");
        try
        {
            empFile = new RandomAccessFile("Employees.dat","rw");
            for(int x = 0; x < NUM_RECORDS; ++x)
            {
                empFile.writeInt(0);
                empFile.writeUTF(blankName.toString());
                empFile.writeUTF(blankName.toString());
                empFile.writeDouble(0.0);
            }
        }
        catch(IOException e)
        {
            System.err.println("File not opened");
            System.exit(1);
        }
        setSize(180, 280);
        con.setLayout(new FlowLayout());
        title.setFont(bigFont);
        con.add(title);
        con.add(prompt);
        con.add(idLabel);
        con.add(idField);
        con.add(fnLabel);
        con.add(firstField);
        con.add(lnLabel);
        con.add(lastField);
        con.add(payLabel);
        con.add(payField);
        con.add(enterButton);
        enterButton.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e1)
    {
        final int MAXNUM = 99;
        int num;
        double pay;
        try
        {
            num = Integer.parseInt(idField.getText());
            pay = Double.parseDouble(payField.getText());
            if(num > MAXNUM)
                num = MAXNUM;
            empFile.seek((num - 1) * RECORD_SIZE);
            empFile.writeInt(num);
            empFile.writeUTF(firstField.getText());
            empFile.writeUTF(lastField.getText());
            empFile.writeDouble(pay);
            idField.setText("");
            lastField.setText("");
            firstField.setText("");
            payField.setText("");
        }
        catch(NumberFormatException e2)
        {
            System.err.println("Invalid employee ID number");
        }
        catch(IOException e3)
        {
            System.err.println("Error writing file");
            System.exit(1);
        }
    }
    public static void main(String[] args)
    {
        CreateRandomEmployeeFile file = new CreateRandomEmployeeFile();
    }
}