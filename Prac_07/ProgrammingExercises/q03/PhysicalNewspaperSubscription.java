/*
Create two subclasses named PhysicalNewspaperSubscription and Online NewspaperSubscription. The parameter for
the setAddress() method of the PhysicalNewspaperSubscription class must contain at least one digit; otherwise, an error
message is displayed and the subscription rate is set to 0. If the address invalid, the subscription rate is assigned
$15. The parameter for the setAddress() method of the OnlineNewspaperSubscription class must contain an at sign (@)
or an error message is displayed. If the address is valid, the subscription rate is assigned $9.
 */

public class PhysicalNewspaperSubscription extends NewspaperSubscription{
    public void setAddress(String s){
        boolean validAddress = false;
        address = s;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                validAddress = true;
                break;
            }
        }
        if(validAddress){
            rate = 15.00;
        }else{
            System.out.println("Error: " + s + " is not a valid address");
            rate = 0.00;
        }
    }
}
