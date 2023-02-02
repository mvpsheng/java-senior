import util.BasicGenerator;
import util.Generator;

/**
 * FileName: BasicGeneratorDemo
 * author: gxs
 * Date: 2022/8/28  12:10
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountObject> gen = BasicGenerator.create(CountObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
