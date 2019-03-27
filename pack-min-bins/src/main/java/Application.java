package main.java;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

/**
 * Given n items of different weights and bins each of the same capacity c, assign each item to a bin such that number of total used bins is minimised.
 * May be assumed that all items have weights smaller than bin capacity.
 * https://www.geeksforgeeks.org/bin-packing-problem-minimize-number-of-used-bins/
 */
public class Application {

    public static void main(String[] args) {
        int[] array = new int[99999],
            arrayDupe = new int[99999];
        for (int i = 0; i < 99999; i++)
            array[i] = (int)Math.ceil(Math.random() * 100);
        arrayDupe = array.clone();

        long start, end;

        start = System.currentTimeMillis();
        Arrays.sort(array);
        end = System.currentTimeMillis();
        System.out.println("======= Arrays.sort: done in " + (end - start) + " ms ========");

        array = arrayDupe.clone();
        start = System.currentTimeMillis();
        Arrays.parallelSort(array);
        end = System.currentTimeMillis();
        System.out.println("======= Arrays.parallelSort: done in " + (end - start) + " ms ========");

        array = arrayDupe.clone();
        start = System.currentTimeMillis();
        orderArray(array);
        end = System.currentTimeMillis();
        System.out.println("======= My way: done in " + (end - start) + " ms ========");

//        int[] array = {Integer.MAX_VALUE, 0, 1, 3, 5, 7, 9, Integer.MIN_VALUE};
//        System.out.println(Arrays.toString(orderArray(array)));

    }

//    Separate problem!
    private static int[] orderArray(int[] arrayToOrder) {
        for (int i = 1; i < arrayToOrder.length; i++) {
            int currentElementIndex = i;
            while (currentElementIndex > 0 && arrayToOrder[currentElementIndex] < arrayToOrder[currentElementIndex-1]) {
                int temp = arrayToOrder[currentElementIndex];
                arrayToOrder[currentElementIndex] = arrayToOrder[currentElementIndex-1];
                arrayToOrder[currentElementIndex-1] = temp;
                currentElementIndex--;
            }
        }
        return arrayToOrder;
    }


    public static void main1(String[] args) {
        double[] array = new double[99];
        for (int i = 0; i < 99; i++)
            array[i] = Math.random() * 100;
        System.out.println(Arrays.toString(orderDoubleArray(array)));

        long start, start1, start2, end, end1, end2;

        start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++)
            Arrays.sort(array);
        end1 = System.currentTimeMillis();
        System.out.println("======= Arrays.sort: done in " + (end1 - start1) + " ms ========");

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++)
            Arrays.parallelSort(array);
        end = System.currentTimeMillis();
        System.out.println("======= Arrays.parallelSort: done in " + (end - start) + " ms ========");

        start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++)
            orderDoubleArray(array);
        end2 = System.currentTimeMillis();
        System.out.println("======= My way: done in " + (end2 - start2) + " ms ========");
    }

    private static double[] orderDoubleArray(double[] arrayToOrder) {
        for (int i = 1; i < arrayToOrder.length; i++) {
            int currentElementIndex = i;
            while (currentElementIndex > 0 && arrayToOrder[currentElementIndex] < arrayToOrder[currentElementIndex-1]) {
                double temp = arrayToOrder[currentElementIndex];
                arrayToOrder[currentElementIndex] = arrayToOrder[currentElementIndex-1];
                arrayToOrder[currentElementIndex-1] = temp;
                currentElementIndex--;
            }
        }
        return arrayToOrder;
    }




//    private int solution(int[] items, int binCapacity) {
//        Arrays.sort(items);
//        List<Integer> list = Arrays.asList(items);
//        ArrayDeque<Integer> deque = new ArrayDeque<>(items);
//    }

    //TODO:
    //List<Integer> syntax (diamond operator?)
    // Java collections cheat sheet
    // Codility
    // Pass by value or reference
    // usage of static in Java
    // arrays passed by value or reference?

}
