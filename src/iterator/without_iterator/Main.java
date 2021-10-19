package iterator.without_iterator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * An address book application.
 */
public class Main {

    /**
     * The name of the file in which the contacts are stored.
     */
    private static final String BOOK_FILE = "addresses.txt";

    /**
     * @param args the command line arguments
     * @throws FileNotFoundException if the address book file does not exist.
     */
    public static void main(String[] args)
            throws FileNotFoundException {
        AddressBook addressBook = new AddressBook();
        readBook(addressBook);

        /* ######## The problematic point in code ##############
         *
         * To iterate over the contacts available in the addressBook,
         * it is required to directly access the contacts elements which belongs to addressBook
         * and should only be accessible to addressBook.
         * (we needed to add a public getter to access the list of contacts)
         *
         * A contact can be deleted directly by an external object (i.e.; Main), negating the Open-Closed Principle.
         */

        /*
         * Note that we can write the following for each loop because ArrayList class implements
         * the Iterable interface.
         *
         */
        for (Contact contact : addressBook.getContacts()) {

            if (contact.getLastName().equalsIgnoreCase("Potter")) {
                addressBook.remove(contact);
                break;
            }

        }


        for (Contact contact : addressBook.getContacts()) {
            System.out.println(contact);
        }


        /*
         * ######### The end of the problematic code ############
         */

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