package goodPrograms;

// special default function in interfaces 

/**
 * InnerA6
 */
interface In1 {

    final int n1 = 10;

    // default keyword is used to write a concrete method in interfaces also 
    default void display() {
        System.out.println("default method in interfaces");
    }

    // this method is abstract without even the abstract key word.
    void display2();
}

public class A6 implements In1 {
    public static void main(String[] args) {

        A6 a6 = new A6();
        a6.display();
    }

    @Override
    public void display2() {

        System.out.println("inside abstract method of the interface ");
    }
}