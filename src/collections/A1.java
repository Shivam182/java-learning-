package collections;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
// import java.util.Stack;
// import java.util.Vector;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;

/**
 * Collection interface is the parent interface , which is extended by List
 * {only one of the extendor} interface , further List Interface is
 * implemented by classes like : 1. ArrayList 2. LinkedList 3. Vector 4. Stack
 * 
 * Collections ----> List ---> { Arraylist , Linkedlist , Vector , Stack }
 * 
 * NOTES: LIST # list preserve the insertion order , hece elements can be
 * accessed using indexes. also elements can be inserted using indexes # Stacks
 * though use indexes and we can interact with elements using indexes , but they
 * also have ans important property of = { Last-In-First-Out }
 * 
 */

public class A1 {
    public static void main(String[] args) {

        /**
         * IMP : All of these on RHS are classes which are instantiated using parent
         * Interface
         */
        // Using Generics is necessary , by using them we made to use them only one type
        // of objects not other
        List<Integer> l1 = new ArrayList<Integer>();

        // Double Brace Initialization : How it Works ??
        /**
         * Ans : the counter braces creates an annonymous class from the derived class {
         * here : Linkedlist} inner braces provide an init block for that annonymous
         * class just like we use an init block after writing any class name{} hence u
         * can call any method inside that and call datatypes inside that block
         */
        List<Integer> l2 = new LinkedList<>() {
            {
                add(5);
                add(6);
                add(7);

                int n = get(0);
                System.out.println(n);
            }
        };

        /** As we know lists are mutable becoz of their CRUD Methods 
         * BUT THEY CAN BE MADE IMMUTABLE LIKE THIS :
         * Other Method : l3 = Collections.unModifiableList()
         */
        List<String> l3 = Arrays.asList("w","d","s","a");
        // NOTE : THIS THING IS VALID FOR LIST BUT HERE IT WILL THROW UnsupportedOperationExecption coz now its 
        // been modified to immutable list and it can't be changed
        // l3.remove(0);
        // other method this also makes a list immutable
        //  Collections.unmodifiableList(l3);
        System.out.println(l3 + " l3 ");
        // Collections.singletonLIST() -- returns a list that can contain only one element .  


        // this is mutable even it used Arrays.asList() method but try doing same for a stack it will not work  ??
        List<Integer> l4 = new ArrayList<>(Arrays.asList(1,2,3,45));

        l1.add(4);
        l1.add(8);
        System.out.println(l4);
        // stacks using index : true
        // l4.get(0);
        System.out.println(l2);

    }
}
