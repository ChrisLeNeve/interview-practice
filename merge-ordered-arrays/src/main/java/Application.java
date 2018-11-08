package main.java;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9},
                b = {2, 3, 6, 6, 8, 10, 12},
                c = {Integer.MIN_VALUE, 0, 1, 2, 3, 4, 4, 56, 57, 58, 59, 60, 61, 101, Integer.MAX_VALUE};
        System.out.println("======================================================================================");
        System.out.println("==================================== Arrays used: ====================================");
        System.out.println("a: " + Arrays.toString(a) + ", b: " + Arrays.toString(b) + ", c: " + Arrays.toString(c));
        System.out.println("========================= Merge 2 ordered arrays (a and b) ===========================");
        System.out.println(Arrays.toString(mergeOrderedArrays(a, b)));
        System.out.println("=============================== Merge N ordered arrays ===============================");
        System.out.println(Arrays.toString(mergeNOrderedArrays(a, b, c)));
        System.out.println("======================================================================================");
        System.out.println("======================================================================================");
    }

    /**
     * Given 2 ordered arrays, merge them to form 1 ordered array.
     * @param a
     * @param b
     * @return a merged, ordered array
     */
    private static int[] mergeOrderedArrays(int[] a, int[] b) {
        int currentIndexA = 0, currentIndexB = 0, currentIndexMerged = 0, sizeMergedArray = a.length + b.length;
        int[] mergedArray = new int[sizeMergedArray];

        while (currentIndexA < a.length && currentIndexB < b.length) {
            if (a[currentIndexA] < b[currentIndexB])
                mergedArray[currentIndexMerged++] = a[currentIndexA++];
            else
                mergedArray[currentIndexMerged++] = b[currentIndexB++];
        }
        if (currentIndexA == a.length) {
            for (int i = currentIndexB; i < b.length; i++)
                mergedArray[currentIndexMerged++] = b[i];
        } else if (currentIndexB == b.length) {
            for (int i = currentIndexA; i < a.length; i++)
                mergedArray[currentIndexMerged++] = a[i];
        }

        return mergedArray;
    }

    /**
     * Given n ordered arrays, merge them to form 1 merged, ordered array.
     * @param arrays
     * @return merged, ordered array
     */
    private static int[] mergeNOrderedArrays(int[]... arrays) {
        int[] mergedArray = new int[0];
        for (int[] a: arrays)
            mergedArray = mergeOrderedArrays(mergedArray, a);

        return mergedArray;
    }
}
