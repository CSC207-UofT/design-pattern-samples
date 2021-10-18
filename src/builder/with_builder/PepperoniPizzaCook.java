package builder.with_builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PepperoniPizzaCook implements PizzaCook {

    /*
     * This apprentice cook only bakes Pepperoni Pizza.
     */

    private Pizza dish;

    @Override
    public void newDish() {
        this.dish = new PizzaDish();
    }

    @Override
    public void putBread() {
        this.dish.setBread("Italian Bread");
    }

    @Override
    public void addIngredients() {
        List<String> ing = new ArrayList<>(Arrays.asList("Pepperoni", "Garlik"));
        this.dish.setIngredients(ing);
    }

    @Override
    public void addCheese() {
        this.dish.setCheese("Mozzarella Cheese");
    }

    @Override
    public void bake() {
        this.dish.setBakingDuration(35);
        this.dish.setBakingTemperature(200);
    }

    @Override
    public void serve() {
        System.out.println(this.dish);
    }

}
