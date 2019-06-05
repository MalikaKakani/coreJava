package com.malika.datatypes;

import java.util.ArrayList;
import java.util.List;

public class TestIterations {

   static List<String> collection = new ArrayList<>();  // static is access specifier // list is data type // string is generic part of list
 //  arraylist is the object
    public static void main(String args[])
    {
        // for while do while switch case if else

        collection.add("Malika");
        collection.add("Ashwani");
        collection.add("Kalyan");

        forLoop();
    }

    public static void forLoop()    //
    {
        System.out.println(" printing using basic for loop");
        for(int i =0; i<collection.size(); i++)
        {
            System.out.println(collection.get(i));
        }

        System.out.println( " Printing advanced");

        for( String str: collection)  //  HW: create list of int using 3 loops
        {
            System.out.println(str);
        }

        System.out.println(" printing using stream");
        collection.stream().forEach(str-> System.out.println(str));  // lamda expression

    }
}
