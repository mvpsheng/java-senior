package proxys.StaticProxy;

/**
 * FileName: TargetImpl
 * author: gxs
 * Date: 2021/8/17  18:54
 */
public class TargetImpl implements proxys.StaticProxy.Target {
    @Override
    public String execute(){
        System.out.println("targetImpl execute!");
        return "execute";
    }
}
