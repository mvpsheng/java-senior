import java.util.ArrayList;

/**
 * FileName: GenericsAndUpcasting
 * author: gxs
 * Date: 2021/7/27  12:55
 */
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Brash extends Apple{}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Brash());
        for (Apple c : apples)
            System.out.println(c);
    }
}
