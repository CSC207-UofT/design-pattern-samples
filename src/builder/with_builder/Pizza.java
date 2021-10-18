package builder.with_builder;

import java.util.*;

public interface Pizza {


    void setBread(String bread);

    void setIngredients(List<String> ingred);

    void setCheese(String cheese);

    void setBakingDuration(int duration);

    void setBakingTemperature(int temprature);


}
