package mutiThread.java;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *
 * 实现callable接口
 * 1.创建FutureTask实例，创建MyCallable实例
 * 2.创建Thread实例，执行futureTask
 * 3.在主线程打印信息
 * 4.获取并打印MyCallable打印结果
 *
 *
 * @auther gxs
 * @create 2020-11-03-16:22
 */
class Callable1 implements Callable<String>{
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"执行时间是："+
                    new Date().getTime()+":循环次数是："+i);
        }
        return "MyCallable接口执行完成!";
    }
}
public class MyCallable {
    public static void main(String[] args) throws InterruptedException {
        //1.创建FutureTask实例，创建MyCallable实例
        FutureTask<String> task = new FutureTask<String>(new Callable1());
        //2.创建Thread实例，执行futureTask
        Thread t = new Thread(task,"myCallable");
        t.start();
        //3.在主线程打印信息
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"执行时间是："+
                    new Date().getTime()+":循环次数是："+i);
        }
        //4.获取并打印MyCallable打印结果
        try {
            String result = task.get();
            System.out.println("myCallable 的执行结果是："+result);
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }
}
