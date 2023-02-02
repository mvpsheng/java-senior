package mutiThread.java;

/**
 *测试Thread中的常用方法
 * 1.run（）通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 2.start（）启动当前线程，调用当前线程的run（）
 * 3.getName（）获得当前线程的名字
 * 4.setName() 设置当前线程的名字
 * 5.currentThread() 静态方法，返回当前执行代码的线程
 * 6.yield() 释放当前cpu的执行权
 * 7.join(): 在线程a中调用线程b的join（）方法，线程a进入阻塞状态，直到线程b完成执行，
 *      线程a结束阻塞
 * 8.stop（）：已过时，当执行方法时，强制停止当前执行的线程
 * 9.sleep（long millitime）：让当前线程睡眠，在 mt毫秒 时间内处于阻塞状态
 * 10.isAlive（）
 *
 *  线程的优先级：
 *  1.MAX_PRIORITY 10
 *  MIN_PRIORITY 1
 *  NORM_PRIORITY 5
 *  2.如何设置当前线程的优先级：
 *  setPriority(int p) 设置优先级
 *  getPriority() 获取当前优先级
 *
 *  说明：高优先级的线程要抢占低优先级的线程的cpu执行权，但是只是从概率上讲，高优先级的
 *  线程高概率情况被执行，并不意味着所有高优先级的线程执行完之后低优先级的线程才执行。
 *
 *
 * @auther gxs
 * @create 2020-11-02-20:15
 */
class HelloThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if ( i % 2 == 0)
//                try {
//                    sleep(10);
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName()+" :"+Thread.currentThread().getPriority()+":"+i);
//            if (i % 20 == 0)
//               this.yield();
        }
    }
    public HelloThread(String name){
        super(name);
    }
}
public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("Thread:gxs");

        //h1.setName("线程一");
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if ( i % 2 == 0)
                System.out.println(Thread.currentThread().getName()+" :"+Thread.currentThread().getPriority()+":"+i);
            if (i == 20){
                try {
                    h1.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println(h1.isAlive());
    }
}
