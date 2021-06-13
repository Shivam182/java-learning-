package basicPrograms;

/**
 * Nested Classes : we can create a class inside other class in java this is
 * like in a blueprint of society , we have included blueprint of house also
 * 
 * Now nested classes are also called as inner classes in java two types of
 * nested classes : { 1. static nested class , 2. non static nested class {1.
 * annonmous classes 2. local classes}}
 * 
 * inner class can have access to even private variables of outerClass but vice
 * versa is not possible just like we can see from our house what's in society ,
 * but vice versa is not possible .
 * 
 * FURTHER IN DETAIL : https://www.geeksforgeeks.org/nested-classes-java/
 **/

public class NestedClass {
    static class Inner {

    }

    public static void main(String[] args) {

        // known method for object creation this method is only applicable if inner
        // class is static else use second method only { means if class is local or
        // annonymous inner class }
        Inner i1 = new Inner();
        // method of object creation of inner static class / local / annonymous class
        // using static way
        NestedClass.Inner i2 = new NestedClass.Inner();
    }
}
