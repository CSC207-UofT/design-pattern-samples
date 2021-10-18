package builder.with_builder;

import java.util.List;

public class PizzaDish implements Pizza {

    private String bread;
    private List<String> ingred;
    private String cheese;
    private int bakingDuration;
    private int bakingTemperature;


    @Override
    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public void setIngredients(List<String> ingred) {
        this.ingred = ingred;
    }

    @Override
    public void setCheese(String cheese) {
        this.cheese = cheese;

    }

    @Override
    public void setBakingDuration(int duration) {
        this.bakingDuration = duration;
    }

    @Override
    public void setBakingTemperature(int temperature) {
        this.bakingTemperature = temperature;

    }

    public String toString() {
        return "The dish is made of " + this.bread + "," +
                this.ingred.toString().replace('[', ' ').replace(']', ',') +
                " " + this.cheese + ". It was baked at " + this.bakingTemperature + " for " + this.bakingDuration +
                " minutes. Please enjoy!";
    }

}
