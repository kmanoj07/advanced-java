package com.manoj.objectcloning;

import java.util.Arrays;

public class Main {
    // something is there inside the funciton which is thrwoing the exception
    public static void main(String[] args) throws  CloneNotSupportedException {
        Human kunal = new Human("kunal", 30);
//        Human manoj = new Human(kunal);
        Human twin = (Human)(kunal.clone());


        //using the Object clone method
        // Clone - Method of the Object class to make the copy of the object

//        System.out.println(twin.age + " "+ kunal.age);
        System.out.println(Arrays.toString(kunal.arr));
        twin.arr[0] = 120;
        System.out.println(Arrays.toString(kunal.arr));
        System.out.println(Arrays.toString(twin.arr));

    }
}
