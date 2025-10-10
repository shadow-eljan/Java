package objectOrientedprogramming.Aggregation;

public class Book {

    String title;
    int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayBookInfo( ){
        return this.title + " ( " + this.pages + "pages )";
    }
}
