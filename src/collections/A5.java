package collections;

import java.util.HashMap;
import java.util.Map;

/** Using Map interface that extends Collections Interface */

public class A5 {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<Integer, String>();
        m1.put(0, "pop");
        m1.put(1, "sjasa");
        m1.put(2, "uiuie");
        m1.put(3, "tutut");

        for (Map.Entry<Integer, String> m : m1.entrySet()) {
            System.out.println("Key : " + m.getKey() + "Value : " + m.getValue());
        }
    }
}
