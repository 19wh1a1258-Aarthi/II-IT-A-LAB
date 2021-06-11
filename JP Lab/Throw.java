public class Throw
{
   static void checkAge(int age)
   {
      if(age < 18)
       {
          throw new ArithmeticException("Access denied");
       }
       else
       {
          System.out.println("Access granted");
       }
    }
    public static void main(String[] args)
    {
       checkAge(15);
    }
}