package main.stage2;

import java.util.Scanner;

public class Coffe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need: ");
        int n = scanner.nextInt();

        System.out.println("For " + n + " cups of coffee you will need:");
        System.out.println(n * 200 +" ml of water");
        System.out.println(n * 50 +" ml of milk");
        System.out.println(n * 15 +" g of coffe beans");

        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }
}
