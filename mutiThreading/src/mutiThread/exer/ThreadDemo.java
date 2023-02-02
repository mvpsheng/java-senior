package mutiThread.exer;

/**
 *
 * 练习：创建两个线程  一个遍历100以内的偶数，另一个遍历100以内的奇数
 *
 *
 *
 *
 * @auther gxs
 * @create 2020-11-02-19:43
 */
class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if ( i % 2 == 0)
                System.out.println(Thread.currentThread().getName()+" :"+i);
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if ( i % 2 != 0)
                System.out.println(Thread.currentThread().getName()+" :"+i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
//        MyThread1 m1 = new MyThread1();
//        MyThread2 m2 = new MyThread2();
//        m1.start();
//        m2.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if ( i % 2 == 0)
                        System.out.println(Thread.currentThread().getName()+" :"+i);
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if ( i % 2 != 0)
                        System.out.println(Thread.currentThread().getName()+" :"+i);
                }
            }
        }.start();
    }
}
