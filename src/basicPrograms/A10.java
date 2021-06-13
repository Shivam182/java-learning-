package basicPrograms;
// left triangle pattern 

public class A10 {
    public static void main(String[] args) {
        int input = 5;
        for (int i = input; i >0; i--) {
            int subt = i*2 -2;
            int i1 = 1;
            while (i1 <=subt) {
                System.out.print(" ");
                i1++;
            }
            for (int j = input-(i-1); j >0; j--) {
                System.out.print("* ");
            }

            System.out.println();
            
        }
    }
}
