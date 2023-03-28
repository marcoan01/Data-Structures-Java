/**
 * Description: This class will have all the methods to change the list that is going to be created
 * Class: Spring - COSC 2436.83448
 * Assignment 4: SinglyLinkedList
 * Date: 04/14/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class SinglyLinkedList<T>
{
    private Node<T> h;
    /**
     * Description: This constructor will create the header of the list of generic data type
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public SinglyLinkedList()
    {
        h = new Node<T>();
    }
    /**
     * Description: This method will insert a node in the list
     * @params: d as generic data type
     * @returns true or false (if the list is empty)
     * @throws nothing
     */
    public boolean Insert(T d)
    {
          if (d == null)
          {
            return false;
            }
          else
          {
           Node<T> no = new Node<T>(d);
           no.next = h.next;
           h.next = no;
           return true;
            }
    }
    /**
     * Description: This method will fetch an element that will be passed as an argument
     * @params: targetKey as generic data type
     * @returns null (if it was not found) or the element that was searched
     * @throws nothing
     */
    public T Fetch(T targetKey)
    {
        Node<T> p = h.next;
        while(p != null && !p.node.equals(targetKey))
        {
            p = p.next;
        }
        if(p!= null)
        {
            return p.node;
        }
        return null;
    }
    /**
     * Description: This method will delete an element on the list
     * @params: targetkey as generic data type
     * @returns true or false (if the list is empty)
     * @throws nothing
     */
    public boolean Delete(T targetKey)
    {
        Node q = h;
        Node p = h.next;
        while(p!= null && !p.node.equals(targetKey))
        {
            q = p;
            p = p.next;
        }
        if(p!= null)
        {
            q.next = p.next;
            return true;
        }
        return false;
    }
    /**
     * Description: This method will update an element from the list
     * @params: targetKey as generic data type and newNode as generic data type
     * @returns true or false 
     * @throws nothing
     */
    public boolean Update(T targetKey, T newNode)
    {
        if(Delete(targetKey) == false)
        {
            return false;
        }
        else if(Insert(newNode) == false)
        {
            return false;
        }
        return true;
    }
    /**
     * Description: This method will print all the elements from the list
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public void showAll()
    {
        Node p = h.next;
        while(p != null)
        {
            System.out.println(p.node);
            p = p.next;
        }
    }
    public class Node<T>
{
    T node;
    Node<T> next;
    /**
     * Description: This constructor will be the creator of a node
     * @params: n as generic data type
     * @returns nothing
     * @throws nothing
     */
    public Node(T n)
    {
        node = n;
        next = null;
    }
    /**
     * Description: This constructor will be the creator of a node that will initialize both node and next as null
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public Node()
    {
        node = null;
        next = null;
    }

}
}

