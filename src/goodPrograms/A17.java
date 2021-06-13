package goodPrograms;

import java.util.Arrays;

// 2d arrays of java . 

public class A17 {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i].length);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j+1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            // every inner item will get printed in other line due to println.
             System.out.println(Arrays.toString(arr[i]));

            // to directly convert inner elemnets into string in one step othewise , if to string then only outer array 
            // will convert ot string and inner elements resemble as objects of those particular class . {integr , string etc. }
            //  System.out.println(Arrays.deepToString(arr));
        }   
    }
}
