package basicPrograms;

/**
 * A8
 */
public class A8 {

    public static void main(String[] args) {
        
        int k = 5;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}