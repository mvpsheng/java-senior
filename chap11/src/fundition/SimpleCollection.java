package fundition;

import java.util.ArrayList;
import java.util.Collection;

/**
 * FileName: SimpleCollection
 * author: gxs
 * Date: 2021/7/27  13:10
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            c.add(i); //autodboxing
        }
        for (Integer i : c)
            System.out.print(i + " ");
    }
}
