import java.io.*; 

// test overriding methods throwing unchecked exception
class Ax {
    public int f1() throws ArithmeticException{
        return 0;
    }
}

class Bx extends Ax {
    public int f1() throws RuntimeException{
        return 0;
    }
}

public class OverlaodOverride3{

    public static void main(String[] args) {
        
    }
}