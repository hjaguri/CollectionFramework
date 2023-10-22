import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetMapDemo {
    public static void main(String[] args) {

        ArrayList a=new ArrayList();
        a.add(120);
        a.add(130);


        HashSet hs=new HashSet(a);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add("deeepak");
        hs.add(3333.333);
        hs.add(50);
        hs.add(60);
        System.out.println(hs);
         Iterator i= hs.iterator();
         while (i.hasNext()){
             System.out.print(i.next() + "  ");
         }
        System.out.println();
         //hs.clear();
        System.out.println(hs);
        hs.remove(50);
        System.out.println(hs.size());
        System.out.println(hs);
        System.out.println( hs.contains("deeepak"));


    }
}


//1. HashSet ->It is implement class of set interface which present in java.util package.
//2. Syntax  class HashSet implement set{};
//3. Hashset underline data-Structure is Hash-Table. --->Hashset is backed-up by MAP.
//4. Hashset was introduced in JDK 1.2 version.




//Properties
//1. Hashset is not index-based they store element according to their hashcode value.
//2. Hashset does not store duplicate element and also not store multiple null value.
//3. In hash-set we can store heterogeneous value.
//4. Does not follow the insertion order --> It store the value in the form of hash-code.
//5. Does not follow the sorting order.
//6. it is non-synchronized data-structure and data consistency is increase.

