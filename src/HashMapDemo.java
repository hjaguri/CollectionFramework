//Entry ---> Entry is a pre-defined interface which is developed in Map interface.
// And with help of entry we can get the value in map.


import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <String , Integer> hm=new HashMap();

        hm.put("fulk",1);
        hm.put("cool",2);
        hm.put("coo",3);

        System.out.println(hm);


        //First way to get a value
//        for(Map.Entry mp : hm.entrySet()){
//            System.out.println(mp.getKey() + " " + mp.getValue());
//        }

//----->Second Way to get Value
//        Set s=hm.entrySet();
//     Iterator i=s.iterator();
//     while (i.hasNext()){
//         Map.Entry me=(Map.Entry)i.next();
//         System.out.println(me.getKey() + " " + me.getValue() + " " +  me.getClass());
//
//     }

    }
}


// Introduction--->
//1. HashMap --> Hashmap is a implemented class of Map interface.
//2. syntax -> class hashMap implements Map{};(package java.util)
//3.  Hashmap was introduced in jdk 1.2 version.
//4. HashMap underline data-structure is Hashtable

//Properties-->
//1. HashMap store the value in key-value pair
//2.Key should be unique and value can be store duplicate.
//3. Contain Only Maximum one null in key but it can store multiple null value.
//4. HashMap can contain the hetrogeneous element.(Contain  different type of element).
//5. Does not follow the sorting and insertion order.
//6. HashMap is non Synchronized data-structure.