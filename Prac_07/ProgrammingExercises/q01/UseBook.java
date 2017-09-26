/*
Create an abstract class named Book. Include a String field for the book’s title and a double field for the book’s
price. Within the class, include a constructor that requires the book title, and add two get methods - one that returns
the title and one that returns the price. Include an abstract method named setPrice().

Create two child classes of Book: Fiction and NonFiction. Each must include a setPrice() method that sets the price for
all Fiction Books to $24.99 and for all NonFiction Books to $37.99. Write a constructor for each subclass, and include a
 call to setPrice() within each. Write an application demonstration that you can both a Fiction and a Nonfiction Book,
 and display their fields. Save the files as Book.java, Fiction.java, NonFiction.java, and UseBook.java.
 */


public class UseBook {
    public static void main(String[] args) {
        Book b1 = new Fiction("The little program who could");
        Book b2 = new NonFiction("The dance academy");

        display(b1);
        display(b2);
    }

    public static void display(Book b) {
        System.out.println("Title: " + b.getTitle() + " Cost: $" + b.getPrice());
    }
}
