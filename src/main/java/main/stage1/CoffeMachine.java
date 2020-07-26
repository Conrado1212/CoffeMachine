package main.stage1;

import java.util.Scanner;

public class CoffeMachine {
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




      /*  System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);

        int coffees = scanner.nextInt();
        int water = 200 * coffees;
        int milk = 50 * coffees;
        int beans = 15 * coffees;

        System.out.println("For " + coffees + " cups of coffee you will need:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");*/
    }
}
