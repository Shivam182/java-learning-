package threadingInJava;

public class A1 extends Thread {

    @Override
    public void run() {
        System.err.println("allo everyone");
    }

    

    public static void main(String[] args) throws InterruptedException {
        /**
         * Note : As this class extends ThreadClass then this class's objects can be
         * used to call thread methods
         */
        A1 a1 = new A1();
        A1 a2 = new A1();

        a1.start();
        // this method insures that if a thread a1 is getting executed then join()
        // method insures that before executing any other instruction ai should die
        // a1.join();
        a2.start();

        // checks if the thread is in running state currently or not
        // this will give false if u try to print them with a1/a2.start() method
        // commented out
        System.out.println(a1.isAlive());
        System.out.println(a2.isAlive());
    }
}
