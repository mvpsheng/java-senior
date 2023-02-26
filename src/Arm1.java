import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * FileName: Arm1
 * author: gxs
 * Date: 2023/2/10  17:29
 */
public class Arm1 {
    private static boolean isArmString(String s) {
        int len = s.length();
        int x = Integer.parseInt(s);
        int sum = 0;
        for (int i = 0; i < len; i++) {
            double power = Math.pow(s.charAt(i), len - i);
            System.out.println(s.charAt(i));
            int i1 = Integer.parseInt(String.valueOf(power));
            sum += i1;
        }
        return sum == x;
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            Integer x = Integer.parseInt(line);
            ArrayList<Object> objects = new ArrayList<>();
            System.out.println(Integer.valueOf(String.valueOf(Math.pow(x, 2))));
            x = Integer.parseInt(String.valueOf(Math.pow(x, 2)));
            System.out.println(x);
        }
    }
}
