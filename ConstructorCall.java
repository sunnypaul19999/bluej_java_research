import java.io.*;

class A {
    // A() {}
    A (int a) {
        
    }
}

class B extends A{
    B() {
        
    }
}

public class ConstructorCall{

    public static void main(String args[]) throws IOException 
    {
        new B();
    }
}