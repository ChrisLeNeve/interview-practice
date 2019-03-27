package main.java;

public class Application {


    public static void main(String[] args) {
//         int[] a = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        //int[] a = {0, 1, 0, 0, 1, 0, 0};
//        System.out.println(x(0, a.length, a));
        int a = 4, b = 6;
        b = doMyTest(
                a,
                a=b
        );

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

//    private static int solution(int[] a)  {
//        int minHops = Integer.MAX_VALUE;
//        int largestFibNumberPossible = getLargestFibNumberSmallerThan(a.length);
//        int nextSmallestFib = getLargestFibNumberSmallerThan(largestFibNumberPossible - 1);
//        while (nextSmallestFib != 0) {
//            int hops = getHopsToMax(0, a.length);
//            largestFibNumberPossible = nextSmallestFib;
//            nextSmallestFib = getLargestFibNumberSmallerThan(nextSmallestFib - 1);
//        }
//
//    }

    private static int doMyTest(int a, int b) {
        return a;
//        int temp = a;
//        a = b;
//        b = temp;
    }

    private static int x(int startingPoint, int endingPoint, int[] a) {
        int smallestMin = Integer.MAX_VALUE;
        int currentGreatestFib = getLargestFibNumberSmallerThan(endingPoint - startingPoint);
        while (currentGreatestFib != 0) {
            int largestFibNumberPossible = currentGreatestFib;//getLargestFibNumberSmallerThan(endingPoint - currentGreatestFib);
            if (startingPoint + largestFibNumberPossible == endingPoint)
                return 1;
            if (a[startingPoint + largestFibNumberPossible - 1] == 1) {
                int min = 1;
                largestFibNumberPossible = getLargestFibNumberSmallerThan(endingPoint - largestFibNumberPossible);
                min += x(endingPoint - largestFibNumberPossible - 1, endingPoint, a);
                smallestMin = (min < smallestMin) ? min : smallestMin;
            }
            currentGreatestFib = getLargestFibNumberSmallerThan(currentGreatestFib - 1);
        }
//        int numberOfHops = x(largestFibNumberPossible, endingPoint);
        return smallestMin;
    }



    private static int getLargestFibNumberSmallerThan(int max) {
        if (max == 0) return 0;
        int firstValue = 0,
                secondValue = 1,
                next = Integer.MIN_VALUE;
        while (next <= max) {
            next = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = next;
        }

        return firstValue;
    }
}
