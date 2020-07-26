package main.stage6.array;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int len = scanner.nextInt();

        final int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int x = scanner.nextInt();
            if(array[i]> x) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }
}
  /*  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
        for (int i = 0; i < n; i++) {
        sum += sc.nextInt();
        }
        System.out.println(sum);
        }*/