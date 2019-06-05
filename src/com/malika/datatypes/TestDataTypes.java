package com.malika.datatypes;

public class TestDataTypes {

   static int intTest;   // primitive data types
    static double testDouble;
   static float testFloat;
   static char testChar;
   static long testLong;

   static Integer intobj = 0; // wrapper objects   use for map, lists etc..
   static Double doubleobj = 0.0;
   static Float floatobj = 0.0f;
  static  Character charobj = 'c';
   static Long longobj =  0l;   // explicit casting


    public static void main(String args[])
    {

        System.out.println("intTest = " +intTest);
        System.out.println("testDouble = " +testDouble);
        System.out.println("testFloat = " +testFloat);
        System.out.println("testChar = " +testChar);
        System.out.println("testLong = " +testLong);

        System.out.println(" Wrapper class " +intobj +doubleobj +floatobj +charobj +longobj );
    }

    // loops for while, do while
}
