// 1 . ArrayList -> is an implemented of list interface which is present in java.util package.


//syntax ->package java.util
// class ArrayList implemented List {
// constructor
//method
//}


//2. ArrayList is created on the basis of growable or resizeable array.
//Properties of ArrayList ->
//1.Index based data structure
//2.Arraylist can be store different type of data or heterogeneous data type.
//3.Arraylist we can store duplicate data.
//4.ArrayList we can store any number null value
//5.ArrayList follow insertion order
//6.ArrayList does not follow the sorting order
//ArrayList is non synchronized

import java.util.ArrayList;
import java.util.Iterator;

public class dsaArrayList {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(0 , 12);
        al.add(34);
        al.add(0 , "Hansraj");
        al.add(34);
        al.add(60);
        al.add(null);
        al.add(null);
        System.out.println(al);
        Iterator i =al.iterator();
        while (i.hasNext()){
            System.out.print(i.next() + " - ");
        }
        ArrayList n=new ArrayList();
        n.addAll(al);
        n.add(23);
        n.remove(2);
        System.out.println(n.contains(23));
        System.out.println(n.size());
        System.out.println(n.get(3));
        n.set(5 , "Rahul");
        System.out.println(n);
        n.removeAll(al);
        System.out.println(n);
        n.clear();
        System.out.println(n);
    }
}
