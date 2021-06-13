package basicPrograms;

// pascal triangle printing 

public class A12 {

   public int calFactorial(int inputNum){
        if (inputNum == 0) 
            return(1);
        
            return(inputNum*calFactorial(inputNum-1));
        
    }
    public static void main(String[] args) {
       int k = 5;
       A12 a12 = new A12();
              for (int i = 0; i <= k; i++) {
           for (int j = 0; j <= k-i; j++) {
               System.out.print(" ");
           }

           for (int j = 0; j <=k; j++) {
               System.out.print(" "+ a12.calFactorial(i)/(a12.calFactorial(j)*a12.calFactorial(i-j)));
           }

           System.out.println();
       }
    }
}
