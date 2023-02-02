package threadCreatation;

/**
 * FileName: ThreadClassExtention
 * author: gxs
 * Date: 2021/10/19  13:12
 */
public class ThreadClassExtention extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" run()方法正在执行...");
    }
}
