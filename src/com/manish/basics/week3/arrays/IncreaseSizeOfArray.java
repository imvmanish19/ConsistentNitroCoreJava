package com.manish.basics.week3.arrays;

public class IncreaseSizeOfArray {
    public static void main(String[] args) {
        int A[] = {3,9,16,7,5,16,16};
        int B[] = new int[2 * A.length];
        printArray(A);
        System.out.println("A's initial length: "+A.length);
        for(int i=0;i<A.length;i++) {
            B[i] = A[i];
        }
        A = B;
        B = null;
        printArray(A);
        System.out.println("A's new length: "+A.length);
    }

    private static void printArray(int[] numbers) {
        for(int x: numbers) {
            System.out.print(x+ " ");
        }
    }
}
