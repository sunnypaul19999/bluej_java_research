interface I1
{
    String getGreeting();
}

interface I2
{
default String getGreeting() {
        return "Good afternoon!";
    }
}

public class InterfaceTest1 implements I1, I2 // won't compile
{
    public String getGreeting()
    {
        return "Good Evening!";
    }

    public static void main(String[] args)
    {
        System.out.println(new InterfaceTest1().getGreeting());
    }
}