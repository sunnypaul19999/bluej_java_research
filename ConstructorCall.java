import java.io.*;

class A {
    A() {}
    
    A (int a) {
        
    }
}

class B extends A{
    B(int a) {
        
    }
}

public class ConstructorCall{

    public static void main(String args[]) throws IOException 
    {
        new B(1);
    }
}