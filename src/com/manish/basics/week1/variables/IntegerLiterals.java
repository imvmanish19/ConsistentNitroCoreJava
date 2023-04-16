package com.manish.basics.week1.variables;

public class IntegerLiterals {
    public static void main(String[] args) {
        int a = 10;
        short b = 20;
        byte c = 30;
        char ch = 65; // byte c = 300 won't work, since 300 is a integer literal and byte can't store integer literal oustide its range
        System.out.println(a+" "+b+" "+c);
        System.out.println(ch);
        System.out.println((char)(ch+3));

        // Binary Numbers
        int binA = 0b1010;
        short binB = 0b1010;
        byte binC = 0b1010;
        System.out.println(binA+" "+binB+" "+binC); // Actual print will be in decimal

        // Octal Numbers
        int octA = 012;
        short octB = 012;
        byte octC = 013;
        System.out.println(octA+" "+octB+" "+octC); // Actual print will be in decimal

        // Hexadecimal Numbers
        int hexaA = 0xA;
        short hexaB = 0xB;
        byte hexaC = 0xC;
        System.out.println(hexaA+" "+hexaB+" "+hexaC); // Actual print will be in decimal

        // Comma separated numbers for readability
        int commaSeparatedNumber = 99_999_999; // Only for readability
        System.out.println(commaSeparatedNumber); // 99999999

        // Handling big numbers that are out of integer literal range
        long bigNumber = 909980900; // Works fine since the number is in interger range
//      long biggerNumber = 999999999999999; // Gives error => Integer number too large, solution use L or l
        long biggerNumber = 999999999999999l;
        long biggestNumber = 999999999999999L;
        System.out.println(biggerNumber);
        System.out.println(biggestNumber);

        // Negative Numbers
        byte negNum = -128;
        System.out.println(negNum);
        byte sub = (byte) (negNum-1); // Overflow
        System.out.println(sub); // 127

    }
}
