package ivmiit;

import java.util.Stack;

public class QuickSortNew {
    public static void iterativeQsort(String[] numbers) {
        Stack stack = new Stack();
        stack.push(0);
        stack.push(numbers.length);

        while (!stack.isEmpty()) {
            int end = (int)stack.pop();
            int start = (int)stack.pop();
            if (end - start < 2) {
                continue;
            }
            int p = start + ((end - start) / 2);
            p = partition(numbers, p, start, end);

            stack.push(p + 1);
            stack.push(end);

            stack.push(start);
            stack.push(p);

        }
    }

    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(String[] input, int position, int start, int end) {
        int l = start;
        int h = end - 2;
        String piv = input[position];
        swap(input, position, end - 1);

        while (l < h) {
            if (input[l].compareTo(piv) < 0) {
                l++;
            } else if (input[h].compareTo(piv) >= 0) {
                h--;
            } else {
                swap(input, l, h);
            }
        }
        int idx = h;
        if (input[h].compareTo(piv) < 0) {
            idx++;
        }
        swap(input, end - 1, idx);
        return idx;
    }

}
