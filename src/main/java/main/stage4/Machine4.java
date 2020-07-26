package main.stage4;

import java.util.Scanner;

public class Machine4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The coffee machine has:");
        int water = scanner.nextInt();
        System.out.println(water + " of water");

        int milk = scanner.nextInt();
        System.out.println(milk + " of milk");

        int beans = scanner.nextInt();
        System.out.println(beans + " of coffee beans");

        int cups = scanner.nextInt();
        System.out.println(cups+ " of disposable cups");

        int money = scanner.nextInt();
        System.out.println(money + " of money");

        System.out.println("Write action (buy, fill, take): ");

        String menu = scanner.next();
        switch (menu) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int number = scanner.nextInt();
                if(number == 1){
                    System.out.println("The coffee machine has:");
                    System.out.println(water-250 + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(beans-16 + " of coffee beans");
                    System.out.println(cups-1 + " of disposable cups");
                    System.out.println(money+ 4 + " of money");
                }else if(number==2){
                    System.out.println("The coffee machine has:");
                    System.out.println(water-350 + "of water");
                    System.out.println(milk-75 + " of milk");
                    System.out.println(beans-20 + " of coffee beans");
                    System.out.println(cups-1 + "of disposable cups");
                    System.out.println(money+7 + " of money");
                }else if(number==3){
                    System.out.println("The coffee machine has:");
                    System.out.println(water-200 + "of water");
                    System.out.println(milk-100 + " of milk");
                    System.out.println(beans-12 + " of coffee beans");
                    System.out.println(cups-1 + "of disposable cups");
                    System.out.println(money+6 + " of money");
                }
            break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add: ");
                int waterAdd = scanner.nextInt();

                System.out.println("Write how many ml of milk do you want to add:  ");
                int milkAdd = scanner.nextInt();

                System.out.println("Write how many grams of coffee beans do you want to add: ");
                int beansAdd = scanner.nextInt();

                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                int cupsAdd = scanner.nextInt();

                System.out.println("The coffee machine has:");
                System.out.println(water+waterAdd + "of water");
                System.out.println(milk+milkAdd + "of milk");
                System.out.println(beans+beansAdd + "of water");
                System.out.println(cups+cupsAdd + " of disposable cups");
                System.out.println(money+ 4 + " of money");

                break;
                case"take":
                    System.out.println("I gave you " + money);
                    System.out.println("The coffee machine has:");
                    System.out.println(water + "of water");
                    System.out.println(milk + "of milk");
                    System.out.println(beans + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println(money-money  + " of money");
                    break;
            default:
                System.out.println("Unknown operator");
                break;
        }


      /*  Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");

        System.out.println("Write action (buy, fill, take):");
        String action = scanner.next();
        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int coffeeChoice = scanner.nextInt();

                switch (coffeeChoice) {
                    case 1:
                        water -= 250;
                        beans -= 16;
                        money += 4;
                        cups -= 1;
                        break;
                    case 2:
                        water -= 350;
                        milk -= 75;
                        beans -= 20;
                        money += 7;
                        cups -= 1;
                        break;
                    case 3:
                        water -= 200;
                        milk -= 100;
                        beans -= 12;
                        money += 6;
                        cups -= 1;
                        break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                int addWater = scanner.nextInt();
                water += addWater;
                System.out.println("Write how many ml of milk do your want to add:");
                int addMilk = scanner.nextInt();
                milk += addMilk;

                System.out.println("Write how many grams of coffee beans do you want to add:");
                int addBeans = scanner.nextInt();
                beans += addBeans;

                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int addCups = scanner.nextInt();
                cups += addCups;
                break;
            case "take":
                System.out.println("I gave you $" + money);
                money = 0;
                break;
        }
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");*/
    }
}
