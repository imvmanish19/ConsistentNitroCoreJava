package com.manish.basics.week3.arrays;

public class ReverseCopyArray {
    public static void main(String[] args) {
        int[] A = {3,9,16,7,5,16,16};
        int n = A.length;
        int[] B = new int[n];
        for(int i=0;i<n;i++) {
            B[n-i-1] = A[i];
        }
        printArray(B);
    }

    private static void printArray(int[] numbers) {
        for(int x: numbers) {
            System.out.print(x+ " ");
        }
    }
}
