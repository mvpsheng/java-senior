package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * FileName: CachedThreadPool
 * author: gxs
 * Date: 2021/8/23  21:47
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = 1;
            try {
                Thread.sleep(index * 1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                }
            });
        }
    }
}
