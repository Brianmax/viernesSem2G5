package ejercicio4;

public class LibraryItem {
    protected String title;
    protected int itemId;
    protected boolean isLoaned;

    public LibraryItem(String title, int itemId, boolean isLoaned) {
        this.title = title;
        this.itemId = itemId;
        this.isLoaned = isLoaned;
    }

    public void showDetails()
    {
        System.out.println(title);
        System.out.println(itemId);
        System.out.println(isLoaned);
    }
}
