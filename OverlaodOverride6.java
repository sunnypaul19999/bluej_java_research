import java.io.*; 

class A1 {
    public static void f1(){
        System.out.println("A::f1");
    }
}

class B1 extends A1 {
    public static void f1(){
        System.out.println("B::f1");
    }
}

public class OverlaodOverride6{

    public static void main(String[] args){
        B1 b = new B1();
        A1 a = b;
        // calls method A::f1. As A::f1 is a static method and cannot be overriden.
        // static definition of A::f1 is hidden in B.
        a.f1(); 
    }
}