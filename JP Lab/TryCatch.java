public class TryCatch
{
   public static void main(String args[])
   {
      try
      {
          int dividebyzero = 40 / 0;
      }
      catch(ArithmeticException e)
      {
          System.out.println(e);
      }
      System.out.println("Rest of the code");
   }
}