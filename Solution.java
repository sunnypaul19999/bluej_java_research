import java.lang.*;

class A {
    A() {
        
    }
    
    A(int i) {}
}

class B extends A{
    B(int x) {
    }
}

public class Solution {

    public static void main() {
        B b = new B(10);
    }
}