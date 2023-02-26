package chap14.typeinfo;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * FileName: SweetShop
 * author: gxs
 * Date: 2021/7/27  17:17
 */

class Candy{
    static {
        print("Loading candy");
    }
}
class Gum{
    static {print("loading gum");}
}
class Cookie{
    static {print("loading Cookie");}
}
public class SweetShop {
    public static void main(String[] args) {
        print("inside main");
        new Candy();
        print("after creating candy") ;
     }
}
