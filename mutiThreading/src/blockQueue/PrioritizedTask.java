package blockQueue;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * FileName: PrioritizedTask
 * author: gxs
 * Date: 2022/3/2  19:14
 */
public class PrioritizedTask implements
Runnable, Comparable<PrioritizedTask> {
    private Random rand = new Random(47);
    private static int counter = 0;
    private final int priority;

    public PrioritizedTask(int priority) {
        this.priority = priority;

    }


    @Override
    public int compareTo(PrioritizedTask o) {
        return Integer.compare(o.priority, priority);
    }

    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(rand.nextInt(250));
        } catch (InterruptedException e) {

        }
        System.out.println(this);
    }
}
