import java.lang.*;

class A{
    
    public static void staticAOverload(){
        
        System.out.println("A::public static void staticAOverload()");
    }
    
    public Number overload(Double var){
        
        System.out.println("A::public Number overload(Double var)");
        
        return null;
    }
}

class B extends A{
    
    /*
     * this is error we cannot override static method
     * public void staticAOverload(){
        
        System.out.println("B::public void staticAOverload()");
    }*/
    
    /*
     *overloading the static method
     */
    protected void staticAOverload(int a){
        
        System.out.println("B::protected void staticAOverload(int a) [overloaded]");
    }
    
    /*
     * this is error because Object is super type of Number
     * therefore cannot overload method public Number overload(Double var) in class A
     * public Object overload(Double x){
        
        System.out.println("B::overload");
        
        return null;
    }*/

    public Double overload(String var){
        
        System.out.println("B:public Double overload(String var) [overloaded]");
        
        return null;
    }
}


public class MethodOverloadOverride{
    
    public static void main(String[] args) {
        
        B b = new B();
        
        A aRef = b;
        
        b.staticAOverload();
        
        b.staticAOverload(2);
        
        b.overload(2.0);
        
        aRef.overload(2.0);
    }
}