package goodPrograms;

/**
 * Sub : Demo Use Of super keyword in constructors 
 */
class Sub {

    public Sub(){
        System.out.println("inside the Sub constructor ");
    }
    
}

public class A8 extends Sub {
    public A8(){
        super();
        System.out.println(" inside the A8 class constructor ");
    }
    public static void main(String[] args) {
        // A8 a8 = new A8();
    

    }
}
