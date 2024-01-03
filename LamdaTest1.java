import java.io.*;
import java.util.*;
class X<T extends Number>{

}

class A{
    public int val;
    A(int val){
        this.val  = val;
    }

    public <T> T func1(List<? super Number> list) {
        return null;
    }

    protected B f1(int a) throws RuntimeException{
        return new B(1);
    }
}

class B extends A{
    B(int a) {
        super(a);
    }
}

interface Func1{

    A f1(int a) throws IOException;
}
public class LamdaTest1{

    public static void main() {
        A a1 = new A(1);
        Func1 func1 = a1::f1;
        func1 = A::new;
    }
}