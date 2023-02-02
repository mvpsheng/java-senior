package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * FileName: SingleThreadExecutor
 * author: gxs
 * Date: 2021/8/23  22:17
 */
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                "run()方法执行中...");
    }
}
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        MyRunnable runnableTest = new MyRunnable();

        for (int i = 0; i < 5; i++) {
            singleThreadExecutor.execute(runnableTest);
        }

        System.out.println("线程任务开始执行");
        singleThreadExecutor.shutdown();
    }
}
