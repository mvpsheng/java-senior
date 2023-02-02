import java.util.ArrayList;
import java.util.Random;

/**
 * FileName: RandomList
 * author: gxs
 * Date: 2022/8/27  13:50
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item) {
        storage.add(item);
    }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String s :
                "The quick brown jumped over the dog".split(" ")) {
            rs.add(s);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + rs.select());
        }
    }
}
