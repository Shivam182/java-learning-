package goodPrograms;

// understanding Comparator 
import java.util.*;

public class A18 {

    // Function to sort by column
    static void sortbyColumn(int arr[][], int col) {
        // sort takes param of an Array class object , further the comparator takes input of int[] type object to compare that type of objects only 
        // in its method.
        // now in compare method overidden, it will automatically use that class's object specified in the comparator's param <int[]>
        // in this case it automatically takes objects inside the arr , which are further int objects only 
        // hover over sort to get more info  at last about params it takes.
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            // Compare values according to columns
            public int compare(final int[] entry1, final int[] entry2) {
                
                // To sort in descending order revert
                // the '>' Operator
                // returning 1 means some given expression is true and here use it for ordering the array , but how use it , actually here comparator 
                /** just provides the ordering to array for sorting here , so if compare returns 1 then use that expression true for ordering array 
                 * and compare is inside of comparator , and comparator will return the expression for array ordering to be done . 
                 */
                // NOTE : IF USE COMPARATOR AND COMPARE METHOD INDEPENDENT THEN COMPARE METHOD CAN RETURN ANYTHING OF THAT CLASS OBJECT TYPE PASSED IN COMPARATOR 
                // CAN RETURN ANY INTEGER DIRECTLY AND CAN BE USED ALSO . 
                if (entry1[col] > entry2[col]) {
                    // System.out.println(Arrays.toString(entry1) + " entry 1 array " + "\n" + Arrays.toString(entry2));
                    return 1;
                } else {
                    return -1;
                }
            }
        }); // End of function call sort().
    }

    // Driver Code
    public static void main(String[] args) {
        int matrix[][] = { { 39, 27, 11, 42 }, { 10, 93, 91, 90 }, { 54, 78, 56, 89 }, { 24, 64, 20, 65 } };
        // Sort this matrix by 3rd Column
        int col = 3;
        sortbyColumn(matrix, col - 1);

        // Display the sorted Matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}