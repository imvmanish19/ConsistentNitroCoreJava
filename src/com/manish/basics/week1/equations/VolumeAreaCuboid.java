package com.manish.basics.week1.equations;

public class VolumeAreaCuboid {
    public static void main(String[] args) {
        double l = 10;
        double b = 20;
        double h = 22;
        double volume = l*b*h;
        double area = (l*b) + (b*h) + (l*h);
        System.out.println("Volume: "+ volume+" Area: "+area);
    }
}
