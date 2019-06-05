package com.malika.datatypes;

public class OverLoading {

    public void school(int a)
    {
        System.out.println(" a is " +a);
    }

    public void school(int a, int b)
    {
        System.out.println(" a & b are " +a +b);
    }

    public void school(char c)
    {
        System.out.println( " Display my Initial " +c );
    }

    public int calculation(int a, int b)
    {
        System.out.println(" addition of 2 vars are " +(a+b));
        return a+b;
    }

    public int calculation(int a, int b, int c)
    {
        System.out.println(" addition of 3 vars are " +(a+b+c));
        return a+b+c;
    }

    public static void main(String args[])
    {
        OverLoading overLoading = new OverLoading();
        overLoading.school(10);
        overLoading.school(12,14);
        overLoading.school('K');
        overLoading.calculation(12, 13);
        overLoading.calculation(12, 13, 25);
    }
}
