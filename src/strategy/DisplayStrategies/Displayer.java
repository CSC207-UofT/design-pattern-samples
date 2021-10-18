package strategy.DisplayStrategies;

import java.util.*;

public interface Displayer<T> {

    /**
     * Displays a list of items.
     */
    void display(List<T> list);
}
