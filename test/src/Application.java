import java.util.Arrays;
import java.util.Comparator;

public class Application {
    public static void main(String[] args) {
        long[] A = {9, 9, 9, 9};
        long[][] points = new long[A.length][2];

        Comparator<long[]> pointCompare = new Comparator<long[]>() {
            public int compare(long[] o1, long[] o2) {
                if (o1[0] - o1[1] == o2[0] - o2[1]) {
                    if ((o1[0] + o1[1]) > (o2[0] + o2[1])) {
                        return 1;
                    } else if ((o1[0] + o1[1]) == (o2[0] + o2[1])) {
                        return 0;
                    } else {
                        return -1;
                    }
                } else if ((o1[0] - o1[1]) > (o2[0] - o2[1])) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        for (int i = 0; i < A.length; i++) {
            points[i][0] = i;  // the center of the disc
            points[i][1] = A[i];   // the radius of the disc
        }
        Arrays.sort(points, pointCompare);
    }
}
