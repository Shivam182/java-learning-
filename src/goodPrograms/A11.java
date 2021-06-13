package goodPrograms;


// Linear Search Program In Java :

// public class A11 {
//     static void search(int x, int[] targetArr) {
//         int index = 0;
//         for (int i : targetArr) {
//             if (i == x) {
//                 System.out.println("Element Found At :" + index + " index in given array ");
//                 break;
//             } else if(index == targetArr.length-1) {
//                 if (i == x) {
//                     System.out.println("Element Found At : " + index + " index in given array ");
//                     break;
//                 }else{
//                      System.out.println("Ëlement Not Found In The Given Array");
//                      break;
//                 }
               

//             }
//             index++;
//         }
//     }

//     public static void main(String[] args) {
//         int searchFor = 1;
//         int[] targetArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//         search(searchFor, targetArray);
//     }
// }


// Better Mehtod :=
// Java code for linearly search x in arr[]. If x
// is present then return its location, otherwise
// return -1
 public class A11 {
    // This function returns index of element x in arr[]
    static int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }

        // return -1 if the element is not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 7, 5 };
        int n = arr.length;

        int x = 4;

        int index = search(arr, n, x);
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }
}

