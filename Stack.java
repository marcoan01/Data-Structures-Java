/**
 * Description: This class will hold all the methods that the original class included, and the new methods 
 * Class: Spring - COSC 2436.83448
 * Assignment 3: Stack
 * Date: 04/13/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class Stack
{
    private Listing[] data;
    private int top;
    private int size;
    /**
     * Description: This is the non-parameter constructor that will initialize the data array with 100 elements
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public Stack()
    {
        top = -1;
        size = 100;
        data = new Listing[100];
    }
    /**
     * Description: This parameter constructor will accept the amount of elements from the user, and use that number to initialize the data array
     * @params: n as int. The number of elements of the array
     * @returns nothing
     * @throws nothing
     */
    public Stack(int n)
    {
        top = -1;
        size = n;
        data = new Listing[n];
    }
    /**
     * Description: This method will add a listing object to the stack
     * @params: newNode as Listing.
     * @returns true or false
     * @throws nothing
     */
    public boolean Push(Listing newNode)
    {
        if(top == size -1)
            return false;
        else
        {
            top = top + 1;
            data[top] = newNode.deepCopy();
            return true;
        }
    }
    /**
     * Description: This method will drop and return an element of the stack
     * @params: nothing
     * @returns null (if the stack is empty) or the deep copy of the listing object
     * @throws nothing
     */
    public Listing Pop()
    {
        int topLocation;
        if (top == -1)
            return null;
        else
        {
            topLocation = top;
            top = top -1;
            return data[topLocation];
        }
    }
    /**
     * Description: This method will print all the elements of the data array
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public void showAll()
    {
        for (int i = top; i>= 0; i--)
        {
            System.out.println(data[i].toString());
        }
    }
    /**
     * Description: This method will reset the values of all the elements of the data array.
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public void Reset()
    {
        top = -1;
        size = 100;
        data = new Listing[100];
    }
    /**
     * Description: This method will check whether the array is empty or not
     * @params: nothing
     * @returns true (if it is empty) or false
     * @throws nothing
     */
    public boolean Underflow()
    {
        if (top == -1)
        {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Description: This method will check whether the array is full or not
     * @params: nothing
     * @returns true (if it is full) or false
     * @throws nothing
     */
    public boolean Overflow()
    {
        if (top == size -1)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    /**
     * Description: This method will return the top of the stack
     * @params: nothing
     * @returns data[top] (the peek of the stack) or null
     * @throws nothing
     */
    public Listing peek()
    {
        if(!Underflow())
        {
            return data[top];
        }
        else
        {
            return null;
        }
    }
}
