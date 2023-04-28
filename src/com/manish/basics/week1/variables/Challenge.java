package com.manish.basics.week1.variables;

public class Challenge {
    public static int warOfNumbers(int[]numbers){
        int odd = 0;
        int even = 0;
        for(int n: numbers) {
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.abs(even-odd);
    }
}
