package com.manish.basics.week1.equations;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double breadth = sc.nextDouble();
        double area = (height * breadth) / 2;
        System.out.println("Area: "+ area);
    }
}
