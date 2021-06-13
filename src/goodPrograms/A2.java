package goodPrograms;

public class A2 {
    public static void main(String[] args) {
        // USE PARENT CLASS {even if parent is abstract class , but remember not to
        // create obj of abstract class } TO CREATE OBJECT OF ITS SUBCLASS , BUT VICE
        // VERSA IS NOT
        // POSSIBLE.
        AnyClass a1 = new SubClass();
        a1.abstarctMethod();
        // CHILD CLASS CANNOT CREATE OBJ OF PARENT CLASS
        // SubClass1 s1 = new SubClass();

    }
}

abstract class AnyClass {
    abstract public void abstarctMethod();
}

class SubClass extends AnyClass {

    @Override
    public void abstarctMethod() {
        System.out.println("abstrcat method from an abstract class ");
    }

}

class SubClass1 extends SubClass {

}
