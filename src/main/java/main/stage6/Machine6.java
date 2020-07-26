package main.stage6;

import java.util.Scanner;

public class Machine6 {
    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int cups = 9;
    private static int money = 550;

    static Scanner scanner = new Scanner(System.in);

   // static Boolean exit = false;

    enum Status{
        CHOOSE,BUY,FILL,TAKE,REMAINING,EXIT
    }
  static  Status status = Status.CHOOSE;
    public static void main(String[] args) {

        do {
            System.out.println(status);
            System.out.println("Write action (buy, fill, take, remaining, exit): ");

            String menu = scanner.next();
            switch (menu) {
                case "buy":
                    status = Status.BUY;
                    System.out.println(status);
                    buy();
                    break;
                case "fill":
                    status = Status.FILL;
                    System.out.println(status);
                    fill();
                    break;
                case "take":
                    status = Status.TAKE;
                    System.out.println(status);
                    take();
                    break;
                case "remaining":
                    status = Status.REMAINING;
                    System.out.println(status);
                    remaining();
                    break;
                case "exit":
                    System.out.println(status);
                    exit();
                    break;
            }
        } while (status != Status.EXIT);
    }
    public static void buy(){
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 - return to menu ");
        String menu2 = scanner.next();
        switch (menu2){
            case "1":{
                if (canCoffe(250, 0, 16)) {

                    water -= 250;
                    beans -= 16;
                    cups--;
                    money += 4;
                    break;
                }
            }
            case "2": {
                if (canCoffe(350, 75, 20)) {

                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    cups--;
                    money += 7;
                    break;
                }
            }
            case "3": {
                if (canCoffe(200, 100, 12)) {

                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    cups -= 1;
                    money += 6;
                    break;
                }
            }
            case "4": {
                break;
            }
            default: {
                System.out.println("Unknown operator");
                break;
            }
        }
        status = Status.CHOOSE;
    }

    public static void fill(){
        System.out.println();

        System.out.println("Write how many ml of water do you want to add: ");
        int waterAdd = scanner.nextInt();
        System.out.println();

        System.out.println("Write how many ml of milk do you want to add:  ");
        int milkAdd = scanner.nextInt();
        System.out.println();

        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int beansAdd = scanner.nextInt();
        System.out.println();

        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int cupsAdd = scanner.nextInt();
        System.out.println();

        water += waterAdd;
        milk += milkAdd;
        beans += beansAdd;
        cups += cupsAdd;

        status = Status.CHOOSE;
    }

    public static void take(){
        System.out.println("I gave you $" + money);
        money = 0;

        status = Status.CHOOSE;
    }

    public static void remaining(){
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + "  disposable cups");
        System.out.println("$"+money + "  of money");
        System.out.println("");

        status = Status.CHOOSE;
    }

    public static void exit(){
      status = Status.EXIT;
    }

    static boolean canCoffe(int waterNeed, int milkNeed, int beansNeed){
        if (water >= waterNeed) {
            if(milk >= milkNeed){
                if(beans >= beansNeed){
                    System.out.println("I have enough resources, making you a coffee!\n");
                    return true;
                }else{
                    System.out.println("Sorry, not enough beans!");
                    return false;
                }
            }else{
                System.out.println("Sorry, not enough  milk!");
                return false;
            }
        }else{
            System.out.println("Sorry, not enough  water!");
            return false;
        }
    }
}
/*private Scanner scanner;

    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    private CoffeeMachine() {
        this.scanner = new Scanner(System.in);
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.cups = 9;
        this.money = 550;
    }

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        boolean status;
        do {
            status = machine.processAction();
        }
        while (status);
    }
    public void printState() {
        System.out.println("The coffee machine has:\n" +
                String.format("%d of water\n", this.water) +
                String.format("%d of milk\n", this.milk) +
                String.format("%d of coffee beans\n", this.beans) +
                String.format("%d of disposable cups\n", this.cups) +
                String.format("%d of money", this.money));
    }

    private void processBuy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String type = this.scanner.nextLine();

        if (type.equals("back")) return;
        ;

        this.buy(Integer.valueOf(type));
    }

    private void processFill() {
        System.out.println("Write how many ml of water do you want to add:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int beans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cups = scanner.nextInt();

        this.fill(water, milk, beans, cups);

    }

    private void processTake() {
        System.out.println(String.format("I gave you $%d", this.money));
        this.take();
    }
     private void fill(int water, int milk, int beans, int cups) {
        this.water += water;
        this.milk += milk;
        this.beans += beans;
        this.cups += cups;
    }

    private void take() {
        this.money = 0;
    }

    private void buy(int type) {
        int water = 0;
        int milk = 0;
        int beans = 0;
        int money = 0;

        switch (type) {
            case 1: {
                water = 250;
                milk = 0;
                beans = 16;
                money = 4;
                break;
            }
            case 2: {
                water = 350;
                milk = 75;
                beans = 20;
                money = 7;
                break;
            }
             case 3: {
                water = 200;
                milk = 100;
                beans = 12;
                money = 6;
                break;
            }
            default: {
                break;
            }
        }

        if (this.water < water) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milk < milk) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.beans < beans) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= water;
            this.milk -= milk;
            this.beans -= beans;
            this.cups--;
            this.money += money;
        }
    }

    public boolean processAction() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = this.scanner.nextLine();

        switch (action) {
            case "buy": {
                this.processBuy();
                break;
            }
            case "fill": {
                this.processFill();
                break;
            }
            case "take": {
                this.processTake();
                break;
            }
            case "remaining": {
                this.printState();
                break;
            }
            case "exit": {
                return false;
            }
            default: {
                break;
            }
        }
        return true;
    }
}
 */