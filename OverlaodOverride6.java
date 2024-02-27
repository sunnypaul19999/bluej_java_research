import java.io.*; 

class A {
    public static void f1(){
        System.out.println("A::f1");
    }
}

class B extends A {
    public static void f1(){
        System.out.println("B::f1");
    }
}

public class OverlaodOverride6{

    public static void main(String[] args){
        B b = new B();
        A a = b;
        // calls method A::f1. As A::f1 is a static method and cannot be overriden.
        // static definition of A::f1 is hidden in B.
        a.f1(); 
    }
}