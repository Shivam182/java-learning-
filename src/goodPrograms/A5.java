package goodPrograms;

/**
 * SingleTon Class 
 */
class SingleTon {
    private static SingleTon single_instance = null;
    public String s;

    public SingleTon(){
        // SingleTon.singleTon();  --- if u do this object is already created 

        s= " this is a string in singleton class constructor ";
    }

    static SingleTon singleTon(){
        if (single_instance == null) {
            // constructor is called here -- 
            single_instance = new SingleTon();
        }

        return single_instance;
    }
}


public class A5 {
    public static void main(String[] args) {

        // ALSO THIS IS HOW WE CREATED OBJECT OF A CLASS USING ITS METHOD WITHOUT USING UTS CONSTRUCTOR CALL DIRECTLY 
        // BUT INDIRECTLY ITS CALLED INSIDE singleTon() fxn . 
        SingleTon s1 = SingleTon.singleTon();
        SingleTon s2 = SingleTon.singleTon();
        s1.s = s1.s.toUpperCase();
        System.out.println(s1.s + " from s1");
        System.out.println(s2.s + " from s2 ");
    }
}
