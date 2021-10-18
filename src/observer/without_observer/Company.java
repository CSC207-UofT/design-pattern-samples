package observer.without_observer;


/**
 * A company.
 */
class Company {

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


    /**
     * ##### This code is problematic see "Duplicate Method" code smell in Customer and Company.
     * Receives update notification from parcel objects.
     *
     * @param sourceObject
     * @param propertyName
     * @param oldValue
     * @param newValue
     */
    public void update(Parcel sourceObject, String propertyName, String oldValue, String newValue) {
        System.out.println("Company " + this.name + " observed a change in " +
                propertyName + " of " + sourceObject);

        System.out.println(
                oldValue + " has changed to " + newValue + ". ");

        System.out.println();
    }


    @Override
    public String toString() {
        return name;
    }
}