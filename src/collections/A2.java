package collections;

// import java.util.Collections;
import java.util.EnumSet;
// import java.util.HashSet;
import java.util.Set;

// Set Interface in java : It is one of the extendor of Collections Interface as List Interface is 
// --> sets do not preserve insertion order hence no indexing 

/**
 * further classes implements the Set Interface as follows :
 * 
 * Collections ---> Set {don't allow duplicates} ---> {}
 * 
 * 
 * POINTS : SET INTERFACE - 1. HashSet (class implementing set interface
 * directly ) : ordering of elements storing is based on their hash code hashset
 * also allows the insertion of NULL elements. How hashcode is made ? 2.
 * LinkedHashSet ( remembers the order in which they were inserted)
 * 
 * 3. SortedSet & NavigableSet : BOTH OF THEM ARE INTERFACES EXTENDING TO SET
 * INTERFACE , these both sets are further implemented by TreeSet Class . #
 * objects in the sortedset are stored in ascending order , but they can be seen
 * in rev order by :
 *  Iterator<ObjectClassname> i = TreeSet.descendingIterator()
 * now u can iterate while i.hasNext(). ans print the results one by one or add in any other list / set 
 * 
 * 
 */

 enum newEnum {one , two , three };
public class A2 {
    
    public static void main(String[] args) {
        Set<newEnum> s ;
        s = EnumSet.of(newEnum.one ,newEnum.two ,newEnum.three);
System.out.println(s);
    }
}
