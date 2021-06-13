package basicPrograms;

public class A13 {
    public static void main(String[] args) {
        String s = "ioioioi";
        Object object = s;
        // now the string is converted into an object 
        System.out.println(object.getClass());
    }
}
