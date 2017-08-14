/*
Travel Tickets Company sells tickets for airlines, tours, and other travel-related services.
Because ticket agents frequently mistype long ticket numbers, Travel Tickets has asked you to write an application
that indicated invalid ticket number entries. The class prompts a ticket agent to enter a six-digit ticket number.
Ticket numbers are designed so that if you drop the last digit of the number then divide the name by 7 the remainder
of the division will be identical to the last dropped digit.

Accept the ticket number from the agent and verify whether it is a valid number.
Display the result - true or false in a message box

Test the application with the following ticket numbers:
123454: the comparison should evaluate to true
147103; the comparison should evaluate to true
154123; the comparison should evaluate to false
 */

import javax.swing.*;

public class TicketNumber {
    public static void main(String[] args) {
        int ticket_number = Integer.parseInt(JOptionPane.showInputDialog("Please enter ticket number"));
        int modified_ticket_number = ticket_number/10;

        System.out.println(ticket_number + " ticket number");
        System.out.println(modified_ticket_number + "  mod ticket number");

        int modified_ticket_number_remainder = modified_ticket_number % 7;

        // is dropped number the same as the remainder of mod 7 of the modified number
        if ((ticket_number % 10) == modified_ticket_number_remainder){
            JOptionPane.showMessageDialog(null, "True");
        } else JOptionPane.showMessageDialog(null, "False");
    }
}
