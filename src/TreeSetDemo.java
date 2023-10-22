//  CompareTo Method

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(100);
        ts.add(10);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        ts.add(60);
        System.out.println(ts);

    }
}



//1.  TreeSet -> TreeSet is the direct-implemented class of navigable set but in-directly implements that sorted set
//and set interface.(java.util.package)
//2. class TreeSet implement NavigableSet{};
//3.  TreeSet introduced in JDK 1.2 version.
//4. The underline Data-structure is Balanced-Tree.


//Properties
//1. Not Index based data-structure.
//2. Not follow insertion order.
//3. It follows the sorting order.
//4. It only stores homogeneous data (same type of data).
//5. We can not store Duplicate value and element.
//6. it is non-synchronized data-structure
//7. We can not store null value in TreeSet---> null value can not store in TreeSet