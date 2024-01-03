class A{
    public int val;
    A(int val){
        this.val  = val;
    }
}

class B extends A{
    protected int val;
    B(){
        super(10);
        val = 5;
    }
}
interface Func<T>{

    Object doStuff(int a, int b);
}

class Gen<T>{

    <V>Gen(V a,V b){}
}
public class LamdaTest{

    public <T extends Number> int add(T a, T b){
        return (int)a+(int)b;
    }

    public static void main() {
        Func<Integer> funcIntAdd = new LamdaTest()::<Integer>add;
        funcIntAdd.doStuff(10,15);
        Gen<Integer> t = new Gen<>(10,20);
        funcIntAdd = Gen<Double>::<Integer>new;
        B b = new B();
        A a = b;
        System.out.println(b.val+"\t"+a.val);
        System.out.println(Character.valueOf((char)0));

        String ay = "java";
    }
}