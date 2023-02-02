package ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * FileName: ScheduledExecutorServiceDemo
 * author: gxs
 * Date: 2021/9/4  17:35
 */
public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(10);
        //如果前面的任务没有完成，调度也不会启动。
        ses.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(8000);
                    System.out.println(System.currentTimeMillis()/1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        },0,2, TimeUnit.SECONDS);
    }
}
