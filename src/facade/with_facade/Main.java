package facade.with_facade;

public class Main {

    public static void main(String[] args) {

        /*
         * Design Pattern: Facade
         *
         * @author: Mahsa Sadi
         * @since: 2020 - 08 - 31
         */

        BillCalculator calculator = new BillCalculator();
        BillLogger logger = new BillLogger();
        BillPrinter printer = new BillPrinter();

        BillFacade facade = new BillFacade(calculator, logger, printer);
        /*
         * Issuing a sample bill is composed of several steps and requires interaction
         * between several objects that are declared above.
         * However, all these complexities are hidden from the client.
         * The facade encapsulates all steps and all the coordination.
         */
        facade.issueSampleBill();

    }

}
