package basicPrograms;
// pyramid pattern 

public class A9 {
    public static void main(String[] args) {
        int k = 5;
        for (int i = k; i >= 0; i--) {
            int j = 0;
            while (j < i) {
                System.out.print(" ");
                j++;
            }
            int m = (k - i);
            for (int l = m; l > 0; l--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
