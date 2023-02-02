package producerandconsumer;

/**
 * FileName: PCData
 * author: gxs
 * Date: 2021/9/2  9:45
 */
public final class PCData { //任务相关数据
    private final int intData; //数据

    public PCData(int intData) {
        this.intData = intData;
    }
    public PCData(String intData) {
        this.intData = Integer.parseInt(intData);
    }
    public int getIntData() {
        return intData;
    }

    @Override
    public String toString() {
        return "PCData{" +
                "intData=" + intData +
                '}';
    }
}
