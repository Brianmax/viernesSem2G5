package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Abril Rojo", 1, true, "Santiago Roncagliolo");
        Dvd dvd1 = new Dvd("Spiderman", 2, true, "Sam Rami", 120);

        LibraryItem libraryItem1 = new Dvd("Venom", 3, true, "Sam Rami", 120);

        book1.showDetails();
        System.out.println("=========================");
        dvd1.showDetails();
        System.out.println("=========================");
        libraryItem1.showDetails();

        libraryItem1.showDetails();

        Book book2 = null; // null
        book2.getItemId();
    }
}
