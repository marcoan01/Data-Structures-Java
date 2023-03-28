import java.util.Scanner;
/**
 * Description: This is the driver that will check for input validation and will execute the sum for the input that the user decided to enter
 * Class: Spring - COSC 2436.83448
 * Assignment 6: Sum
 * Date: 04/26/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class SumRangeDemo
{
    /**
     * Description: This main method will get the two numbers from the user, then check for input validation and it will print the sum of the integers between those two numbers.
     * @params: args as String[]
     * @returns nothing
     * @throws nothing
     */
    public static void main(String[] args)
    {
        int a,b;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number ");
        a = keyboard.nextInt();
        System.out.println("Enter a smaller number than the first one ");
        b = keyboard.nextInt();
        while(a<b)
        {
            System.out.println("Invalid input. The second number must be smaller than the first one");
            System.out.println("Enter a smaller number than " + a);
            b = keyboard.nextInt();
        }
        System.out.println("The sum of the integers from " + a + " to " + b + " is " + SumRange.sum(a,b));
    }
    

}