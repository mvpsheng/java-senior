import java.util.HashMap;

class Book{
    private String ISBN;
    private String name;
    private float price;

    //构造函数
    public Book(String ISBN,String name,float price){
        this.ISBN = ISBN;
        this.name = name;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
public class HashMapDemo {
    public static void main(String[] args) {
        //定义一个Hashmap的键值对集合
        HashMap hm = new HashMap();
        Book javaBook = new Book("123","Java",65.3f);
        Book dbBook = new Book("456","DB",100.3f);

        //通过put方法设置值
        hm.put(javaBook.getISBN(),javaBook);
        hm.put(dbBook.getISBN(),dbBook);
        Book book = null;
        //通过containskey方法判断是否存在这个值
        if (hm.containsKey("123")){
            book = (Book)hm.get("123");
            System.out.println(book.getName() + "," + book.getPrice());
        }
    }
}
