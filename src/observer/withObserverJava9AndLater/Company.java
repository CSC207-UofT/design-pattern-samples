package observer.withObserverJava9AndLater;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

/**
 * A company.
 */
class Company implements PropertyChangeListener {

    /**
     * This Company's name.
     */
    private final String name;

    /**
     * Constructs a new Company named name.
     *
     * @param name This Company's name.
     */
    public Company(String name) {
        this.name = name;
    }


    /*
     * PropertyChange method must be implemented in this and every observer.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {

        System.out.println("Company " + this.name + " observed a change in " +
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