import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String args[]) 
    {
        float p, r, t, sim_interest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        scan.close();
        sim_interest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +sim_interest);
    }
}