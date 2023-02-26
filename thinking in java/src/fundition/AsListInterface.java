package fundition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * FileName: AsListInterface
 * author: gxs
 * Date: 2021/7/27  13:27
 */
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInterface {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Powder());
        //collections.addll() doesn't get confused:

        List<Snow> snow2 = new ArrayList<Snow>();
        Collections.addAll(snow2,new Light(),new Heavy());
        List<Snow> snow3 = Arrays.<Snow>asList(new Light(),new Heavy());
        System.out.println(snow1);
        System.out.println(snow2);
        System.out.println(snow3 );
    }
}
