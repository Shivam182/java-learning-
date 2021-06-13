package basicPrograms;

/**
 * TypecastingWorking
 */
public class TypecastingWorking {

    public static void main(String[] args) {
        byte[] bt = new byte[5];
        // how type casting is done in java :-
        /**
         * Widening Casting (automatically) - converting a smaller type to a larger type
         * byte -> short -> char -> int -> long -> float -> double
         * 
         * THEY MIGHT BE HAVING SOME ALGORITHM FOR THIS CONVERSION AND AGAIN DECODING IT
         * Narrowing Casting (manually) - converting a larger type to a smaller size
         * double -> float -> long -> int -> char -> short -> byte
         */

        // converted 'H' into its byte value and then stored it.
        bt[0] = (byte) 'H';
        System.out.println((char) bt[0]);
        bt[1] = 45;
        String s = new String(bt);
        // amazng so we can create a string from a byte array , every byte value has a
        // char decode for that in java
        // hence it decodes it into char then creates a string
        System.out.println(s + " string ");
    }
}