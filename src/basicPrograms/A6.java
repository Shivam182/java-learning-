package basicPrograms;

public class A6 {

  static void biggestOfThree(int a, int b ,int c){
       int result = c>(a>b? a:b)? c:(a>b? a:b);
       System.out.println(result);
   }
   

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        biggestOfThree(a,b,c);
    }
}
