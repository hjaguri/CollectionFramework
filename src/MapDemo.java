import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map mp=new HashMap();
        mp.put(1,"hansraj");
        mp.put(2,"ram");
        mp.put(3,"sham");
        mp.put(4,"Keshav");
        System.out.println(mp);
        System.out.println(mp.containsKey(31));
        System.out.println(mp.containsValue("sham"));
        System.out.println(mp.get(1));
        System.out.println(mp.keySet());
        System.out.println(mp.remove(2));
        System.out.println(mp);
        System.out.println(mp.replace(4,"vivan"));
        System.out.println(mp);
    }
}


//Map-> Map is interface which is present in (java.util package). --> Map does not inherit Collection framework.
//2. Syntax public interface Map{};
//3. Map was introduced in jdk 1.2 version.
//4. Hierarchy of Map interface.----->>>>>>>>


//Properties oF Map
//1. Map store the data in key and value pair.example --->Name - Roll Number
//2. Key and value is know as entry
//3. Map contain unique key but value can be duplicate.
//4. In Map we can store maximum one null value in key but in value we can store   any number of null value.
//5. Does not follow insertion and sorting order.
