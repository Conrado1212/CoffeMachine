package main.stage6.array;

import java.util.Scanner;

public class Rotation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        final int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int j, last;
            last = array[array.length - 1];

            for (j = array.length - 1; j > 0; j--) {

                array[j] = array[j - 1];
            }

            array[0] = last;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
/* Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int move = scanner.nextInt();
        String[] n2 = numbers.clone();
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
        j = i + move;
        if (j > numbers.length - 1) {
        j = j % numbers.length;
        }
        n2[j] = numbers[i];
        }
        for (String var : n2) {
        System.out.print(var + " ");
        }*/