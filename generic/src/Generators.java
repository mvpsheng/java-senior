import coffee.Coffee;
import coffee.CoffeeGenerator;
import fibonacci.Fibonacci;
import util.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * FileName: Generators
 * author: gxs
 * Date: 2022/8/28  11:49
 */
public class Generators {
    public static <T> Collection<T>
        fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(
                new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee c :
                coffee) {
            System.out.println(c);
        }
        Collection<Integer> fnumbers = fill(
                new ArrayList<Integer>(), new Fibonacci(), 12);
        for (int i :
                fnumbers) {
            System.out.print(i + ", ");
        }
    }
}
