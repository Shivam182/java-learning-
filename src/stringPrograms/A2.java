package stringPrograms;

import java.util.Stack;

// Reversing a string using stack {LAST IN FIRST OUT}

public class A2 {
    public static void main(String[] args) {
        String a = "ShivamKumarYadav";
        Stack<Character> st = new Stack<>();
        char[] cArr = a.toCharArray();
        char[] revString = new char[a.length()];

        for (int i = 0; i < cArr.length; i++) {
            st.push(cArr[i]);
        }

        int i = 0;
        while (!st.isEmpty()) {

            // NOTE : HERE I++ IS WRITTEN MEANS FIRST STORE THE VALUE FOR THAT I THEN
            // INCREMENT THAT I SO IT WORKS WELL !!
            revString[i++] = st.pop();

        }

        // INTELLIGENT METHOD FOR CONVERTING CHAR ARR TO JOINED SINGLE STRING .
        String reversedString = new String(revString);

        // CONVERT CHAR ARRAY INTO JOINED SINGLE STRING
        String reversedString1 = "";
        for (char c : revString) {
            reversedString1 = reversedString1.concat(Character.toString(c));
        }
        /**
         * IMPORTANT KNOW : BOTH reversedString && reversedString1 are two different
         * names for single object only means they both are pointing to same memory in
         * memory heap .
         */

        System.out.println(reversedString);

    }
}
