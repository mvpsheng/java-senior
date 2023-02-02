package reflection;

import java.lang.reflect.InvocationTargetException;

/**
 * FileName: Test1
 * author: gxs
 * Date: 2021/10/14  15:39
 */

class Father {
    public void print() {
        System.out.println("i am father");
    }
}
public class Test1 extends Father{
    @Override
    public void print() {
        System.out.println("i am son");
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Test1 son = new Test1();
        Father father = new Father();
        Object obj = son.getClass().newInstance();
        father.getClass().getDeclaredMethod("print").invoke(obj);
        System.out.println(father.getClass().getSimpleName());
    }
}
