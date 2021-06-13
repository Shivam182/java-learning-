package goodPrograms;
// array rotation 

import java.util.Arrays;

/**
 * logic :-> get the index of key number from which array needs to be rotated
 * create a new array of same length as given array fill the new array with
 * after index elements till last index of given array after that fill the new
 * array with given array elementes starting from 0 to indexof key print the
 * array
 */

public class A16 {
    static void rotateArray(int[] arr, int key) {
        int indexOfKey = 0;
        for (int i : arr) {
            if (i == key) {
                break;
            }
            indexOfKey++;
        }
        int newArr[] = new int[arr.length];

        System.out.println(indexOfKey);

        int temp = indexOfKey + 1;
        int temp2 = 0;
        int numOFelementsAfterKey = arr.length - 1 - indexOfKey;

        for (int i = 0; i < newArr.length; i++) {

            if (i < numOFelementsAfterKey) {
                newArr[i] = arr[temp];
                temp++;
            } else {

                newArr[i] = arr[temp2];
                temp2++;
            }
        }

        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotateArray(arr, 3);
    }
}