package main.stage6.array;

import java.util.Scanner;

public class Occur2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] x = new int[size];
        for (int i = 0; i < size; i++) {
            x[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < size - 1; i++) {
            if (x[i] == n) {
                if (x[i + 1] == m) {
                    System.out.println(false);
                    return;
                }
            }
            if (x[i] == m) {
                if (x[i + 1] == n) {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
