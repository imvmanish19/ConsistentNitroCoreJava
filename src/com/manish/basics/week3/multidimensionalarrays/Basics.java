package com.manish.basics.week3.multidimensionalarrays;

public class Basics {
    public static void main(String[] args) {
        int[][] A = new int[3][4];
        int[] E, F; // E and F are 1D arrays
        int[] X, Y[]; // X -> 1D, Y -> 2D
        int[][] B,C; // 2D Array
        B = new int[2][2];
        for(int i=0;i< A.length;i++) {
            for(int j=0;j<A[0].length;j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //Jagged 2D Array
        /**
         *
         * 0 0 0 0 0 0 0 0 0 0
         * 0 0
         * 0 0 0 0 0
         */
        int[][] J = new int[3][];
        J[0] = new int[10];
        J[1] = new int[2];
        J[2] = new int[5];

        for(int i=0;i<J.length;i++) {
            for(int j=0;j<J[i].length;j++) {
                System.out.print(J[i][j]+" ");
            }
            System.out.println();
        }
    }
}
