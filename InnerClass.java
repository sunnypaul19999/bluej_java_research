import java.lang.*;
import java.util.*;
class A{
    class B{
        
    }
}

public class InnerClass{
    
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
    }
}