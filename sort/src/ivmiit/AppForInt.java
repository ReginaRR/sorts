/*package ivmiit;

import java.util.Random;
import java.util.Scanner;
public class AppForInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        QuickSortNew.iterativeQsort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Программа выполнялась " + timeSpent + " миллисекунд");
    }
}*/
