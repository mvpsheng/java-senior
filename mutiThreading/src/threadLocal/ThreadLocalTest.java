package threadLocal;

/**
 * FileName: ThreadLocalTest
 * author: gxs
 * Date: 2021/10/21  19:24
 */
public class ThreadLocalTest {
//    线程本地存储变量
    private static final ThreadLocal<Integer> THREAD_LOCAL_NUM
        = new ThreadLocal<Integer>() {
    @Override
    protected Integer initialValue() {
        return 0;
    }
};

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    add10ByThreadLocal();
                }
            };
            t.start();
        }
    }

//    线程本地存储变量加5
    private static void add10ByThreadLocal() {
        for (int i = 0; i < 5; i++) {
            Integer n = THREAD_LOCAL_NUM.get();
            n += 1;
            THREAD_LOCAL_NUM.set(n);
            System.out.println(Thread.currentThread().getName() +
                    ":ThreadLocal num" + n);
        }
    }
}
