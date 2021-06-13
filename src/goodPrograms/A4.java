package goodPrograms;

// getting fields of an object from a class 

public class A4 {
    public static void main(String[] args) {
        New n = new New(5);
        // remeber not to access directly fields inside the construtor , but use constructor to initilize any outer field 
        // using this.fildNameMethod
        System.out.println(n.p);
    }
}

class New {
    public int p ;
    public New(int n) {
      this.p = n;
    }
}
