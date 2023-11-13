package com.ll.lambda;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

import static com.ll.lambda.Lambda6.makeRandomList2;

public class Lambda6 {
    public static void main(String[] args) {
        IntSupplier s = () ->(int)(Math.random() * 100) + 1;
        IntConsumer c = i -> System.out.print(i + ", ");
        IntPredicate p = i -> i % 2 == 0;
        IntUnaryOperator op = i ->i/10 * 10;

        int[] arr = new int[10];

        makeRandomList2(s, arr);
        System.out.println(Arrays.toString(arr));
        printEvenNum2(p, c, arr);
        int[] newArr = doSomething(op, arr);
    }

    static void makeRandomList2(IntSupplier s, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.getAsInt();
        }
    }

    static void printEvenNum2(IntPredicate p, IntConsumer c, int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            if (p.test(i)) {
                c.accept(i);
            }
        }
        System.out.println("]");
    }

    static int[] doSomething(IntUnaryOperator op, int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = op.applyAsInt(arr[i]); //apply아님의 주의하자
        }
        return newArr;
    }
}
