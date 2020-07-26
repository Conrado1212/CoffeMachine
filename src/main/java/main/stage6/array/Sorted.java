package main.stage6.array;

import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        final int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        if(arraySortedOrNot(array,len))
            System.out.println(true);
        else
            System.out.println(false);
    }
    static boolean arraySortedOrNot(int array[],int len){
        if(len == 0|| len == 1)
            return true;
        for (int i =0;i<array.length;i++)
            if(array[i-1] > array[i])
                return false;
            return true;
    }
}
/*Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
        numbers[i] = scanner.nextInt();
        }

        boolean asc = true;

        for (int i = 0; i < numbers.length - 1 && asc; i++) {
        if (numbers[i] > numbers[i + 1]) {
        asc = false;
        }
        }

        System.out.println(asc);*/