package builder.with_builder;

public class Main {

    /*
     *   Design Pattern: Builder
     *
     *   @author: Mahsa Sadi
     *   @since 2020 - 09 - 01
     *
     *
     */

    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.setOrder("Veggie");
        chef.setOrder("Pepperoni");
        chef.setOrder("BBQ Chicken Pizza");
    }

}
