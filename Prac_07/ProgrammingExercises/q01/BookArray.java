public class BookArray {
    public static void main(String[] args) {
        Book books[] = new Book[10];

        int x;

        books[0] = new Fiction("Dandy boy");
        books[1] = new Fiction("Dancer boy");
        books[2] = new Fiction("Fancy boy");
        books[3] = new NonFiction("What is a boy");
        books[4] = new NonFiction("The big book of dogs");
        books[5] = new Fiction("The Title");
        books[6] = new Fiction("Dandy boy 2");
        books[7] = new Fiction("Dancer boy 2");
        books[8] = new NonFiction("Trees and where to find them");
        books[9] = new NonFiction("Why book titles are hard to make up");


        for (x = 0; x <= books.length - 1; x++) {
            System.out.println("Title: " + books[x].title + "\tCost: $" + books[x].price);

        }
    }
}