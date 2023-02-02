package 死锁;

/**
 * FileName: DeadLockDemo
 * author: gxs
 * Date: 2021/10/17  20:59
 */
public class DeadLockDemo {
//    两个资源
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
           synchronized (resource1) {
               System.out.println(Thread.currentThread() + " get resource1");

           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
            System.out.println(Thread.currentThread() + " waiting get resource2");

           synchronized (resource2) {
               System.out.println(Thread.currentThread() + " get resource2");
           }
        }
        },"线程1").start();

        new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread() + " get resource2");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + " waiting get resource1");

            synchronized (resource2) {
                System.out.println(Thread.currentThread() + " get resource1");
            }
        }
        },"线程2").start();
    }
}
