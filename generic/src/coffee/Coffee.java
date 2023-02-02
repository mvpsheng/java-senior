package coffee;

/**
 * FileName: Coffee
 * author: gxs
 * Date: 2022/8/27  14:02
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
