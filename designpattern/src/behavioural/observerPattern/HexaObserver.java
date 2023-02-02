package observerPattern;

/**
 * FileName: HexaObserver
 * author: gxs
 * Date: 2021/8/18  13:27
 */
public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "+
                Integer.toHexString(subject.getState()).toUpperCase());
    }
}
