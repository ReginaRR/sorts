package ivmiit;

import java.util.Random;
import java.util.Scanner;

public class AppForString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String symbols = "abcdefghijklmnopqrstuvwxyz";
            StringBuilder randString = new StringBuilder();
            int count = (int) (Math.random() * 30);
            for (int j = 0; j < count; j++)
                randString.append(symbols.charAt((int) (Math.random() * symbols.length())));
            arr[i] = randString.toString();
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
}
