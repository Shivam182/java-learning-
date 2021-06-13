package basicPrograms;
// pyramid number pattern 
public class A11 {
    public static void main(String[] args) {

        int input = 5;

        for (int i = input; i > 0; i--) {
            int subt = i * 2 - 2;
            int i1 = 1;
            while (i1 <= subt) {
                System.out.print(" ");
                i1++;
            }


            int subt2 = input - (i - 1);
            int tempInt = subt2;
            
            for (int j = subt2 + (subt2 - 1); j > 0; j--) {
                int divide = (subt2 + (subt2 - 1)) / 2;
                if (j == subt2 + (subt2 - 1) || j == 1) {
                    System.out.print(subt2 + " ");
                } else {
                    if (j >= divide + 1) {
                        tempInt = tempInt + 1;
                        System.out.print(tempInt + " ");
                    }
                    if (j < divide + 1) {
                        tempInt = tempInt - 1;
                        System.out.print(tempInt + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}

// BEST SOLUTION:
// Java Program to Print the Pyramid pattern

// Main class
// public class GFG {

//     // Main driver method
//     public static void main(String[] args) {

//         // The variable count1 and count2 used to
//         // keep track of the column number

//         // Custom input of rows = N
//         // Say N = 6
//         int rows = 6, k = 0, count1 = 0, count2 = 0;

//         // Iterating using for loop
//         for (int i = 1; i <= rows; i++) {

//             // This for loop is used to print the required
//             // spaces
//             for (int space = 1; space <= rows - i; space++) {

//                 // Print white spaces
//                 System.out.print(" ");
//                 count1++;
//             }

//             // Condition check in while loop to
//             // print the numbers in the pyramid
//             while (k != 2 * i - 1) {

//                 // Case 1: When the column count is less
//                 // than the row size then print i+k
//                 if (count1 <= rows - 1) {
//                     System.out.print((i + k) + " ");

//                     // Increment the first counter
//                     count1++;
//                 }

//                 // Case 2: When the column count is greater
//                 // than
//                 // the row size then print i+k-2*count
//                 else {

//                     // Increment the second counter
//                     count2++;
//                     System.out.print((i + k - 2 * count2) + " ");
//                 }

//                 k++;
//             }
//             count2 = count1 = k = 0;

//             // By now done operations over first row so
//             // new line
//             System.out.println();
//         }
//     }
// }
