/**
 * Description: This class creates the 4 basic operations to handle the hash structure
 * Class: Spring - COSC 2436.83448
 * Assignment 5: Ticket
 * Date: 04/28/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class TicketOperations
{
    int pseudokey;
    /**
     * Description: This is the constructor, it is not needed to send parameters to it
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public TicketOperations()
    {
    
    }
     /**
     * Description:  This class will insert a ticket into the structure
     * @params: number (ticket number), name (purchaser name) d (The 60,000 tickets available)
     * @returns nothing
     * @throws nothing
     */
    public void insert(int number, String name, Ticket[] d)
    {
        Ticket t = new Ticket(number, name);
       
        pseudokey = d.length % number;
        d[pseudokey] = t.deepCopy();
    }
    /**
     * Description:  This class will return a specific element from the structure
     * @params: number (ticket number), d (The 60,000 tickets available)
     * @returns a Ticket object
     * @throws nothing
     */
    public Ticket fetch(int number, Ticket[] d)
    {
        pseudokey = d.length % number;
        if(d[pseudokey] == null)
            return null;
        else
            return d[pseudokey].deepCopy();
    }
    /**
     * Description:  This class will delete a specific element from the structure
     * @params: number (ticket number), d (The 60,000 tickets available)
     * @returns true or false
     * @throws nothing
     */
    public boolean delete(int number, Ticket[] d)
    {
       pseudokey = d.length % number;
       if(d[pseudokey] == null)
        return false;
       else
       {
           d[pseudokey] = null;
           return true;
       }
    }
    /**
     * Description:  This class will update the information on a specific ticket number
     * @params: number (ticket number), name (purchaser name) d (The 60,000 tickets available)
     * @returns true or false
     * @throws nothing
     */
    public boolean update(int number,String name,  Ticket[] d)
    {
        if(delete(number, d) == false)
            return false;
        else
        {
            insert(number, name, d);
            return true;
        }
    }
}