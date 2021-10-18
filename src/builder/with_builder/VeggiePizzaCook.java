package builder.with_builder;

import java.util.*;

public class VeggiePizzaCook implements PizzaCook {

    /*
     * This apprentice cook only bakes veggie Pizzas.
     */

    private Pizza dish;


    @Override
    public void newDish() {
        this.dish = new PizzaDish();
    }

    @Override
    public void putBread() {
        this.dish.setBread("Whole Wheet Bread");

    }

    @Override
    public void addIngredients() {
        List<String> ing = new ArrayList<>(Arrays.asList("Mushroom", "Green Pepper", "Zucchini", "Garlik", "Basil"));
        this.dish.setIngredients(ing);
    }

    @Override
    public void addCheese() {
        this.dish.setCheese("Parmesan Cheese");
    }

    @Override
    public void bake() {
        this.dish.setBakingDuration(20);
        this.dish.setBakingTemperature(180);
    }

    @Override
    public void serve() {
        System.out.println(this.dish);
    }

}
