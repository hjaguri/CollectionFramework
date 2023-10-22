import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //It contains list and Collection interface method
        ArrayList ar=new ArrayList();
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        Vector v=new Vector(ar); //by default capacity of vector is  10
        v.add(10);
        v.setElementAt(3000 , 1);
        v.add(20);
        v.add(40);
        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        v.remove(1);
        System.out.println(v);
        v.removeElementAt(1);
        System.out.println(v);
        v.removeAllElements();
        System.out.println(v);
        System.out.println(v.capacity());


    }
}
// JDK 1.0 In this version java provide classes and interface in which we can store the data/object in stack
// , vector , hashtable ,  properties ,dictonary.
//JDK 1.2 :In this version Collection Framework was introduced.
// All legacy classes are synchronized.


//1. Vector ->Vector which implemented class of list interface.
//2. It is a legacy class which was introduced class in JDK 1.0 version
//3. Vector present in java.util package
//4 .class Vector implements List ,Cloneable , Serializable{}
//5. The underline data-structure of vector is growable array or resizeable array.



//Vector Properties
//1. Index based data-structure.
//2. It is store different type of data.
//3. We can store duplicate data and also store duplicate null value.
//4. Vector follow the insertion order and does not follow the sorting order.
//5. Vector are synchronized collection.



