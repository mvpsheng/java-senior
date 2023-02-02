/**
 * 多线程的创建：方式一：继承于Thread类
 * 1.创建一个继承于于Thread类的子类
 * 2.重写Thread类的run（）-->将此类要执行的操作声明在run（）中
 * 3.创建Thread类子类的对象
 * 4.通过此对象调用start（）
 *
 * @auther gxs
 * @create 2020-11-02-19:12
 */
//1.创建一个继承于Thread类的子类
class MyThread extends Thread{
    @Override
    //2.重写run（）
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(i+": "+Thread.currentThread().getName());
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        //3.创建继承Thread类的子类的对象
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        //4.通过此对象调用start（）:1.启动当前线程 2.调用当前线程的run（）
        m1.start();
        //问题一：不能通过调用run（）来启动线程
        // t1.run();
        //问题二：不能再启动已经启动的线程
        m2.start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(i+": "+Thread.currentThread().getName());
        }
    }
}

