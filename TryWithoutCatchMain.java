public class TryWithoutCatchMain {

    public static void main(String args[]) throws Exception
    {
        try
        {
            throw new Exception();
            // System.out.println("Executing try block"); 
        }
        finally
        {
            System.out.println("Executing finally block"); 
        }
    }
}