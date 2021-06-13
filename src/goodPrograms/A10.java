package goodPrograms;

class ThreadClass extends Thread{
    
    public void run() {
        System.out.println(" thread runs  " + Thread.currentThread().getName());
    }
}

public class A10 {
    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        t1.run(); // calling directly run method will not create a new thread just run the method and the main program thread it will use 
        t1.start(); // first creates a new thread and then runs it 
        
    }
}
