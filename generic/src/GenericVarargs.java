import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * FileName: GenericVarargs
 * author: gxs
 * Date: 2022/8/28  11:43
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<T>(Arrays.asList(args));
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B");
        System.out.println(ls);
        ls = makeList("ABCDEFGHI".split(""));
        System.out.println(ls);
    }
}
