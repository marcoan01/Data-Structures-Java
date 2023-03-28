/**
 * Description: This class will have two methods that both sort the arrays in reverse order and calculate the average of the prices input by the user
 * Class: Spring - COSC 2436.83448
 * Assignment 1: Items
 * Date: 03/26/2019
 * @author Marco Delgado
 * @version 1.0.2
 */
public class Items
{
     private String names[];
    private int prices[];
    /**
         * Description: this is the constructor, this method will handle the creation of an items object. No operations needed in it.
         * @params nothing
         * @returns nothing
         * @throws nothing
         */
    public Items() {
    
    }
    /**
         * Description: the reverse method will accept an array with prices, and an array with names. Then, it will assign those values into other arrays to sort them in reverse, so it can print them afterwards
         * @params arr1 as String[] (this will hold the names of the items) and arr2 as int[] (this will hold the prices of the items)
         * @returns nothing
         * @throws nothing
         */
    public void reverse(String[] arr1, int[] arr2)
    {
        String[] names = new String[arr1.length];
        int prices[] = new int[arr2.length];
        for(int i = 0; i < arr1.length; i++)
        {
            names[i] = arr1[arr1.length - 1 -i];
            prices[i] = arr2[arr2.length - 1 - i];
            System.out.println("Item name:   " + names[i] + "     " + "Price:   " + prices[i] + "$");
        }
        
    }
    /**
         * Description: the average will determine whether there is name "peas" in the string array or not; if that is the case, the method will calculate the average of the prices
         * @params arr1 as String[] (this will hold the names of the items) and arr2 as int[] (this will hold the prices of the items)
         * @returns nothing
         * @throws nothing
         */
    public void Average(String[] arr1, int[] arr2)
    {
        int x = 0;
        int sum = 0;
        double average = 0;
        for(int i =0; i < arr1.length; i++)
        {
            if(arr1[i].equalsIgnoreCase("Peas"))
            {
                x = 1;
            }
            
        }
        if(x == 1)
        {
            for(int i = 0; i < arr2.length; i++)
            {
                sum = sum + arr2[i];
                
            }
            average = sum/(arr2.length);
            System.out.println("The average of the prices is going to be " + average);
        }
        else
        {
            System.out.println(" No average output ");
        }
      
    }
}
