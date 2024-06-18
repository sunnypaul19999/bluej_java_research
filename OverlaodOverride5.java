

class Ax {
    public int f1(long i){
        System.out.println("long");
        return 0;
    }
}

class Bx extends Ax {
    public int f1(int i){
        System.out.println("int");
        return 0;
    }
}

public class OverlaodOverride5{

    public static void main(String[] args) {
        Bx bx = new Bx();
        bx.f1(1);
        long longVal  = 1;
        bx.f1(longVal);
    }
}