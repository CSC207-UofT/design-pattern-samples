package strategy.SortStrategies;

import java.util.List;

public interface Sorter<T> {

    /**
     * Sorts the items in list in non-decreasing order.
     */
    void sort(List<T> list);

}