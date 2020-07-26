package main.stage6.array;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        final int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        if(array==null || array.length == 0)
            System.out.println(false);
        int largest=0;
        for(int i=0; i<array.length;i++){
            if(array[i]>array[largest])
                largest = i;
        }
        System.out.println(largest);
    }
}
/* Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] array = new int[length];
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);*/