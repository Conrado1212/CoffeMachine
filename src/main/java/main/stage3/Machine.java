package main.stage3;

import java.util.Scanner;

public class Machine {
    public static void main(String[] args) {


        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        //int licznik=0;
       int divide1 = (water/200);
       if(divide1 >=1){
           System.out.println("the number of coffe is " + divide1);
       }

          //  licznik++;

        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        int licznik1 = 0;
            double divide=(milk/50);
            if(divide >=1){
                System.out.println("Number of coffe is " + divide);
            }



        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scanner.nextInt();
       // int licznik2=0;
        int divide2 = (beans/15);
        if(divide2 >=1){
            System.out.println("THe number of coffe is " + divide2);
        }
           // licznik2++;

        int sum =0;
      //  sum = licznik + licznik1 + licznik2;
        System.out.println("Write how many cups of coffee you will need: ");
        int n = scanner.nextInt();
        n = ((water/200) + (milk/50) + (beans/15));
        int dir;
        dir = n - sum;
      //  if(licznik + licznik1 + licznik2 /3 >=1){
            System.out.println("Yes, I can make that amount of coffee");

       // }else {

            System.out.println("No, I can make only " + dir + " cup(s) of coffee");
       // }



       /* System.out.println("For " + n + " cups of coffee you will need:");
        System.out.println(n * 200 +" ml of water");
        System.out.println(n * 50 +" ml of milk");
        System.out.println(n * 15 +" g of coffe beans");*/
    }
}
