import java.util.HashMap;
import java.util.Map;
/**
 * use of a map with key type string and value type employee
 *
 * @auther gxs
 * @create 2020-11-17-18:55
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> staff = new HashMap<>();
        staff.put("142-23-3415",new String("gxs"));
        staff.put("123-34-6415",new String("xjf"));
        staff.put("33-3232-43",new String("scott"));
        staff.put("32-3232-43",new String("sara"));

        //print all entries
        System.out.println(staff);

        //remove an entry
        staff.remove("33-3232-43");

        //replace an entry
        staff.put("32-3232-43",new String("xff"));

        //look up a value
        System.out.println(staff.get("142-23-3415"));
        System.out.println(staff);
        //iterate through all entries
//       staff.forEach(k,v)->
//        System.out.println("key= "+k+",value= "+v);
    }
}
