package com.manish.basics.week1.equations;

public class TriangleAreaGivenSides {
    public static void main(String[] args) {
        int a = 13, b = 12, c = 12;
        double s = (double) (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
    }
}
