package academy.by.academy.homework.hw4.Task3;

/**
 * Демонстрация двумерного итератора.
 */
public class TwoDimensionalIteratorDemo {
    public static void main(String[] args) {
        Integer[][] array = {{1, 2}, {2, 3}, {8, 7}, {2, 9}};
        TwoDimensionalIterator<Integer> twoDimensionalIterator =
                new TwoDimensionalIterator<>(array);

        while (twoDimensionalIterator.hasNext()) {
            if (twoDimensionalIterator.isFlagLine()) {
                System.out.println();
            }
            System.out.print(twoDimensionalIterator.next() + " ");
        }
    }
}
