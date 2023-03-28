import javax.swing.JOptionPane;
/**
 * Description: This class will create the nodes for the database. It will hold multiple methods to check the information input by the user
 * Class: Spring - COSC 2436.83448
 * Assignment 2: Student Database
 * Date: 03/30/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class StudentListings
{
    private String name;
    private double gpa;
    private String id;
    
    /**
     * Description: This is the non-parameter constructor that will initialize the variables
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public StudentListings()
    {
        gpa = 0.0;
        id = "12345678";
        name = "example";
    }
    /**
     * Description: This is the constructor that will set the variables to the parameters input by the user
     * @params: n as String (this will hold the name of the student), g a Double (this is the gpa) and i as String (this is the identication number)
     * @returns nothing
     * @throws nothing
     */
    public StudentListings(String n, double g, String i)
    {
        name = n;
        gpa = g;
        id = i;
    }
    /**
     * Description: This method will return the printed information that was input by the user
     * @params: nothing
     * @returns the name, gpa, and identification number of the student
     * @throws nothing
     */
    public String toString()
    {
        return("Name is " + name + "\nIdentification number is " + id + "\nGPA is " + gpa + "\n");
    
    }
    /**
     * Description: This method will create a deep copy of a StudentListing object with the  information of the student that was input by the user 
     * @params: nothing
     * @returns st as a StudentListings object 
     * @throws nothing
     */
    public StudentListings deepCopy()
    {
        StudentListings st = new StudentListings(name, gpa, id);
        return st;
    }
    /**
     * Description: This method will compare the names to determine whether the name exists or not
     * @params: targetKey as String 
     * @returns 0 if they are equal, otherwise they will not be the same
     * @throws nothing
     */
    public int compareTo(String targetKey)
    {
        return(name.compareTo(targetKey));
    }
    /**
     * Description: This method will ask the user to input the name, gpa and identification number of the student
     * @params: nothing 
     * @returns name (what the user input)
     * @throws nothing
     */
    public String input()
    {
        name = JOptionPane.showInputDialog("Enter a name ");
        gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter a gpa: "));
        id = JOptionPane.showInputDialog("Enter the Identification number");
        return name;
    }
}
