package observerPattern;

/**
 * FileName: OctalObserver
 * author: gxs
 * Date: 2021/8/18  13:25
 */
public class OctalObserver extends observerPattern.Observer {
    public OctalObserver (observerPattern.Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "+
                Integer.toOctalString(subject.getState()));
    }
}
