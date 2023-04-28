package com.manish.basics.week3.arrays;

public class Basics {
    public static void main(String[] args) {
        int[] A = new int[5];
        int B[] = {1,2,3};
        String C[];
        C = new String[2];
        System.out.println("A--->");
        for(int i=0;i<A.length;i++) {
            System.out.println(A[i]);
        }
        System.out.println("B--->");
        for(int x: B) {
            System.out.println(x);
        }
    }
}
