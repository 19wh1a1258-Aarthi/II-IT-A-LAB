import java.util.Scanner;
class CheckEvenOdd
{
  public static void main(String args[])
  {
    int x;
    System.out.println("Enter the number:");
    Scanner input = new Scanner(System.in);
    x = input.nextInt();
    if(x % 2 == 0 )
        System.out.println("The number is even");
    else
        System.out.println("The number is odd");
  }
}