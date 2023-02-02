package fill;

import java.util.Arrays;

/**
 * FileName: ArraysDotFill
 * author: gxs
 * Date: 2022/8/28  12:19
 */
public class FillingArrays {
    public static void main(String[] args) {
        int size = 6;
        boolean[] a1 = new boolean[size];
        double[] a2 = new double[size];
        Arrays.fill(a1, true);
        System.out.println("a1 " + Arrays.toString(a1));
        Arrays.fill(a2, 47);
        System.out.println("a2 " + Arrays.toString(a2));
    }
}
