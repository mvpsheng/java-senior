package observerPattern;

/**
 * FileName: Observer
 * author: gxs
 * Date: 2021/8/18  13:22
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
