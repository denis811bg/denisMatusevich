package academy.by.academy.homework.hw4.Task3;

/**
 * Написать свой итератор для двумерного массива.
 */

import java.util.Iterator;

public class TwoDimensionalIterator<T> implements Iterator {
    private T[][] array;
    private int cursorI, cursorJ;
    private boolean flagLine;

    public TwoDimensionalIterator(T[][] array) {
        super();
        this.array = array;
    }

    public boolean isFlagLine() {
        return flagLine;
    }

    @Override
    public boolean hasNext() {
        if (array == null) {
            return false;
        }
        return cursorI < array.length && cursorJ < array[cursorI].length;
    }

    @Override
    public T next() {
        T t = array[cursorI][cursorJ++];
        flagLine = false;
        if (cursorJ >= array[cursorI].length) {
            cursorI++;
            cursorJ = 0;
            flagLine = true;
        }
        return t;
    }
}
