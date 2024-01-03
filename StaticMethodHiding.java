import java.io.*;

class A {
    public static int func() {return 0;}
}

public class StaticMethodHiding extends A {

    public static int func() {return 1;}

    // public int func() {return 0;}

    public static void main(String args[]) throws IOException {
        System.out.println(StaticMethodHiding.func());
    }
}