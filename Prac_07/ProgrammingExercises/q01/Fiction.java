/*
Create two child classes of Book: Fiction and NonFiction. Each must include a setPrice() method that sets the price for
all Fiction Books to $24.99 and for all NonFiction Books to $37.99. Write a constructor for each subclass, and include a
 call to setPrice() within each. Write an application demonstration that you can both a Fiction and a Nonfiction Book,
 and display their fields. Save the files as Book.java, Fiction.java, NonFiction.java, and UseBook.java.
 */

public class Fiction extends  Book {
    public Fiction(String title){
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        super.price = 24.99;
    }
}
