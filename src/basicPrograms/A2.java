package basicPrograms;
public class A2 {
    public static void main(String[] args) {
        /**
         * either do it m+n or m-n , now this act as a middle value , coz if u either
         * added/sub two numbers then in next step if u either add/sub any one of number
         * from above result then u will get the second number sure !!
         */

        int m = 15;
        int n = 10;
        // When You Subtract :-
        m = m - n;
        n = m + n;
        m = n - m;

        // When You Add :-
        // m = m+n;
        // n = m-n;
        // m = m-n;

        // further if u want to have more optimal method then use bitwise operators
        // XOR operator for subtraction

        System.out.println(n + " " + m);
    }
}
