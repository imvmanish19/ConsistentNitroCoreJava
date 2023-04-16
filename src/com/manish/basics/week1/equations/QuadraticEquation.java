package com.manish.basics.week1.equations;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int D = (b*b) - (4*a*c);
        double r1 = (-b + Math.sqrt(D))/(2*a);
        double r2 = (-b - Math.sqrt(D))/(2*a);
        if(D == 0) {
            System.out.println("Roots are real and equal");
        } else if(D < 0) {
            System.out.println("Roots are imaginary and unequal");
        } else {
            System.out.println("Roots are real and distinct");
        }
        System.out.println("Root 1: "+r1+" Root 2: "+r2);
    }
}
