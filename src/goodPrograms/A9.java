package goodPrograms;

// Thread class in java 

class ThreadTest extends Thread{

    // this is the run method of Thread class that  is extended, we have overridden the method. 
        public void run(){
            try {
                System.out.println(Thread.currentThread().getId() + " is id of the current thread ");
            } catch (Exception e) {
                System.out.println("exception caught :"+e);
            }
        }
}


public class A9 {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        
        t1.run();
    }
}
