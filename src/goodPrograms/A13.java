package goodPrograms;

public class A13 {
    static int recurssiveSearch(int x ,int[] arr, int index){

        // here i have limited the calling of recurssion again if array ends.
        while (index < arr.length) {
            if (x != arr[index]) {
                return ((recurssiveSearch(x, arr, index + 1)));
            }else{
                return(index); 
            }
        }

        return(-1);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(recurssiveSearch(5, arr, 0));
    }
}
