/**
 * Description: This is the driver class that will operate all the methods from the Stack class
 * Class: Spring - COSC 2436.83448
 * Assignment 3: Stack
 * Date: 04/13/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class StackDemo
{
    /**
     * Description: This method will create 4 listing objects. It will perform all the new operations that were asked 
     * @params: args[] as String
     * @returns nothing
     * @throws nothing
     */
    public static void main(String args[])
    {
        int size = 0;
        System.out.println("Hello. 4 Listing objects have been created to put them into a Stack");
        Listing n1 = new Listing("John Collins","555 Main St", "111-222-8765");
        Listing n2 = new Listing("Juan Martinez", "2389 Main St", "222-111-8765");
        Listing n3 = new Listing("Nicky Romero", "5678 Main St", "888-212-4567");
        Listing n4 = new Listing("Marco Delgado", "1650 Main St","469-345-6789");
        Stack st = new Stack(4);
        st.Push(n1);
        st.Push(n2);
        st.Push(n3);
        st.Push(n4);
        st.showAll();
        System.out.println("\nA Stack of 4 elements has been created and the 4 Listing objects have been pushed into the stack");
        System.out.println("\nIs the Stack full? " + st.Overflow());
        System.out.println("\nWhat is its top element? " + st.peek());
        System.out.println("\nThe stack is about to be reinitialized. The reset method will be called");
        st.Reset();
        System.out.println("\nIs the stack empty now? " + st.Underflow());
    }


}
