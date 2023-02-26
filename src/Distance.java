import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * FileName: Distance
 * author: gxs
 * Date: 2023/2/10  17:43
 */
public class Distance {
/**
 * (25, 4) (1, -6)
 * 预期输出
 * 下载测试：1 项输出
 * 26
 * 测试 2
 * 测试输入
 * 下载测试 2 输入
 * (47, 43) (-25, -11)
 * 预期输出
 * 下载测试：2 项输出
 * 90
 * */
    private static int calDis(String s) {
        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ' ') {
                continue;
            } else if (s.charAt(i) == ')') {
                newS.append(',');
            } else {
                newS.append(s.charAt(i));
            }
        }
        String[] xys = newS.toString().split(",");
        int dis = (int) Math.sqrt(Math.pow(Integer.parseInt(xys[0]) - Integer.parseInt(xys[2]), 2) +
                Math.pow(Integer.parseInt(xys[1]) - Integer.parseInt(xys[3]),2));
        return dis;
    }
public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
        calDis(line);
//        System.out.println(line);
    }
}
}
