package producerandconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * FileName: Restaurant
 * author: gxs
 * Date: 2022/3/2  18:44
 */
public class Restaurant {
    Meal meal;
    ExecutorService exec = Executors.newCachedThreadPool();
    WaitPerson waitPerson = new WaitPerson(this);
    Chef chef = new Chef(this);
    public Restaurant() {
        exec.execute(chef);
        exec.execute(waitPerson);
    }

    public static void main(String[] args) {
        new Restaurant();
    }
}
