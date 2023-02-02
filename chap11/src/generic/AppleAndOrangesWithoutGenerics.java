import java.util.ArrayList;

/**
 * FileName: AppleAndOrangesWithoutGenerics
 * author: gxs
 * Date: 2021/7/27  12:39
 */
class Apple{
    private static int counter;
    private final int id = counter++;
    public int id() {
        return id;
    }
}
class Orange{}
public class AppleAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
            // not prevented from adding an orange to apples:
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple)apples.get(i)).id();
            //orange is detected only at run time
        }
    }
}
