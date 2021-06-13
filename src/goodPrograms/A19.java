package goodPrograms;

import java.util.Arrays;

// Finding Determinant of a Matrix . 3×3 

/**
 * LOGIC :: 1. GET THE NUMBER OF ROWS ANS COLUMNS IN THE MATRIX {R & C} 2.
 * ASSUME PROCEEDING VIA COLUMNS { WHILE FINAL CALCULATIONS FOR EVEN USE +ve AND
 * -ve FOR ODD COLUMNS} 3. MAKE A FUNCTION THAT TAKES THE COLOUMN'S FIRST NUMBER
 * AND CREATE A NEW MATRIX BY ELIMINATING ITS ROW AND COL - how to eliminate r &
 * c ? ans : take the index from both sides{row and col} , of that particular
 * number picked up , then iterate in the main array fully each element checking
 * that if that's random number's index matches the main number's index from
 * both sides 2-d if matches then do not add it in a new array else add it 4. U
 * WILL HAVE A MATRIX AT LAST OF THIS AND THEN IN THE SAME FXN DO CALCULATIONS
 * CROSS MULTIPLICATION OF ARRAY AND RETURN THE INT VALUE ,also at at last u may
 * even multiply the initial number also to final calculation with sign {initial
 * num : first no. of that col which was used } 5. THEN MAKE A FINAL CALCULATION
 * FXN WHERE ADD ALL THE INT'S and show the result .
 * 
 * example : [1,2,3], [4,9,6], [7,0,9] det = 81+12 take the first element of
 * main array take 1 : its row index = outer array index = 0 its column index =
 * inner arr = 0 now iterate via each element using nested for loops , get
 * further if element is viable to be added then add it to new array solve the
 * cross multuply of the new array , multiply it with 1 { main col element }
 * with sign + /- on odd even col
 * 
 */

public class A19 {
    static void detCal(int[][] arr) {


        int newArr[][] = new int[2][2];

        // final sum answer of determinant
        int sum = 0;

        // both of them for utis in newArr
        int n1 = 0;
        int n2 = 0;

        // column number of the top row element presently being used
        int currCol = 0;

        // iterating for 1st row elements
        for (int i = 0; i < arr[0].length; i++) {
            currCol = i;

            // iterating inside every element
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr[0].length; j2++) {

                    // only store those elements in new array which are not in outer element's
                    // rowand col.
                    if (j != 0 && j2 != currCol) {

                        // just storing the elements in new array.
                        if (n1 < 2) {
                            newArr[0][n1] = arr[j][j2];
                            n1++;
                        } else if (n2 < 2) {
                            newArr[1][n2] = arr[j][j2];
                            n2++;
                        }
                    }
                }
            }
            int eval = ((int) Math.pow(-1, i)) * arr[0][i]
                    * (newArr[0][0] * newArr[1][1] - newArr[0][1] * newArr[1][0]);
            System.out.println(eval + " eval val " + (int) Math.pow(-1, i));

            // this is done so that everytime new elements get into newArr 
            n1 = 0;
            n2 = 0;

            // submitting ans of calcultion after each iteration 
            sum = sum + eval;
        }

        System.out.println(Arrays.deepToString(newArr));
        System.out.println(sum + " det val ");
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 9, 6 }, { 7, 0, 9 } };
        detCal(matrix);

    }
}