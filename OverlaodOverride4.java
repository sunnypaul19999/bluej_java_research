import java.io.*; 

class Ax {
    public int f1() throws IOException{
        return 0;
    }
}

class Bx extends Ax {
    public int f1() throws FileNotFoundException, RuntimeException{
        return 0;
    }
}

public class OverlaodOverride4{

    public static void main(String[] args) {

    }
}