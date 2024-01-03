import java.io.*; 

interface MyInterface  {
    String print() throws IOException;
}

class Ax implements MyInterface{
    
  public String print() throws RuntimeException {
      
      return "print";
  }

  public Ax func(int a) throws Exception {

    System.out.println("func Ax");

    return new Ax();
  }
 }

 class Bx extends Ax {

 

  // method overridden
  public Bx func(int a) throws Exception {

    System.out.println("func Bx");

    return new Bx();
  }
 }
 
 public class OverlaodOverride1{
    
    public static void main(String[] args) {
        
        Ax ax = new Bx();
       
        //ax.func(1);
        
        Bx bx = new Bx();
        //bx.func(2);
        
        MyInterface myInterface = ax;
        ax.print();
        //myInterface.print();
    }
}