package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * FileName: ExtThreadPool
 * author: gxs
 * Date: 2021/9/6  20:04
 */
public class ExtThreadPool {
    private static final long OL =  1000;

    public static class MyTasks implements Runnable{
        public String name;
        public MyTasks(String name){
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("正在执行" + ":Thread ID:" + Thread.currentThread().getId() +
                    ",Task name=" + name);
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = new ThreadPoolExecutor(5,5,OL, TimeUnit.MICROSECONDS,
                new LinkedBlockingQueue<Runnable>()){
            @Override
            protected void beforeExecute(Thread t, Runnable r) {
                System.out.println("准备执行： "+((MyTasks)r).name);
            }

            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                System.out.println("执行完成： "+((MyTasks)r).name);
            }

            @Override
            protected void terminated() {
                System.out.println("线程池退出");
            }
        };
        for (int i = 0; i < 5; i++) {
            MyTasks tasks = new MyTasks("TASK-GEYM-"+i);
            es.execute(tasks);
            Thread.sleep(10);
        }
        es.shutdown();
    }
}
