package ivmiit;

public class QuickSort {
    public static void quickSort(String[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        String opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i].compareTo(opora) < 0) {
                i++;
            }

            while (array[j].compareTo(opora) > 0) {
                j--;
            }

            if (i <= j) {
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

}
