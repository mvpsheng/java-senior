package ThreadPool;

/**
 * FileName: RejectThreadPoolDemo
 * author: gxs
 * Date: 2021/9/4  18:02
 */

import java.util.concurrent.*;


/**
 * 自定义线程池和拒绝策略的使用
 * 除了4中jdk内置的拒绝策略还可以自定义处理方法
 * */
public class RejectThreadPoolDemo {
    private static final long OL = 10000000;

    public static class TasKs implements Runnable{
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis()+":Thread ID:" +Thread.currentThread().getId());
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//自定义拒绝策略
//        TasKs tasKs = new TasKs();
//        ExecutorService es = new ThreadPoolExecutor(5, 5,OL, TimeUnit.MICROSECONDS,
//                new LinkedBlockingQueue<Runnable>(10), Executors.defaultThreadFactory(),
//                new RejectedExecutionHandler() {
//                    @Override
//                    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
//                        System.out.println(r.toString()+" is discard ");
//                    }
//                });
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            es.submit(tasKs);
//            Thread.sleep(10);
//        }

//自定义线程创建：ThreadFactory
        TasKs tasKs = new TasKs();
        ExecutorService es = new ThreadPoolExecutor(5, 5, OL, TimeUnit.MICROSECONDS,
                new SynchronousQueue<Runnable>(), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setDaemon(true);
                System.out.println("create "+ t);
                return t;
            }
        });
        for (int i = 0; i < 5; i++) {
            es.submit(tasKs);
        }
        Thread.sleep(2000);
    }
}
