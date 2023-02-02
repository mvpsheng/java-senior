/**
 * FileName: CountObject
 * author: gxs
 * Date: 2022/8/28  12:07
 */
public class CountObject {
    private static long count = 0;
    private final long id = count++;
    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}
