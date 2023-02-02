package proxys.StaticProxy;

/**
 * FileName: Proxy
 * author: gxs
 * Date: 2021/8/17  18:55
 */
class Proxy implements proxys.StaticProxy.Target {
    private proxys.StaticProxy.Target target;
    public Proxy(proxys.StaticProxy.Target target){
        this.target =target;
    }

    @Override
    public String execute() {
        System.out.println("perProcess");
        String result = this.target.execute();
        System.out.println("postProcess");
        return result;
    }
}
