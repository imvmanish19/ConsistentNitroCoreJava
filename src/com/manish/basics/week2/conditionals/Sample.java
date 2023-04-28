package com.manish.basics.week2.conditionals;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isAwesome = scanner.nextBoolean();
        if(isAwesome) {
            System.out.println("Is Awesome");
        } else {
            System.out.println("Is Not Awesome");
        }
    }
}
