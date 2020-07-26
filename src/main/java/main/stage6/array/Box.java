package main.stage6.array;

import java.util.Arrays;
import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] box1 = new int[3];
        int[] box2 = new int[3];

        for (int i = 0; i < 3; i++) {
            box1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            box2[i] = scanner.nextInt();
        }

        Arrays.sort(box1);
        Arrays.sort(box2);

        if (box1[0] == box2[0] && box1[1] == box2[1] && box1[2] == box2[2]) {
            System.out.println("Box 1 = Box 2");
        } else if (box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }
}
/* Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();

        if (((a + b + c) == (a1 + b1 + c1)) & ((a == a1 | a == b1 | a == c1) & (b == a1 | b == b1 | b == c1) & (c == a1 | c == b1 | c == c1))) {
            System.out.println("Box 1 = Box 2");
        } else if (((a + b + c) < (a1 + b1 + c1)) & ((a < a1 | a < b1 | a < c1) & (b < a1 | b < b1 | b < c1) & (c < a1 | c < b1 | c < c1))) {
            System.out.println("Box 1 < Box 2");
        } else if (((a + b + c) > (a1 + b1 + c1)) & ((a > a1 | a > b1 | a > c1) & (b > a1 | b > b1 | b > c1) & (c > a1 | c > b1 | c > c1))) {
            System.out.println("Box 1 > Box 2");
        } else System.out.println("Incomparable");*/