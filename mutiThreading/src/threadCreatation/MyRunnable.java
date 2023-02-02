package threadCreatation;

/**
 * FileName: MyRunnable
 * author: gxs
 * Date: 2021/10/19  13:18
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " run()方法执行中...");
    }
}
