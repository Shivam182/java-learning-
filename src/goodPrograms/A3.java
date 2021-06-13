package goodPrograms;

// using concrete methods of an abstract class 

abstract class AbstClass {
    final void concreteMethod() {
        System.out.println("using a concrete method from an abstract class");
    }

    static void staticMeth() {
        System.out.println("a static method in an abstract class ");
    }

    static int into(){
        return 8;
    }
}

class SubClassNew extends AbstClass {
    // directly accesss a static method using class name . 
    int v  = AbstClass.into();     
}


public class A3 {
    public static void main(String[] args) {
        AbstClass a = new SubClassNew();
        // calling the concrete method of an abstract class without even creating object
        // of the abstract class !!
        a.concreteMethod();

        /**
         * Another method is : extend abstract class in this driver class and then this
         * class object also automatically gets ref to that concrete methods in abstract
         * class . But in this case u would have to implemtnt alll abstact methods if
         * any . if u use a middle class like above then override methods in middleclss
         * only and use any method u want in this driver class , no need to use all
         * methods in driver class .
         * 
         * further if u have any static concrete methods then u can use directly abst
         * class name to get the method after extending the abst class in ur class
         */
    }
}
