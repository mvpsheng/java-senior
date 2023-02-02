public class EqualsDemo {
    public static void main(String[] args) {
        boolean flag = false;
        int v1 = 10;
        int v2 = 10;

        flag =(v1==v2)?true:false;
        System.out.println(flag);

        //通过new的方式创建两个integer对象
        Integer i1 = new Integer(10);
        Integer i2 = 10;

        System.out.println(i1.equals(i2));
        System.out.println(i1==i2);
    }
}
