package main.stage6.array;

import java.util.Scanner;

public class SumMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int index = 0; index < size; index++) {
            numbers[index] =  scanner.nextInt();
        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int number : numbers) {
            sum += number > n ? number : 0;
        }
        System.out.println(sum);
    }
    }

   /* Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] numbers = new int[size];
        for (int index = 0; index < size; index++) {
        numbers[index] =  scanner.nextInt();
        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int number : numbers) {
        sum += number > n ? number : 0;
        }
        System.out.println(sum);*/