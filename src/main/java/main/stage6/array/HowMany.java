package main.stage6.array;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //char[] characters = {'1', '2', '3', '4', '2', '1'};
        String x = scanner.next();
        char [] characters = new char[Integer.parseInt(x)];
        String y = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < characters.length; i++) {
           if (characters[i] == '2') {
                counter++;
            }
        }
       // System.out.println(6);
       // System.out.println(characters[0] + " " + characters[1] + " " + characters[2] + " " + characters[3] + " " + characters[4] + " " + characters[5]);
        System.out.println(counter);
    }
}
