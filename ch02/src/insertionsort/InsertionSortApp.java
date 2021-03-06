package insertionsort;

import static util.SortingUtil.isCorrect;

/**
 * Created by Allen on 7/24/2016.
 */
public class InsertionSortApp {

    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1, 3};
        InsertionSort.sort(a);
        if (isCorrect(a)) {
            for (int i : a) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Algo incorrect");
        }
    }
}
