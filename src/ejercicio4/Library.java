package ejercicio4;

import java.util.ArrayList;
import java.util.Optional;

public class Library {
    private ArrayList<LibraryItem> libraryItems;
    private ArrayList<LibraryUser> users;
    public void addItem(LibraryItem item)
    {
        libraryItems.add(item);
    }
    public void showAllItems()
    {
        for(LibraryItem item : libraryItems)
        {
            item.showDetails();
        }
    }
    public void loanItem(int itemId, int userId)
    {
        // not true -> false
        // not false -> true
        // verificar si existe

        LibraryItem itemFound = existById(itemId);

        // en caso exista verificar el estado

        if(itemFound == null)
        {
            // significa que el item buscado no se encontro
            return;
        }

        if(itemFound.isLoaned())
        {
            return;
        }

        // Verificar el usuario

    }
    private LibraryItem existById(int itemId)
    {
        for(LibraryItem item : libraryItems)
        {
            if(item.getItemId() == itemId)
            {
                return item;
            }
        }
        return null;
    }

}
