public class Throws
{
   static void fun(int a, int b) throws ArithmeticException
   {
      int c;
      try
      {
         c = a/b;
      }
      catch(ArithmeticException e)
      {
         System.out.println("Caught exce: "+e);
      }
   }
   public static void main(String args[])
   {
      int a = 5;
      fun(a,0);
   }
}