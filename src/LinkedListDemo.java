//LinkedList -> LinkedList is an implemented class of list interface which is present in java.util package.
//syntax  -> class LinkedList implemented List{ ------} , and dequeue is also implemented;
// The underline data structure of linked-list is "double linked-list" or "circular linked-list".

//advantage ->
//1.Insertion and deletion operation are efficient(fast).
//2.We can traverse the list in both the direction like left and right.

//dis-advantage
//1.it occupies extra space for previous node.
//2.In case insertion and deletion of element  in between we have manage the previous and next node

import java.util.LinkedList;

//Property
//1.LinkedList is index based data structure.
//2.Can we store heterogeneous element or different data type
//3.we can also insert duplicate value and also store many null value
//4.follow insertion order but does not follow sorting order
//5.non Synchronized collection
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.add("Deepak");
        System.out.println("Deepak");
        ll.add("Rahul");
        ll.add(null);
        ll.add(null);
        ll.add(475);
        ll.add(3,456);
        System.out.println(ll);

        System.out.println(ll.indexOf("Deepak"));

        ll.addFirst(10);
        ll.addLast(20);
        System.out.println(ll);
        System.out.println(ll.removeLast());
        System.out.println(ll);


    }

}
//Interface Collection{
//    boolean add(Object o);
//        boolean addAll(Collection o);
//
//        boolean remove(Object o);
//        boolean removeAll(COllection c);
//
//        void clear();
//
//        boolean  contain(Object o);
//        boolean containAll(Collection c);
//
//        boolean isEmpty();
//
//        int size();
//
//        Iterator iterator();
//
//        -----etc.......
//        }


//interface List implement Collection {
//    //contain COllection framework method
//
//    void add(int index , object o);
//    void addAll(int index , Collection e);
//
//    Object get(int index);
//    Object Set(index i , Object o);
//    int indexof(Object o);
//    int lastIndexof(Object o);
//    -----etc
//}


//Class LinkedList implemented List Deque{
//    contain collection List , deque method
//void addFirst();
//void addLast();
//
//object getFirst();
//Object getLast();
//
//object removeFirst();
//object removeLast();
//        }