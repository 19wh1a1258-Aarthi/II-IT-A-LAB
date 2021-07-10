import java.util.Scanner;
public class SumOfElementsOfAnArray 
{
   public static void main(String args[])
   {
      System.out.println("Enter the size of the array : ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int Array[] = new int [size];
      int sum = 0;
      System.out.println("Enter the elements of the array");

      for(int i=0; i<size; i++)
      {
         Array[i] = s.nextInt();
         sum = sum + Array[i];
      }
      System.out.println("Sum of the elements of the array : "+sum);
   }
}