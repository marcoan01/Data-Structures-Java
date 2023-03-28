/**
 * Description: This class will serve as the creator of listing objects that will hold name, street address and phone number of multiple people
 * Class: Spring - COSC 2436.83448
 * Assignment 3: Stack
 * Date: 04/13/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class Listing
{
    private String name;
    private String address;
    private String number;
    /**
     * Description: This non-parameter constructor will initialize the variables to " "
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public Listing()
    {
        name = " ";
        address = " ";
        number = " ";
    }
    
    /**
     * Description: This parameter constructor will initialize the variables with the information input by the user
     * @params: n as String (the name of the person), a as String (the street address), num as String (the phone numbe)
     * @returns nothing
     * @throws nothing
     */
    public Listing(String n, String a, String num)
    {
        name = n;
        address = a;
        number = num;
    }
    /**
     * Description: This method will return the name, street address and phone number of an listing object 
     * @params: nothing
     * @returns Name, street address and phone number
     * @throws nothing 
     */
    public String toString()
    {
        return("Name is " + name + "\n" + "Address is " + address + "\n" +
                "Number is " + number + "\n");
    }
    /**
     * Description: This method will return an exact copy of the listing object
     * @params: nothing
     * @returns clone as a Listing Object
     * @throws nothing
     */
    public Listing deepCopy()
    {
        Listing clone = new Listing(name, address, number);
            return clone;
    }
}
