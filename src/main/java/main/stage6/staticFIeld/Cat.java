package main.stage6.staticFIeld;

public class Cat {
    static class Main{
        public static void main(String[] args) {
            System.out.println(getNumberOfCats());
        }
    }
    String name;
    int age;
    static int counter;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if(counter>5){
            System.out.println("You have too many cats");
        }

    }

    public static int getNumberOfCats() {
        Cat c1 = new Cat("c1", 3);
        Cat c2 = new Cat("c2", 4);
        Cat c3 = new Cat("c3", 5);// implement the static method
        Cat c4 = new Cat("c4", 6);// implement the static method
        Cat c5 = new Cat("c5", 3);
        Cat c6 = new Cat("c6", 4);
        Cat c7 = new Cat("c7", 4);
        return  counter;
    }

}
/*String name;
    int age;
    public static int counter;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;

        counter++;
        if (counter > 5 ) {
            System.out.println("You have too many cats");
        }

        // implement the constructor
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        return counter;
        // implement the static method
    }
*/

/*  public static int counter;
    String name;
    int age;


    // write static and instance variables

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
        // implement the constructor
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        return counter;
        // implement the static method
    }*/