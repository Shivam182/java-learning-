package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Convert LinkedList to ArrayList 
public class A6 {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };

        // an object class array is made as object is parent class of every class so its possible 
        Object[] array = l.toArray();

        // new array is copied in i1 using source array and copyOf method of arrays to make a copy of Array class object 
        Integer[] i1 = Arrays.copyOf(array,array.length,Integer[].class);
        System.out.println(Arrays.toString(i1));
    }
}