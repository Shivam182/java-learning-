package goodPrograms;

import java.util.Arrays;

/**
 * A15 : methods of cpoying an array 
 */
public class A15 {

    public static void main(String[] args) {
        int [] a ={1,2,3,4};
        int[] b = new int[4];
        // int [] b =a.clone();
        // System.out.println(Arrays.toString(b));

        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(a));
     }
}
