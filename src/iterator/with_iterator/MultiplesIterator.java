package iterator.with_iterator;

import java.util.*;

/*
 * extra little example of implementing the iterator interface
 */

class MultiplesIterator implements Iterator<Integer> {
    private final int base;
    private int next;
    private final int top;

    /**
     * Return an iterator of Integers that are multiples of i in
     * the range 0 .. n - 1.
     */
    public MultiplesIterator(int i, int n) { //e.g., i = 2, n = 100
        base = i;
        top = n;
    }

    public Integer next() {
        int n = next;
        next = next + base; // set up for the next time you call this method
        return n;
    }

    public boolean hasNext() {
        return next < top;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        MultiplesIterator mi = new MultiplesIterator(5, 17);
        while (mi.hasNext())
            System.out.println(mi.next());
    }

}