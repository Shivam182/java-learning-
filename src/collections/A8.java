package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// converting  List to Stream 
public class A8 {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>() {
            {
                add("mjdskfn");
                add("dfdsdfd");
                add("opopo");
            }
        };
        Stream<String> s = l1.stream();
        System.out.println(Arrays.toString(s.toArray()));
    }
}