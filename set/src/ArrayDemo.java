class Person{
    int id;
}
public class ArrayDemo {
    public static void main(String[] args) {
        Person[] a = null;
        Person[] b = new Person[3];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Person();
        }

        Person[] c = {
                new Person(),new Person(),new Person()
        };
       // System.out.println("a.length=" + a.length);
        System.out.println("b.length=" + b.length);
        int[] intArr ={1,2,3};
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
