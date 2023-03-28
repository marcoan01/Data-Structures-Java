/**
 * Description: This driver class will execute all the operations from the TicketOperation class and it will print all the results
 * Class: Spring - COSC 2436.83448
 * Assignment 5: Ticket
 * Date: 04/28/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class TicketDemo
{
    
    /**
     * Description: This main class will create two different variables and will call all the operations by inputing the information given
     * @params: args as String[]
     * @returns nothing
     * @throws nothing
     */
    public static void main(String args[])
    {
        Ticket[] ti = new Ticket[60000];
        int n = 30000;
        String na = "Marco";
        String nam = "Maria";
        TicketOperations t = new TicketOperations();
        System.out.println("First, we make sure that a ticket number: 30,000  does not exist yet ");
        System.out.println(t.fetch(n, ti));
        t.insert(n, na, ti);
        System.out.println("\n\nThen, we insert the ticket number '30,000' with purchaser name 'Marco'");
        System.out.println(t.fetch(n, ti));
        System.out.println("\n\nThen, a new item will be updated ");
        t.update(n, nam, ti);
        System.out.println(t.fetch(n, ti));
        System.out.println("\n\nLastly, that element will be dropped ");
        t.delete(n, ti);
        System.out.println("Is 30000 on the list? " + t.fetch(n, ti));
    }

}
