package com.manoj.objectcloning;


// implements the Cloneable interface to make the clone of this object
// it is way to tell the JVM to perform the clone on the object of type Human
public class Human implements  Cloneable {
 String name;
 int age;

 int[] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[] {1, 2, 3, 4};
    }

    public Human(Human human) {
        this.name = human.name;
        this.age = human.age;
    }

    //shallow copy
//    public Object clone() throws CloneNotSupportedException {
//        return  super.clone();
//    }


    // Deep Copy
    public Object clone() throws CloneNotSupportedException {
        //actually a shallow copy
        Human twin = (Human)super.clone();

        //Deep copy of the object
        twin.arr = new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
