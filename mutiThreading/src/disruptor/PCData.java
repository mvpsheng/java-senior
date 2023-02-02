package disruptor;

/**
 * FileName: PCData
 * author: gxs
 * Date: 2021/10/25  21:28
 */
public class PCData {
    private long value;
    public void set(long value) {
        this.value = value;
    }
    public long get() {
        return value;
    }
}
