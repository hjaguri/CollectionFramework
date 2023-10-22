//Collection Object ->  a collection object is a data structure that stores a group of objects.
// Collections are implemented as classes and interfaces, and they offer a variety of methods for adding,
// removing, and manipulating elements.



//* Collection  : It is a single entity or object which can store multiple data.
//* Framework : it represents the library
//Collection Framework : It is an api . It is set of predefined classes and interface which is used to store multiple data.

//It contains 2 main parts(package):-   1.Java.util.collection       2.java.util.Map
//Hierarchy : 1.Collection  :- a.List   b.Set   c.Queue  (Interface)

//a. List -> 1.ArrayList(Class)  2.LinkedList(class)  3.Vector(Legacy class)  4.Stack(Legacy class)
//b.Set -> 1.Hashset(Class)  2.LinkedHashSet(Class)  3.SortedSet(interface)  4.NavigableSet(interface)  5.TreeSet(Class)
//c.Queue -> 1.PriorityQueue(Class) 2.Dequeue(interface)  3.ArrayDequeue(Class)

//2.Map(Interface) -> a.Hashmap(Class) b.LinkedHashmap(Class) c.IdentityHashMap(Class) d.weak hashmap(Class)  e.SortedMap(interface) f.NavigableMap(interface) g.TreeMap(Class) h.Dictionary(Class)
//i.Hashtable(Class) j.Properties(Class)
 public class Introduction_Collection_Framework {
}
//Collection  : Collection is a interface which present in java.util.package (version 1.2)
//syntax : public interface Collection <E> extends iterable.<E>
//method of collection interface : a.public boolean add(object obj)
//                                 b.public boolean addAll(Collection c)
 //                                 c.public boolean remove(object o)
//                                  d.public boolean removeALl(Collection c)
//                                   e.void clear()
//                                   f.boolean contain(object obj)
//                                    g.boolean containAll(Collection c)
//                                    h.boolean isEmpty()
//                                    i.int size()
//                                    j.iterator iterator