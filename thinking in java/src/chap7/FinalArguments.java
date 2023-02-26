package chap7;

/**
 * FileName: FinalArguments
 * author: gxs
 * Date: 2022/3/28  17:37
 */
class Gizmo {
    public void spin() {}
}
public class FinalArguments {
    void with(final Gizmo g) {
    }
    void withOut(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }
//    int g(final int i) {
//        i++;
//    }
public static void main(String[] args) {
    FinalArguments bf = new FinalArguments();
    bf.withOut(null);
    bf.with(null);
}
}
