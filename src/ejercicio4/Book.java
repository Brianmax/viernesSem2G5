package ejercicio4;

public class Book extends LibraryItem{
    private String author;

    public Book(String title, int itemId, boolean isLoaded, String author)
    {
        super(title, itemId, isLoaded);
        this.author = author;
    }
}
