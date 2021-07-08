import java.util.Scanner;
public class AreaAndCircumferenceOfCircle
{
    public static void main(String args[])
    {
        float r;
        double area, circum;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Radius of Circle : ");
        r = scan.nextFloat();
		
        area = 3.14*r*r;
        circum = 2*3.14*r;
		
        System.out.print("Area of Circle = " +area);
        System.out.print("\nCircumference of Circle = " +circum);
    }
}