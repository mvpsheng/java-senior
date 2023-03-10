package formatOutput;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * FileName: Turtle
 * author: gxs
 * Date: 2022/8/29  14:45
 */
public class Turtle {
    private String name;
    private Formatter f;
    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d, %d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.out;
        Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
        Turtle terry = new Turtle("Terry", new Formatter(outAlias));
        tommy.move(0, 0);
        tommy.move(3, 5);
        tommy.move(3, 3);
        terry.move(0, 0);
        terry.move(0, 5);
        terry.move(2, 5);
    }
}
