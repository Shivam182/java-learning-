package basicPrograms;
// differ between even and odd numbers 

// NAIVE METHOD
// public class A5 {

//     void checkInt(int inputInt) {
//     int modulo = inputInt % 2;
//         System.out.println(modulo);
//         if (modulo == 0) {
//             System.out.println("input integer is even !! ");
//         } else {
//             System.out.println("input integer is odd !! ");
//         }
//     }

//     public static void main(String[] args) {
//         A5 a5 = new A5();
//         int inputInt = 1;
//         a5.checkInt(inputInt);
//     }
// }
/**
 * 12 => Binary(1100)
 * 12/2 = 0
 * 6/2 = 0
 * 3/2 = 1
 * 1/2 = 1
 * 
 * 1=> Binary(00001)
 * 1/2 = 1
 * 
 * OR OPERATION OF 12 AND 1 => 
 *  1 1 0 0 
 *  0 0 0 1
 * |1 1 0 1  ==> 13 
 * 
 * if we take odd number 13
 *  1 1 0 1
 *  0 0 0 1
 * |1 1 0 1 ==>  13
 * 
 * 
 * ## AND VICE-VERSA FOR AND OPERATION 
 */

 /**
  * 
  ##  and also other different operators can be used like 
  MOST EFFICIENT = XOR ^
  12 ==> 1100
  1  ==> 0001
  ^  ==> 1101 => 13

  if taking an odd number : 13
  13 ==> 1101
  1  ==> 0001
  ^  ==> 1100 => 12

    hence , for XOR if num is even = increases num by 1
    for XOR if num is odd = decreases num by 1
  */

public class A5 {
 
     public static void main(String[] args) {
         int input = 1;
        if ((input | 1)>input) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
     }
 }



