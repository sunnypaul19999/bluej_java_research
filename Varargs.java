import java.io.*;

class A {
    A() {}
    
    public void f (int a, int ...b) {
        
    }
    
    public void f (int a, int b) {
        System.out.println("salkjd");
    }
}

public class Varargs{

    public static void main(String args[])
    {
        new A().f(1,2,3);
    }
}