package ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * FileName: ThreadPoolExecutorTest
 * author: gxs
 * Date: 2021/10/22  12:26
 */
class Task implements Runnable {
    private int taskNum;
    public Task(int taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                "正在执行task " + taskNum);
        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +
              "task " + taskNum + "执行完毕");
    }
}
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new
                ThreadPoolExecutor(2, 5, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5));
        for (int i = 0; i < 5; i++) {
            Task task = new Task(i);
            threadPoolExecutor.execute(task);

        System.out.println(Thread.currentThread().getName() +
                " 线程池中线程数目: " + threadPoolExecutor.getPoolSize() +
                " ,队列中等待执行的任务数目: " +
                threadPoolExecutor.getQueue().size() + ",以执行完的任务数目: "
                + threadPoolExecutor.getCompletedTaskCount());
    }
        threadPoolExecutor.shutdown();
    }
}
