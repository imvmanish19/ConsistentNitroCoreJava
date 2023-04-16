package com.manish.basics.week1.variables;

public class DefaultValueChecker {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean bool;
    char c;
    String str;

    public static void main(String[] args) {
        DefaultValueChecker defaultValueChecker = new DefaultValueChecker();
        System.out.println("Byte Default Value: "+defaultValueChecker.b);
        System.out.println("Short Default Value: "+defaultValueChecker.s);
        System.out.println("Int Default Value: "+defaultValueChecker.i);
        System.out.println("Long Default Value: "+defaultValueChecker.l);
        System.out.println("Float Default Value: "+defaultValueChecker.f);
        System.out.println("Double Default Value: "+defaultValueChecker.d);
        System.out.println("Boolean Default Value: "+defaultValueChecker.bool);
        System.out.println("Char Default Value: "+defaultValueChecker.c);
        System.out.println("String Default Value: "+defaultValueChecker.str);
    }
}
