package builder.with_builder;

public class Chef {

    private PizzaCook apprenticeCook;


    /*
     * Chef receives the pizza order and calls an appropriate apprentice cook to prepare the order,
     * and tells the apprentice cook the order of the steps of cooking the ordered pizza.
     *
     */

    void setOrder(String order) {
        if (order.equals("Veggie"))
            apprenticeCook = new VeggiePizzaCook();

        else if (order.equals("Pepperoni"))
            apprenticeCook = new PepperoniPizzaCook();

        else
            System.out.println("Our staff do not know how to cook " + order + ". Please tell us how to do so!");


        if (apprenticeCook != null)
            bakePizza();
    }


    void bakePizza() {
        apprenticeCook.newDish();
        apprenticeCook.putBread();
        apprenticeCook.addIngredients();
        apprenticeCook.addCheese();
        apprenticeCook.bake();
        apprenticeCook.serve();
        apprenticeCook = null;
    }
}
