import java.util.Scanner;
public class AverageUsingArrays
{
    public static void main(String[] args) 
    {
        int num, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        num = s.nextInt();
        int a[] = new int[num];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < num ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / num;
        System.out.println("Average:"+average);
    }
}