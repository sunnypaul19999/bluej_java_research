public class MainMethodOverloadExp {
    int x;
    
    //void func(int a, int... b) {}
    //void func(int... a) {}
    
    void func(Integer a) {
        System.out.println(1);
    }
    //void func(String a) {}
    void func(Object a) {}
    
    public static void main() {
        MainMethodOverloadExp ob = new MainMethodOverloadExp();
        ob.x += 1;
        //int y;
        //y += 1;
        //ob.func(1);
        ob.func(null);
        System.out.println(ob.x);
    }


}