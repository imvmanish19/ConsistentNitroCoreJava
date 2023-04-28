package com.manish.basics.week3.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int numbers[] = {3,9,16,7,5,16,16};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if(numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }
        System.out.println("Second Max: "+secondMax);
    }
}
