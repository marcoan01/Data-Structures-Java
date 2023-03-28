/**
 * Description: This class will hold the information of the ticket purchaser
 * Class: Spring - COSC 2436.83448
 * Assignment 5: Ticket
 * Date: 04/28/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class Ticket
{
    private int number;
    private String name;
    
    /**
     * Description:  This constructor will initialize the ticket number to 0 and the name to blank
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public Ticket()
    {
        number = 0;
        name = " ";
    }
    /**
     * Description:  This arg-constructor will create a ticket by giving the information from the user or the program
     * @params: nu (ticket number), na (purchaser name) 
     * @returns nothing
     * @throws nothing
     */
    public Ticket(int nu, String na)
    {
        number = nu;
        name = na;
    }
    /**
     * Description:  This method will print the purcharser's name and ticket number
     * @params: nothing
     * @returns a message that prints the name and the ticket number
     * @throws nothing
     */
    public String toString()
    {
        return("Name of the purchaser " + name + "\n" + "Ticket number " + number);
    }
    /**
     * Description:  This method wil create and return a deep copy of a ticket 
     * @params: nothing
     * @returns a Ticket object (deep copy of it)
     * @throws nothing
     */
    public Ticket deepCopy()
    {
        Ticket clone = new Ticket(number, name);
        return clone;
    }
}
