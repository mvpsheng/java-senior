import java.text.DecimalFormat;

/**
 * FileName: Test
 * author: gxs
 * Date: 2021/9/8  21:18
 */
public class Test {
    public static void main(String[] args) {
        double h= 100;
        int time = 10;
        double sum = h;
        while (time > 1){
            sum += h;
            h = h / 2;
            time --;
        }
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(sum));
        System.out.println(Double.parseDouble(df.format(sum)));
        System.out.println(sum);
    }
}
