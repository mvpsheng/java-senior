package producerandconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * FileName: Main
 * author: gxs
 * Date: 2021/10/18  15:02
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<PCData> queue = new LinkedBlockingQueue<>(10);
        Producer producer1 = new Producer(queue); //建立生产者
        Producer producer2 = new Producer(queue);
        Producer producer3 = new Producer(queue);
        Consumer consumer1 = new Consumer(queue);  //建立消费者
        Consumer consumer2 = new Consumer(queue);
        Consumer consumer3 = new Consumer(queue);
        ExecutorService service = Executors.newCachedThreadPool(); //建立线程池
        service.execute(producer1);
        service.execute(producer2);
        service.execute(producer3);
        service.execute(consumer1);
        service.execute(consumer2);
        service.execute(consumer3);
        Thread.sleep(4 * 1000);
        producer1.stop();   //停止生产者
        producer2.stop();   //停止生产者
        producer3.stop();   //停止生产者
        Thread.sleep(3000);
        service.shutdown();
        service.shutdownNow();
        System.out.println(service.isShutdown());
        System.out.println(service.isTerminated());
    }
}
