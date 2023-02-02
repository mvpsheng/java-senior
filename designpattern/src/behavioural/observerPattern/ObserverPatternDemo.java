package observerPattern;

/**
 * FileName: ObserverPatternDemo
 * author: gxs
 * Date: 2021/8/18  13:33
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        System.out.println("First State Change: 15");
        subject.setState(15);
        System.out.println();

        System.out.println("second state change: 10");
        subject.setState(10);
    }
}
