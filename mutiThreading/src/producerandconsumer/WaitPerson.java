package producerandconsumer;

/**
 * FileName: WaitPerson
 * author: gxs
 * Date: 2022/3/2  18:43
 */
public class WaitPerson implements Runnable{
    private Restaurant restaurant;
    public WaitPerson(Restaurant r) {
        restaurant = r;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {
                    while (restaurant.meal == null) {
                        wait();
                    }
                }
                System.out.println("WaitPerson got " + restaurant.meal);
                synchronized (restaurant.chef) {
                    restaurant.meal = null;
                    restaurant.chef.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("WaitPerson Interrupted");
        }
    }
}
