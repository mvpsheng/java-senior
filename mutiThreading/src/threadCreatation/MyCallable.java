package threadCreatation;

import java.util.concurrent.Callable;

/**
 * FileName: MyCallable
 * author: gxs
 * Date: 2021/10/19  13:21
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() +
                " call()方法执行中...");
        return 1;
    }
}
