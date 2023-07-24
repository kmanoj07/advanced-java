package com.manoj.access;

public class ObjectClass {
    int num;
    String name;
    public ObjectClass(int num, String name) {
        this.num = num;
        this.name = name;
    }
    @Override
    public int hashCode() {// It gives the random unique number representation of the object, via some hashcode algorithm internally. uniqueness of the object
        return super.hashCode();
    }
    /*
    it returns equality of the objects on its data members (comparison);
     */
    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        // instanceof method will check if the object is an instance of some class
        if(obj instanceof ObjectClass) {
            return this.num == ((ObjectClass) obj).num; // it will compare on the num value
        }
        return false;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    protected void finalize() throws Throwable {// When the GC (Garbage collector hits)
        super.finalize();
    }
    @Override
    public String toString() { //Give the string representations
        return super.toString();
    }
    public static void main(String[] args) {
        ObjectClass manoj = new ObjectClass(3, "Manoj");
        ObjectClass kunal = new ObjectClass(4, "kunal");
        //System.out.println(manoj.hashCode());

        //Gives an error - comparing two object greater tha less than using Comparable
        //if(manoj > kunal) {

        //}

        //testing the equality ==
        // == compares the reference variable value - Checking if these two variable are pointing to the same object
        if(manoj == kunal) {
            System.out.println("Manoj == Kunal");
        } else {
            System.out.println("Manoj != Kunal");
        }

        // equals(Object obj) it will compare the tqo object on the field value
        if(manoj.equals(kunal)) {
            System.out.println("equals");
        }

        System.out.println(kunal);

        //When you get the class information - it will be stored on the Heap area, as it return the object
        // We can use the different methods to get information about the class
        System.out.println(kunal.getClass().getName());
    }
}
