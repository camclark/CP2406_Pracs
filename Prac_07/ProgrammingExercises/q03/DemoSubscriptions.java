/*
Create an abstract NewspaperSubscription class with fields for the subscriber name, address and rate. Include get and
set methods for the name field and get methods for the address and subscription rate; the setAddress() method is
abstract. Create two subclasses named PhysicalNewspaperSubscription and Online NewspaperSubscription. The parameter for
the setAddress() method of the PhysicalNewspaperSubscription class must contain at least one digit; otherwise, an error
message is displayed and the subscription rate is set to 0. If the address invalid, the subscription rate is assigned
$15. The parameter for the setAddress() method of the OnlineNewspaperSubscription class must contain an at sign (@)
or an error message is displayed. If the address is valid, the subscription rate is assigned $9.

Finally write and application that declares several objects of both subscription subtypes and displays their data fields.
Save the files as NewspaperSubscription.java, PhysicalNewspaperSubscription.java, OnlineNewspaperSubscription.java,
and DemoSubscriptions.java
 */

public class DemoSubscriptions {
    public static void main(String[] args) {
        OnlinePaperSubscription p1 = new OnlinePaperSubscription();
        OnlinePaperSubscription p2 = new OnlinePaperSubscription();

        PhysicalNewspaperSubscription p3 = new PhysicalNewspaperSubscription();
        PhysicalNewspaperSubscription p4 = new PhysicalNewspaperSubscription();

        p1.setName("Mr. Positive");
        p1.setAddress("Damnson@hotmail.com");

        p2.setName("Mr. Negative");
        p2.setAddress("Nogood.com");

        p3.setName("Mrs. Positive");
        p3.setAddress("21 John Street");

        p4.setName("Mrs. Negative");
        p4.setAddress("Samuel Lane");

        display(p1);
        display(p2);
        display(p3);
        display(p4);
    }

    public static void display(NewspaperSubscription n){
        System.out.println("Name:  " + n.getName() + " Address: " + n.getAddress() + " Rate: " + n.getRate());
    }
}
