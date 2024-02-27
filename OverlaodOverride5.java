import java.io.*; 

class Ax {
    public int f1(long i) throws IOException{
        System.out.println("long");
        return 0;
    }
}

class Bx extends Ax {
    public int f1(int i) throws FileNotFoundException, RuntimeException{
        System.out.println("int");
        return 0;
    }
}

public class OverlaodOverride5{

    public static void main(String[] args) throws IOException, FileNotFoundException{
        Bx bx = new Bx();
        bx.f1(1);

        long longVal  = 1;
        bx.f1(longVal);
    }
}