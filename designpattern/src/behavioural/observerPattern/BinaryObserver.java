package observerPattern;

/**
 * FileName: BinaryObserver
 * author: gxs
 * Date: 2021/8/18  13:23
 */
public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "+
                Integer.toBinaryString(subject.getState()));
    }
}
