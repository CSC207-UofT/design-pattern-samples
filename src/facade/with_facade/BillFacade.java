package facade.with_facade;

public class BillFacade {

    private Bill bill;
    private final BillCalculator calculator;
    private final BillLogger logger;
    private final BillPrinter printer;


    public BillFacade(BillCalculator calculator, BillLogger logger, BillPrinter printer) {
        this.calculator = calculator;
        this.logger = logger;
        this.printer = printer;
    }


    public void issueSampleBill() {
        createSampleBill();
        issueBill();
    }


    public void createSampleBill() {
        FoodItem f1 = new FoodItem("Salad", 6);
        FoodItem f2 = new FoodItem("Tuna Sandwich", 7);
        FoodItem f3 = new FoodItem("Fanta", 3);
        bill = new Bill(1);
        bill.add(f1, 2);
        bill.add(f2, 2);
        bill.add(f3, 2);

        System.out.println("A sample bill has been created.");
    }


    public void issueBill() {
        calculateTotal();
        logBill();
        printBill();
    }


    public void calculateTotal() {
        double totalPrice = calculator.calculateTotal(bill);
        this.bill.setTotal(totalPrice);
    }


    public void logBill() {
        logger.log(bill);
    }


    public void printBill() {
        printer.print(bill);
    }


}