package strategy.without_strategy;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Author author1, author2,author3, author4;
        Map <String, String> bookInfo1, bookInfo2;

        bookInfo1 = new HashMap <String, String> ()
        {
            {
                put ("Harry Potter", "1770893083");
                put ("Quidditch Through The Ages", "0385659768");
                put  ("The Shining", "1443433659");
            }
        };

        bookInfo2 = new HashMap <String, String> ()
        {
            {

                put ("Fantastic Beasts", "1770891048");
                put ("Carrie", "0006485456");
            }
        };


        author1 = new AuthorWithInsertionSortAndNaturalOrderDisplay("J.K. Rowling");
        author2 = new AuthorWithInsertionSortAndReverseOrderDisplay("Stephen King");
        author3 = new AuthorWithSelectionSortAndNaturalOrderDisplay("J.K. Rowling");
        author4 = new AuthorWithSelectionSortAndReverseOrderDisplay("Stephen King");

        addBooks (author1, bookInfo1);
        addBooks (author2, bookInfo2);
        addBooks (author3, bookInfo1);
        addBooks (author4, bookInfo2);

        author1.sortBooks();
        author2.sortBooks();
        author3.sortBooks();
        author4.sortBooks();

        System.out.println(author1.toString());
        author1.displayBooks();
        System.out.println(author2.toString());
        author2.displayBooks();
        System.out.println(author3.toString());
        author3.displayBooks();
        System.out.println(author4.toString());
        author4.displayBooks();

    }


    public static void addBooks (Author author, Map<String, String> bookInfo)
    {
        for (String authorName : bookInfo.keySet())
            author.addBook(new Book(authorName, bookInfo.get(authorName)));
    }
}