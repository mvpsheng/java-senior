package proxys.StaticProxy;

/**
 * FileName: ProxyTest
 * author: gxs
 * Date: 2021/8/17  18:58
 */
public class ProxyTest {
    public static void main(String[] args) {
        proxys.StaticProxy.Target target = (proxys.StaticProxy.Target) new proxys.StaticProxy.TargetImpl();
        proxys.StaticProxy.Proxy p = new proxys.StaticProxy.Proxy(target);
        String result = p.execute();
        System.out.println(result);
    }
}
