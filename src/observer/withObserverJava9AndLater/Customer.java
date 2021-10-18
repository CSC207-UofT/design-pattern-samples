package observer.withObserverJava9AndLater;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

/**
 * A customer.
 */
public class Customer implements PropertyChangeListener {

    /**
     * This Customer's name.
     */
    private final String name;

    /**
     * Constructs a new Customer named named.
     *
     * @param name The new Customer's name.
     */
    public Customer(String name) {
        this.name = name;
    }

    /*
     * PropertyChange method must be implemented in this and every observer.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {

        System.out.println("Customer " + this.name + " observed a change in " +
                evt.getPropertyName() + " of " + evt.getSource());

        System.out.println(
                evt.getOldValue() + " has changed to " + evt.getNewValue() + ". ");

        System.out.println();
    }


    @Override
    public String toString() {
        return name;
    }

}
