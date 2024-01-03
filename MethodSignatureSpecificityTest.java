
import java.io.IOException;

public class MethodSignatureSpecificityTest { 
    public static void main(String[] args) {
        B b=new B();
        try {
            // b.method(Integer.MAX_VALUE);
            b.func1(Integer.MAX_VALUE + (long)1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
class A{

}
class B {

    public void method(A a)
    {
        System.out.println("A::method");
    }

    public void method(B b)
    {
        System.out.println("B::method");
    }
    
    public void method(Integer a)
    {
        System.out.println("A::method");
    }

    public void method(String b)
    {
        System.out.println("B::method");
    }
    
    public void func1(int a) {
        System.out.println("func1(int): " + a);
    }
    
    public void func1(long a) {
        System.out.println("func1(long): " + a);
    }
}
 