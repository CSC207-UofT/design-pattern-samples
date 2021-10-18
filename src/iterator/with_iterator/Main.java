package iterator.with_iterator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * An address book application.
 */
class Main {

    /**
     * The name of the file in which the contacts are stored.
     */
    private static final String BOOK_FILE = "./addresses.txt";

    /**
     * @param args the command line arguments
     * @throws FileNotFoundException if the address book file does not exist.
     */
    public static void main(final String[] args)
            throws FileNotFoundException {

        AddressBook book = new AddressBook();
        readBook(book);



        /* ############# The solution to the problematic point #############
         * The problematic point in code has been resolved here:
         * Iteration over contact list has been encapsulated inside the iterator.
         * The contact list is not visible to the Main class which is external to iterator.
         */


        // We can use this style of for-loop (which depends upon an
        // iterator).
        System.out.println("==========");
        for (Contact c : book) {
            System.out.println(c);
        }

        // We can explicitly construct an iterator and go through it.
        Iterator<Contact> contactsIterator1 = book.iterator();
        while (contactsIterator1.hasNext()) {

            Contact c = contactsIterator1.next();

            if (c.getLastName().equalsIgnoreCase("Potter"))
                contactsIterator1.remove();

        }


        // In fact, for ANY Iterable<T> iterable, you can write a for-each
        // loop in Java:
        // for (T item: iterable) {
        //    ... doSomething(item) ...
        // }
        // the meaning of this for loop is:
        // Iterator<T> it = iterable.iterator();
        // T item;
        // while (it.hasNext()) {
        //   item = it.next();
        //   ... doSomething(item) ...
        // }

        // Notice that we can have multiple iterators for the same address book,
        // and they are independent.  Advancing one does not advance the other.
        Iterator<Contact> contacts1 = book.iterator();
        Iterator<Contact> contacts2 = book.iterator();

        System.out.println("==========");
        System.out.printf("C1: %s, %s%n", contacts1.hasNext(),
                contacts1.next());

        System.out.printf("C2: %s, %s%n", contacts2.hasNext(),
                contacts2.next());
        System.out.printf("C2: %s, %s%n", contacts2.hasNext(),
                contacts2.next());
        System.out.printf("C2: %s, %s%n", contacts2.hasNext(),
                contacts2.next());

        System.out.printf("C1: %s, %s%n", contacts1.hasNext(),
                contacts1.next());

    }

    /**
     * Reads the address book file and add contacts to book.
     *
     * @param book the AddressBook to fill with Contacts.
     * @throws FileNotFoundException if the file does not exist.
     */
    private static void readBook(AddressBook book)
            throws FileNotFoundException {
        Scanner sc = new Scanner(new File(BOOK_FILE));
        while (sc.hasNextLine()) {
            String pattern = "^\\d\\.";
            String[] record = sc.nextLine().replaceAll(pattern, "").trim().split(",");
            book.addContact(record[0], record[1], record[2],
                    record[3], record[4]);
        }
        sc.close();
    }
}