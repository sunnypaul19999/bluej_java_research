import java.io.*; 

class A {
    public void f1() throws IOException{
        System.out.println("A::f1");
    }
}

class B extends A {
    public void f1() throws IOException, CloneNotSupportedException {
        System.out.println("B::f1");
    }
}

public class OverlaodOverride8{

    public static void main(String[] args){

    }
}