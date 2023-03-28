/**
 * Description: This class will hold the method to return the sum of the integers between a certain range
 * Class: Spring - COSC 2436.83448
 * Assignment 6: Sum
 * Date: 04/26/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class SumRange
{
    /**
     * Description: This method will be the recursive solution to the sum of the integers between x and y
     * @params: x and y as integers
     * @returns x or the sum of the two integers input
     * @throws nothing
     */
    public static int sum(int x, int y)
    {
        if(x==y)
            return x;
        else
        {
            return x + sum(x -1, y);
        
        
        }
    
    }

}
