import java.lang.*;
import java.util.*;
interface Method{
    int call(A a);
}

class A{
    int val;
    A(int val){
        this.val = val;
    }

    int getVal() {
        return val;
    }
}

public class LamdaWithInvokingObject{

    public static void main(String[] args) {
        Method method = A::getVal;
        System.out.println(method.call(new A(10)));
    }
}