/**
 * Description: This driver class will operate all the methods of the StudentListings class 
 * Class: Spring - COSC 2436.83448
 * Assignment 2: Student Database
 * Date: 03/30/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class StudentListingsDemo
{
    /**
     * Description: this is the main method that will create a StudnetListing object with the information that the user input and then it will perform all the methods from the StudentListing class
     */
    public static void main(String[] args)
    {
        int control;
        String sample;
        StudentListings st = new StudentListings(); 
        sample = st.input(); //Since the input method returns the name, that name then it is assigned to this variable to verify the compareTo method
        System.out.println(st.toString());
        st.deepCopy();
        control = st.compareTo(sample); //The sample variable is being sent to the compareTo method to make sure that the information has been deep copied 
        if(control != 0) // This operation will always return the second statement because the same name is being sent to compare its existence. 
        {
            System.out.println("The name is not in the database");
        }
        else
        {
            System.out.println("The name is in the database");
        }
    }



}
