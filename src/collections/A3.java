package collections;


// Convert a List of String to a comma separated String in Java
// example : list = ["shivam","kumar","yadav"];
// --- output : string s  ="shivam,kumar,yadav"
// Java program to convert List of String
// to comma separated String

import java.util.*;

public class A3 {
    public static void main(String args[]) {

        // Get the List of String
        List<String> list = new ArrayList<>(Arrays.asList("Geeks", "ForGeeks", "GeeksForGeeks"));
        // Print the List of String
        System.out.println("List of String: " + list);

        String string = String.join(",", list);

        // Print the comma separated String
        System.out.println("Comma separated String: " + string);
    }
}
