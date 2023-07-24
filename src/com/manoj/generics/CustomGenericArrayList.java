package com.manoj.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// This Custom arrayList only allows us to store the integer type data
// But we have to create a arrayList which provided to add generic types
// generic helps us providing paramaterized type


//restrict this particular type
// wildcard - to bound this type to only number type
public class CustomGenericArrayList<T extends Number> {
    //internal working
    //default capacity 10
    //when it get filled oit will doubling the size and create a new array with that size
    // copy the elements linearly in new array and garbage collector collects the unreferenced old array

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }


    // in this method <? extend Number> ensure that i can pass any class that extends Number class
    public void getList(List<? extends Number> list) {
        //do something
    }

    public void add(T num) {
        //check the size of the array List
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2]; //double the size

        //copy the all current items in temp array;
        for (int i=0;i<data.length;i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove(){
        return (T) (data[--size]);
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    @Override
    public void finalize() {
        System.out.println("Cleaning the unreferenced object by GC");
    }

    public static void main(String[] args)
    {
//        CustomGenericArrayList list = new CustomGenericArrayList();
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        for (int i=0;i<14; i++) {
//            list.add(i+1);
//        }
//        System.out.println(list);


        //In generics the Primitive type are not allowed as it only store the object
//        ArrayList<Integer> list2 = new ArrayList<>(); //generics helps in type safety
//        list2.add(3);
//        list2.add(4);
//        list2.add(5);

        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
//        for (int i=0; i<=14; i++) {
//            list.add(i+1);
//        }

//        list.add(10);
//        list.add(20);

        System.out.println(list);

    }
}
