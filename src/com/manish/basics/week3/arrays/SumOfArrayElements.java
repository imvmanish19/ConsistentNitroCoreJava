package com.manish.basics.week3.arrays;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        for(int i=0;i<numbers.length;i++) {
            numbers[i] = i + 1;
        }
        System.out.println(sum(numbers));
    }

    public static int sum(int numbers[]) {
        int sum = 0;
        for(int i=0;i<numbers.length;i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
