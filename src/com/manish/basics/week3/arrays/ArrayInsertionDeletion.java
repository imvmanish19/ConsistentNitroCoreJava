package com.manish.basics.week3.arrays;

public class ArrayInsertionDeletion {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for(int i=0;i<6;i++) {
            arr[i] = i + 1;
        }
        int n = 6; // no. of elements initialized
        insert(arr, n, 0, 10);
        n++;
        printArray(arr);
        delete(arr, n, 1);
        printArray(arr);
    }

    public static void insert(int arr[], int n, int index, int element) {
        for(int i=n;i>index;i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = element;
    }

    public static void delete(int arr[], int n, int index) {
       for(int i=index;i<n-1;i++) {
           arr[i] = arr[i+1];
       }
       arr[n-1] = -1;
    }

    private static void printArray(int[] numbers) {
        for(int x: numbers) {
            System.out.print(x+ " ");
        }
        System.out.println();
    }
}
