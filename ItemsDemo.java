import java.util.*;
/**
 * Description: This is the driver class that will create a couple of arrays, assign the values as the user inputs them, and then call the methods necessary to complete the tasks
 * Class: Spring - COSC 2436.83448
 * Assignment 1: Items
 * Date: 03/26/2019
 * @author Marco Delgado
 * @version 1.0.2
 */
public class ItemsDemo
{
        /**
         * Description: this is the main method that will hold the numbers and names input by the user, so it can call the other methods of the Items class
         * @params args as String
         * @returns nothing
         * @throws nothing
         */
        public static void main(String[] args)
        {
            int y;
            Scanner keyboard = new Scanner(System.in);
            msg();
            System.out.println("Hi, how many items would you like to enter? ");
            y = keyboard.nextInt();
            String[] name = new String[y];
            int[] price = new int[y];
            int[] number = new int[y];
            for (int i = 0; i < y; i++)
            {
                keyboard.nextLine();
                System.out.println("Enter an item name ");
                name[i] = keyboard.nextLine();
                System.out.println("Enter its price ");
                price[i] = keyboard.nextInt();
            }
            Items it = new Items();
            it.reverse(name,price);
            it.Average(name, price);
        }
        /**
         * Description: The msg method is created to print a message to the user right before the results are printed
         * @params nothing
         * @returns nothing
         * @throws nothing
         */
        private static void msg()
        {
            System.out.println("Welcome to St. Joseph's College \n\n ");
        }
}
