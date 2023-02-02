package producerandconsumer;

/**
 * FileName: Meal
 * author: gxs
 * Date: 2022/3/2  18:41
 */
class Meal {
    private final int orderNum;
    public Meal (int orderNum) {
        this.orderNum = orderNum;
    }
    public String toString() {
        return "Meal " + orderNum;
    }
}

