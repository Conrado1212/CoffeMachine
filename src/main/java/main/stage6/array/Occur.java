package main.stage6.array;

import java.util.Scanner;

public class Occur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        final int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < array.length-1; i++) {
                if(array[i] == n){
                    if(array[i+1] == m || array[i-1] == m){
                        System.out.println(false);
                        return;
                    }
                }
                if(array[i] == m){
                    if(array[i]+1 == n || array[i-1] == n){
                        System.out.println(false);
                        return;
                    }
                }
            }
        System.out.println(true);
    }
}
/*Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        final int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == n){
                if(array[i+1] == m || array[i-1] == m){
                    System.out.println(false);
                    return;
                }
            }
            if(array[i] == m){
                if(array[i]+1 == n  ){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);*/

/*final Scanner scanner = new Scanner(System.in);
        final int len = scanner.nextInt();

        final int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        boolean neverOccur = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == n && array[i + 1] == m) {
                neverOccur = false;
                break;
            }
            if (array[i] == m && array[i + 1] == n) {
                neverOccur = false;
                break;
            }
        }

        System.out.println(neverOccur);*/