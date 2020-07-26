package main.stage6.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers, with 0 to end");
        List<Integer> list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            list.add(input);
        }
        System.out.println("You entered: " + list);
    }
}
