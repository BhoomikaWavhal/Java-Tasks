import java.util.Scanner;  // Import the Scanner class
public class Task2_AreaPerimeterOfCircle
{
    public static void main(String args[])
    {
        Scanner radius = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Radius :");
        int r = radius.nextInt();  // Read user input
        double area=3.14*r*r;
        double perimeter=2*3.14*r;
        System.out.println("Area is : " + area);  // Output user input
        System.out.println("Perimeter is : " + perimeter);  // Output user input
    }
}
