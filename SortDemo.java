import java.util.Scanner;
/**
 * Description: This is the driver that contains the main method and a static method to do the bubble sort.
 * Class: Spring - COSC 2436.83448
 * Assignment 8: Bubble Sort
 * Date: 05/07/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class SortDemo
{
    /**
     * Description: This main method will hold a random array, then it will call the sorting method, and it will print the array sorted with the comparisons and swaps
     * @params: args as String[]
     * @returns nothing
     * @throws nothing
     */
    public static void main(String[] args)
    {
        int[] data={40, 60, 20, 100, 90, 30, 50, 70, 10, 80};
        for(int i =0; i < data.length; i++)
        {
            System.out.print(data[i] + " ");
        
        }
        System.out.println("\n\n");
        
        sort(data);
        
        for(int i =0; i < data.length; i++)
        {
            System.out.print(data[i] + " ");
        
        }
    
    }
    /**
     * Description: This method will sort the array by using the bubble sort method
     * @params: n as int[] 
     * @returns nothing
     * @throws nothing
     */
    public static void sort(int[] n)
    {
        boolean s = true;
        int last = n.length - 2;
        int comparisons = 0;
        int swaps = 0;
        while(s)
        {
            s = false;
            for(int i = 0; i <= last; i++)
            {
                comparisons++;
                if(n[i] > n[i+1])
                {
                    swaps++;
                    int temp = n[i+1];
                    n[i+1] = n[i];
                    n[i] = temp;
                    s = true;
                }
            }
            
        
        
        }
        System.out.println("Comparisons " + comparisons);
        System.out.println("Swaps " + swaps);
    }

}
