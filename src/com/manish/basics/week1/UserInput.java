package com.manish.basics.week1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
//      String name = sc.next(); -> It stores single word Ex: Virat Kohli just stores Virat
        String name = sc.nextLine();
        System.out.println("What's your age?");
        if(sc.hasNextInt()) {
            System.out.println("Valid int value");
        }
        sc.useRadix(2); // Now, scanner is expecting binary numbers for nextInt()
        System.out.println(sc.nextDouble());
        System.out.println("Welcome "+ name);
    }
}
