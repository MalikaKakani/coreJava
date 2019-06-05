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

    public static void main(String args[])
    {
        OverLoading overLoading = new OverLoading();
        overLoading.school(10);
        overLoading.school(12,14);
    }
}
