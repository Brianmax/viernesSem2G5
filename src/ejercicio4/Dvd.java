package ejercicio4;

public class Dvd extends LibraryItem{
    private String director;
    private int duration;

    public Dvd(String title, int itemId, boolean isLoaned, String director, int duration)
    {
        super(title, itemId, isLoaned);
        this.director = director;
        this.duration = duration;
    }
}
