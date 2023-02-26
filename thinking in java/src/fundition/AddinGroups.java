package fundition;

import java.util.*;

/**
 * FileName: AddinGroups
 * author: gxs
 * Date: 2021/7/27  13:14
 */
public class AddinGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        System.out.println(collection);
        for (Integer i : collection)
            System.out.println(i);
        //Collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection,11,12,13,14,15);
        System.out.println("__________________________");
        System.out.println(collection);
        for (Integer i : collection)
            System.out.println(i);
        Collections.addAll(collection,moreInts);
        System.out.println("__________________________");
        System.out.println(collection);
        for (Integer i : collection)
            System.out.println(i);
        // produces a list "backed by" an array:
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1,99); //modify an element
        System.out.println("__________________________");
        System.out.println(list);
        for (Integer i : list)
            System.out.println(i);
       // list.add(21); //runtime error  the underlying array cannot be resized
    }
}
