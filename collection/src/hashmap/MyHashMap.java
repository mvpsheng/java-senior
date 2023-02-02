package hashmap;

import java.util.HashMap;

/**
 * FileName: MyHashMap
 * author: gxs
 * Date: 2021/9/22  18:00
 */
public class MyHashMap {

    public static void main(String[] args) {
        HashMap<Integer,Integer> counting = new HashMap<>(8);
        counting.put(1,1);
        counting.put(2,1);
        counting.put(3,1);
        counting.put(4,1);
        counting.put(5,1);
        counting.put(6,1);
        counting.put(7,1);
        counting.put(8,1);
        counting.put(9,1);
        counting.put(0,1);
        counting.put(0,1);
        System.out.println(counting.size());
        System.out.println(counting);
    }
}
