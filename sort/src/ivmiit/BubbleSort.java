package ivmiit;

/**
 * Created by Регина on 10.05.2018.
 */
public class BubbleSort {
    static void bubbleSort(String[] arr) {
        int n = arr.length;
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}
