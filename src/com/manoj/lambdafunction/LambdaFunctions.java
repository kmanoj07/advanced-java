package com.manoj.lambdafunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
        }
        //item represent every single item one by pne
        //parameters and body of the function
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);
//        arr.forEach((item) -> System.out.println(item * 2));

        Operation sum = new Operation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };

        Operation sub = (a, b) -> a-b;
        Operation mul = (a, b) -> a * b;

        LambdaFunctions  lambdaFunctions = new LambdaFunctions();
        System.out.println(lambdaFunctions.operate(5, 4, sum));
        System.out.println(lambdaFunctions.operate(2, 4, mul));
        System.out.println(lambdaFunctions.operate(5, 3, sub));

    }

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }

    // lambda function are inline function or some time unnamed function
    int sum(int a, int b) {
        return a+ b;
    }
}

interface  Operation {
    int operation(int a, int b);
}
