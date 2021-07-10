import java.util.Scanner;
public class Alphabetical_Order
{
    public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of strings:");
        count = s.nextInt();
        
        String str[] = new String[count];
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = s1.nextLine();
        }
        s.close();
        s1.close();
        
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + ", ");
        }
    }
}