package main.java;


/**
 * Given a number n, return the dimensions in a grid of a rectangle as square as possible that would contain n, wasting at most 2 squares.
 * Example: n = 3 -> return (2, 2)
 * n = 17 -> return (6, 3)
 * n < 0 -> return null
 */

public class Application {

    class Coordinates {
        public int x;
        public int y;

        public Coordinates(int x, int y) {
            this.x = x; this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static void main(String[] args) {
        Application a = new Application();
        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================= n = 3:  " + a.solution(3) + " ===============================");
        System.out.println("============================= n = 17: " + a.solution(17) + " ===============================");
        System.out.println("============================= n = 16: " + a.solution(16) + " ===============================");
        System.out.println("============================= n = 25: " + a.solution(25) + " ===============================");
        System.out.println("============================= n = 27: " + a.solution(27) + " ===============================");
        System.out.println("============== CORNER CASES (returns null for invalid ints) ================");
        System.out.println("============================== n = -1: " + a.solution(-1) + " ================================");
        System.out.println("========================= n = 46340:  " + a.solution(46340) + " ===========================");
        System.out.println("============================ n = 46341:  " + a.solution(46341) + " ==============================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");
    }

    private Coordinates solution(int n) {
        if (!nIsValid(n))
            return null;

        int smallestSquareSide = (int) Math.ceil(Math.sqrt(n));
        Coordinates coordinates = new Coordinates(smallestSquareSide, smallestSquareSide);

        while (!conditionsAreFulfilled(coordinates, n)) {
            if (!twoBoxesAtMostAreUnused(coordinates, n))
                coordinates.x--;
            else if (!squareContainsN(coordinates, n))
                coordinates.y++;
        }

        return coordinates;
    }

    private boolean nIsValid(int n) {
        return n >= 0 && n < (int) Math.ceil(Math.sqrt(Integer.MAX_VALUE));
    }

    private boolean conditionsAreFulfilled(Coordinates point, int n) {
        return twoBoxesAtMostAreUnused(point, n) && squareContainsN(point, n);
    }

    private boolean twoBoxesAtMostAreUnused(Coordinates point, int n) {
        return ((point.x * point.y) - n <= 2);
    }

    private boolean squareContainsN(Coordinates point, int n) {
        return ((point.x * point.y) >= n);
    }
}
