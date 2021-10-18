package strategy.without_strategy;

import java.util.ArrayList;
import java.util.List;

public class AuthorWithInsertionSortAndNaturalOrderDisplay extends Author {

    public AuthorWithInsertionSortAndNaturalOrderDisplay(String name)
    {
        super (name);
    }

    /*
     * Sorts this Author's books using 'Insertion Sort' Algorithm.
     */

    public void sortBooks() {
        for (int i = 1; i < books.size(); i++) {
            Book temp = books.get(i);

            // Insert item from index i into its correct sorted location
            // between 0 and i inclusive.
            int j = 0;
            for (j = i - 1; j >= 0 && temp.compareTo(books.get(j)) < 0; j--)
                books.set(j + 1, books.get(j));

            books.set(j + 1, temp);
        }
    }

    /*
     * Display books in 'Natural Order'.
     */

    public void displayBooks ()
    {

        for (int  i = 0; i  < books.size (); i++)
            System.out.print("(" + books.get(i) + ")  ");

        System.out.println ();
    }


}
