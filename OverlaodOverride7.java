import java.io.*; 

class A {
    public Object f1(int a, Number b){
        System.out.println("A::f1");
        return new Object();
    }
}

class B extends A {
    public Integer f1(int b, Long a){
        System.out.println("B::f1");
        return new Integer(1);
    }
}

public class OverlaodOverride7{

    public static void main(String[] args){
        B b = new B();
        A a = b;
        // calls method A::f1. As A::f1 is not overriden in B but overloaded.
        a.f1(1, 0);
    }
}