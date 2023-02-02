package mutiThread.java;

/**
 * 创建多线程的方式二：实现Runnable接口
 * 1.创建一个实现Runnable接口的类
 * 2.重写Thread类的run（）-->将此线程执行的操作声明在run（）中
 * 3.创建实现类的对象
 * 4.将对象作为参数传递到Thread构造器中，创建Thread类对象
 * 5.通过Thread类对象调用start（）
 *
 *
 * 比较两种线程的创建方式：
 * 开发中 优先选择Runnable 接口方式
 * 1.更适合多对象共享数据
 * 2.实现方式没有类的单继承性的局限性
 *
 * 联系：public class Thread implements Runnable
 * 相同点：两种方式都需要实现run方法，将线程要执行的逻辑声明在run（）中
 *
 *
 * @auther gxs
 * @create 2020-11-02-22:00
 */
// 1.创建一个实现Runnable接口的类
class MThread implements Runnable{
    //2.重写Thread类的run（）-->将此线程执行的操作声明在run（）中

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(i+": "+Thread.currentThread().getName());
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        //3.创建实现类的对象
        MThread m1 = new MThread();
        //4.将对象作为参数传递到Thread构造器中，创建Thread类对象
        Thread t1 = new Thread(m1);
        t1.setName("gxs");
        //5.通过Thread类对象调用start（）1.启动当前线程 2.启动当前线程的run方法
        t1.start();

        //再建立一个线程，遍历100以内的偶数
        Thread t2 = new Thread(m1);
        t2.setName("xjf");
        t2.start();
    }
}
