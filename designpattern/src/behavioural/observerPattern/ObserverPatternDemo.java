package behavioural.observerPattern;

/**
 * FileName: ObserverPatternDemo
 * author: gxs
 * Date: 2021/8/18  13:33
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        observerPattern.Subject subject = new observerPattern.Subject();
        new observerPattern.BinaryObserver(subject);
        new observerPattern.HexaObserver(subject);
        new observerPattern.OctalObserver(subject);

        System.out.println("First State Change: 15");
        subject.setState(15);
        System.out.println();

        System.out.println("second state change: 10");
        subject.setState(10);
    }
}
