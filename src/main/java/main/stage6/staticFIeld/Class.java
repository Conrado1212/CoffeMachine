package main.stage6.staticFIeld;

public class Class {
    long longField;
    static String strField;

    static void method2() {
        System.out.println(strField);  // (1)
        //System.out.println(longField); // (2)

    }

    void method1() {
        System.out.println(strField);  // (3)
        System.out.println(longField); // (4)
    }
}
