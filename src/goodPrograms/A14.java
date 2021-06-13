package goodPrograms;

/**
 * A14 : max number in an array iterative method.
 */
public class A14 {
    static int maxInt(int[] arr , int max){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return(max);
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,3456};
        int max = 0;
        System.out.println(maxInt(arr, max));
    }
}