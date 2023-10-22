//TreeMap--> IT is implemented class of NavigableMap, but it also inherits the properties
//of sortedMap and Map interface.

//Syntax--> class TreeMap implements NavigableMap{}; (cloneable , serialization).
// package --> java.util
//introduced version jdk 1.2.
//underline data-structure is red-black Tree.

//Properties of Red-Black Tree
//1. Every node is either red and black.
//2. The root node is always black
//3. Every leaf node (NULL Node) is black.
//4. If a node is red , then both its children are black.
//5. For each node , all paths from the node to its descendant leaf node contain  the same number of black node.


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

//        TreeMap tm=new TreeMap();
//
//        tm.put(1,"map");
//        tm.put(3,"cap");
//        tm.put(2,"sab");
//        tm.put(5,"dap");
//        tm.put(4,"sab");
//
//        Set s= tm.entrySet();
//        System.out.println(s);
//        System.out.println( tm.ceilingEntry(0));
//        System.out.println(tm.ceilingKey(1));
//        System.out.println(tm.firstEntry());
//        System.out.println(tm.firstKey());
//        System.out.println(tm.floorEntry(9));
//        System.out.println(tm.get(1));
//        System.out.println(tm.headMap(3));
//        System.out.println(tm.higherEntry(4));
//        System.out.println(tm.isEmpty());
//        System.out.println(tm.keySet());
//        System.out.println(tm.lastEntry());
//      //  System.out.println(tm.pollFirstEntry());
//      //  System.out.println(tm.pollLastEntry());
//        System.out.println(tm.remove(3));
//        System.out.println(tm.replace(4 , "Hansraj"));
//        System.out.println(tm.size());
//        System.out.println(tm.subMap(3,6));
//        //tm.clear();

//        System.out.println(tm);

    }
}



//Properties
//1. We can store the data in key-value pair.
//2. Key are unique and value can be duplicate.
//3. Tree can not follow the insertion order but the follow the sorting order with respect to key.
//4. We can store homogeneous and heterogeneous. (Default nature sorting)homogeneous
//5. TreeMap can not store null value.
//6. Treemap is non-synchronized.It means thread are execute parallel.