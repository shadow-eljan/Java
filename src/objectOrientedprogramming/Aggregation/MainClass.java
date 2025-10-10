package objectOrientedprogramming.Aggregation;

public class MainClass {
    public static void main(String[] args) {

        //Aggregation = One object contains another object as
        // part of its structure, but independently.

        Book book1 = new Book("Harry Potter", 22);
        Book book2 = new Book("Lord of the Rings", 123);
        Book book3 = new Book("Solo Levelling", 333);

        Book[] books={book1, book2, book3};

        Library library = new Library("KTM Public Library", 2020, books);

        library.displayInfo();
    }
}
