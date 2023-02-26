package chap7;

/**
 * FileName: Jurassic
 * author: gxs
 * Date: 2022/3/28  17:57
 */
class smallBrain {}
final class Dinosaur {
    int i = 7;
    int j = 1;
    smallBrain x = new smallBrain();
    void f() {}
}
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.j = 40;
        n.j++;
    }
}
