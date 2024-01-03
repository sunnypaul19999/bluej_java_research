import java.lang.*;
import java.util.*;
interface CreateMyClass{
    MyClass[] apply(int n);
}

class MyClass{
    MyClass(int n){}
}

public class ArrLambdaRef{

    public static void main(String[] args) {

        CreateMyClass create = MyClass[]::new;
        create.apply(5);
    }
}