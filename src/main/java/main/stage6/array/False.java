package main.stage6.array;

import java.util.Scanner;

public class False {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final int len = scanner.nextInt();

        final int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        final int n = scanner.nextInt();

        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                counter++;
            }

        }
        if(counter>0){
            System.out.println(true);
        }else System.out.println(false);
    }
}

   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int num = scanner.nextInt();
        boolean contains = false;

        for (int i = 0; i < numbers.length && !contains; i++) {
            if (numbers[i] == num) {
                contains = true;
            }
        }

        System.out.println(contains);*/