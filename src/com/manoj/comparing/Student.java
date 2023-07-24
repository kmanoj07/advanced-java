package com.manoj.comparing;


import java.util.Arrays;
import java.util.Comparator;

// Comparable class is a part of java.lang
public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.marks - o.marks);

        // if diff == 0, equal
        // if diff > 0, this object is bigger
        // if diff < 0, this object is lesser
    }

    public static Comparator<Student> rollNoComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.rollNo - o2.rollNo;
        }
    };

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }

    public static  void main(String[] args) {
//        Student kumar = new Student(10, 95.0f);
//        Student manoj = new Student(4, 90);
//
//        if(manoj.compareTo(kumar) > 0) {
//            System.out.println("manoj has more marks.");
//        } else if (manoj.compareTo(kumar) < 0) {
//            System.out.println("manoj has less marks.");
//        } else {
//            System.out.println("Both have equal marks.");
//        }

        Student[] stdArray = new Student[5];
        stdArray[0] = new Student(10, 49);
        stdArray[1] = new Student(1, 67);
        stdArray[2] = new Student(4, 89);
        stdArray[3] = new Student(2, 90);
        stdArray[4] = new Student(3, 45);

        Arrays.sort(stdArray);
        System.out.println(Arrays.toString(stdArray));
    }
}
