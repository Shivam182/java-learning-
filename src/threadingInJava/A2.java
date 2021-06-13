package threadingInJava;


// Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection.
public class A2 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().isDaemon() + " is daeomn ");
    }
    public static void main(String[] args) {
        A2 a2 = new A2();
        // don't pass set daemon method after a2.start();
        a2.setDaemon(true);
        a2.start();

    }
}
