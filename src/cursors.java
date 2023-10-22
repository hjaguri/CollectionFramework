import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

//In Java, a cursor is an Iterator, which is used to iterate or traverse or retrieve a Collection or Stream object's elements one by one
//Cursors -> There are three type of Cursors  a.Iterator , b.List Iterator , c.Enumeration
public class cursors {
    public static void main(String[] args) {

        // 1 . Iterator Method
//        List list=new ArrayList();
//        list.add(10);
//        list.add("Hansraj");
//        list.add("jaguri");
//        Iterator i=list.iterator();
//        while (i.hasNext()){
//            System.out.print(i.next() + " ");
//
//        }

        //2 . ListIterator
//        List list=new ArrayList();
//        list.add(100);
//        list.add("Vikram");
//        list.add("Shubhash");
//        ListIterator li=list.listIterator();
//        while (li.hasNext()){
//            System.out.print(li.next() + " ");
//
//        }
//        System.out.println();
//        while (li.hasPrevious()){
//            System.out.print(li.previous()+ " ");
//        }
//        li.add("Sham");
//        System.out.println(list);

        // 3 . Enumeration

        Vector v=new Vector();
        v.add(123);
        v.add("Hansraj");
        v.add("Jaguri");
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.print(e.nextElement() + " ");
        }

    }
}



//Iterator ->We can get iterator cursor with iterator() method. example -> List.iterator();
//Iterator cursor can be used with for any collection object
//Iterator method are hasNext()  ,next()  , remove()
//Iterator cursor we can retrieve   the element only in forward direction
//By using Iterator cursor we can read and remove the element.


//List Iterator ->We can get list iterator cursor by listIterator() method.Example-> ListIterator li=list.iterator().
//List Iterator cursor can be used only with List implemented class that is ArrayList , LinkedList , vector and stack.
//List Iterator method are hasnext() , next() , hasprevious()  , previous() , remove() , set().
//List iterator we can retrieve the element forward and previous direction.
//by using list iterator cursor we can read , remove , replace and add the element .


//Enumeration -> Enumeration is the cursor which is used to retrive collection object one by one.
//Enumeration was introduced in jdk 1.0 version
//Enumeration cursor can be used only with legacy class that is vector and stack.
//Enumeration cursor can be get by elements() method. Enumeration em=v.elements().
//Method of Enumeration cursor are : hasMoreElements() , nextElement().
//Enumeration cursor can be used to retrieve the element only in forward direction.
//Enumeration cursor can be used only for read operation.