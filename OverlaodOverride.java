import java.io.*; 
class Ax {

    public Bx meth(int a) {

        System.out.println("meth Ax int");

        return new Bx();
    }

    public Ax func(int a)throws IOException{

        System.out.println("func Ax");

        return new Ax();
    }
    
    public Ax func(Ax a){

        System.out.println("public Ax func(Ax a)");

        return new Ax();
    }
    
    public void o1() throws ArithmeticException{
        
    }
}

class Bx extends Ax {

    // method overloaded
    public Ax meth(short a) {

        System.out.println("meth Bx short");

        return new Ax();
    }
    
    public Bx func(Bx a){

        System.out.println("public Bx func(Ax a)");

        return new Bx();
    }

    // method overloaded
    public void meth(double a) {

        System.out.println("meth Bx double");
    }

    // method overridden
    public Bx func(int a) throws NullPointerException{

        System.out.println("---func Bx");

        return new Bx();
    }
    
    public void o1() throws RuntimeException{
        System.out.println("o1");
    }

    public int hashCode() {
        return 1;
    }
}

public class OverlaodOverride{

    public static void main(String[] args) {

        Ax ax = new Bx();
        Bx bx = new Bx();
        
        ax.o1();
        
        ax.func(null);
        //ax.func(1);

        ax.meth((byte) 1); // "meth Ax int"

        bx.func(1);
        //ax.func(1); // func Bx
        
        Double a = 1.0/0.0;
        System.out.println(a);
    }
}