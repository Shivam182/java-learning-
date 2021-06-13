package collections;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class A7 {
    public static void main(String[] args) {
        Vector<Integer> l = new Vector<>(){{
            add(1);
            add(2);
            add(3);
            add(4);

        }};

        // why it happens like we cannot use the elements method of vector class if we make object of vector class 
        // using List Interface keyword ????
        /** i mean then also if we use List then also its an object of vector class then y cant we call method 
         * using that object ??
         */
        List<Integer> l2 = Collections.list(l.elements());
        System.out.println(l2);

    }
}
