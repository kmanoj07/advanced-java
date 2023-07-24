package com.manoj.generics;

import java.util.Arrays;

// This Custom arrayList only allows us to store the integer type data
// But we have to create a arrayList which provided to add generic types
// generic helps us providing paramaterized type
public class CustomArrayList {
    //internal working
    //default capacity 10
    //when it get filled oit will doubling the size and create a new array with that size
    // copy the elements linearly in new array and garbage collector collects the unreferenced old array

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
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
        int[] temp = new int[data.length * 2]; //double the size

        //copy the all current items in temp array;
        for (int i=0;i<data.length;i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public int remve(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
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
        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(4);
//        list.add(5);
        for (int i=0;i<14; i++) {
            list.add(i+1);
        }
        System.out.println(list);
    }
}
