package basicPrograms;
public class A3 {
    public static void main(String[] args) {
        // swapping two integers using bitwise operators 
        // Bitwise Operators return only magnitude  

        int m = 8;
        int n = 92;
        m = n^m;
        n = m^n;
        m = m^n;
        System.out.println(m + " " + n);
        
    }
}