//List and Set both are interface and it is directly inherit the collection framework

//List->List is index based datastructures.
//List can store duplicate data.
//List can store any number of null value.
//List follow the insertion order
//In list we can get the  list element by the iterator  and listIterator.

import java.util.*;

//Set->Set is not an index based datastructures.It stores  the data according to the hashcode value.
//Set does not store duplicate data.
//Set only contain one null value.
//set does not follow insertion order
//we can get the set value using iterator
public class listandset {
    public static void main(String[] args) {
        List list= (List) new dsaArrayList();
list.add(10);
        list.add(40);
        list.add(20);
        list.add(3,30);
        System.out.println(list);
      list.add(20);
        Iterator i= list.iterator();
        while (i.hasNext()){
            System.out.print(i.next() + " ");
        }
        System.out.println();
        System.out.println(list);


        Set set=new HashSet();
        set.add(90);
        set.add(100);
        set.add(110);
        set.add(120);
        System.out.println(set);
        set.add(90);
        System.out.println(set);
    Iterator s=set.iterator();
        System.out.println();
    while (s.hasNext()){
        System.out.print(s.next() + " ");
    }
}}

//In list if you direct insert the value of index 1 it will throw the exception
//set does follow any order it print the value in any order
//In set if you insert duplicate data  they not throw any kind of exception it will print the previous data