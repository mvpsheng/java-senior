package threadCreatation;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * FileName: ThreadTest
 * author: gxs
 * Date: 2021/10/19  13:14
 */
public class ThreadTest {
    public static void main(String[] args) {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyCallable());
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            Thread.sleep(1000);
            System.out.println("返回结果"+futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+
                " main()方法执行结束");
    }
}
