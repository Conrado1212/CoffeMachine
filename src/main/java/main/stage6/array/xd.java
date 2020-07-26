package main.stage6.array;

import java.util.Arrays;
import java.util.Scanner;

public class xd {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final int len = scanner.nextInt();

        final int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        final int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
                System.out.println(true);
            }
        }

        System.out.println(count);
    }
}