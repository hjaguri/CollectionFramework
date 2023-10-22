// legacy class - Legacy classes and interfaces are the classes and interfaces that formed the collections
// framework in the earlier versions of Java and how now been restructured or re-engineered.

import java.util.Stack;

public class StackDemo {

    //Only one constructor is know as default constructor.
    public static void main(String[] args) {

        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.search(30));
        System.out.println(s.empty());

    }
}
//Stack -> It is a legacy class which introduced in jdk 1.0 version.
//2. It is a child class of Vector class which is present in java.util package.
//3. Class stack extend Vector{};



//Properties of Stack
//1.   Stack class was designed on the basis of LIFO(last in first out).
//2.    Stack can be implemented on the basis of array , linked-list , vector.
//3.    Stack is index based data-structure.