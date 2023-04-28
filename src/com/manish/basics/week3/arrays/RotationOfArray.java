package com.manish.basics.week3.arrays;

public class RotationOfArray {
    public static void main(String[] args) {
        int numbers[] = {3,9,16,7,5,16,16};
        leftRotate(numbers);
        printArray(numbers);
        int rightNumbers[] = {3,9,16,7,5,16,16};
        rightRotate(rightNumbers);
        printArray(rightNumbers);
    }

    private static void leftRotate(int numbers[]) {
        int temp = numbers[0];
        for(int i=1;i<numbers.length;i++) {
            numbers[i-1] = numbers[i];
        }
        numbers[numbers.length-1] = temp;
    }

    private static void rightRotate(int numbers[]) {
        int temp = numbers[numbers.length-1];
        for(int i=numbers.length-1;i>0;i--) {
            numbers[i] = numbers[i-1];
        }
        numbers[0] = temp;
    }

    private static void printArray(int[] numbers) {
        for(int x: numbers) {
            System.out.print(x+ " ");
        }
    }
}
