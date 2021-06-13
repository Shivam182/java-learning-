package goodPrograms;


public class A1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test t1 = new Test();
        Test t2 = (Test) t1.clone();
        System.out.println(t2);
        

        // THIS IS CALLED ANNONYMOUS OBJECT CREATION , htese objects are used for only one time use 
        // after calling this method the object will be automatically destroyed unlike other objects which are destroyed at 
        // program execution end.
        System.out.println(new Test().getAnyInt());
        
    
    }
}

// the class that needs to be cloned must implement clonable interface 
class Test implements Cloneable {

    public Test() {
        // int n = 5;
    }

    public int getAnyInt() {
        return 5;
    }

    // override the clone method in that class also , 
    // return an object type 
    // call the super or top parent class {i,e Object class} clone method
    // also if u wish to keep accesss modifier as protected but in subclass u can let it be public also 
    @Override 
    public Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }

}
