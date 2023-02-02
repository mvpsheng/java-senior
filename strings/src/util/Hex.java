package util;

import java.util.Arrays;

/**
 * FileName: Hex
 * author: gxs
 * Date: 2022/8/29  15:08
 */
public class Hex {
    public static String format(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b :
                data) {
            if (n % 16 == 0) {
                result.append(String.format("%05X: ", n));
            }
            result.append(String.format("%03X ", b));
            n++;
            if (n % 16 == 0) {
                result.append("\n");
            }
        }
        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "123456789101112131415";
        System.out.println(Arrays.toString(s.getBytes()));
        System.out.println(format(s.getBytes()));
    }
}
