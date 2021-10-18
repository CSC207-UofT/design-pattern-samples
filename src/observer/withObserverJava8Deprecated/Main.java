package observer.withObserverJava8Deprecated;

public class Main {

    /*
     * Note: Observer interface and Observable class have been deprecated since Java 9.
     * see https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/util/Observable.html
     * see https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/util/Observer.html
     * One reason for deprecation is that the observers do not receive enough information
     * about what property has changed and do not have direct access to that property.
     */

    public static void main(String[] args) {
        Company store = new Company("Clothing-R-Us");
        Customer jen = new Customer("Jen C");
        Parcel order1 = new Parcel("TX342", "Vancouver, BC");

        order1.addObserver(store);
        order1.addObserver(jen);
        order1.updateLocation("Calgary, AB");
        order1.updateLocation("Winnipeg, MB");
        order1.updateLocation("Toronto, ON");
    }
}