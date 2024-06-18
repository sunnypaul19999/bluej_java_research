import java.io.*; 
import java.util.concurrent.ExecutionException;

class RtExp1 extends RuntimeException {}
class RtExp2 extends RuntimeException {}
class RtExp3 extends RtExp2 {}

class Ax {
    public int f1() throws IOException, CloneNotSupportedException, InterruptedException, RtExp1{
        System.out.println("f1:parent");
        return 0;
    }
    public void f2(int i) {
        System.out.println("f2:parent");
    }
}

class Bx extends Ax {
    public int f1() throws NullPointerException, CloneNotSupportedException, FileNotFoundException, InterruptedException, RtExp3{
        System.out.println("f1:overriden");
        return 0;
    }
    public void f2(long i) {
        System.out.println("f2:overloaded");
    }
    /*public void f2(int i) {
        System.out.println("f2:overriden");
    }*/
    public void f3() {
    }
}

public class OverlaodOverride9{

    public static void main(String[] args) throws ExecutionException, IOException, FileNotFoundException, CloneNotSupportedException, InterruptedException{
        Ax a = new Bx();
        a.f1();
        //long val1 = 1;
        int val1 = 1;
        a.f2(val1);
        //a.f3();
    }
}