/**
 * Description: This driver class will call all the methods from the SinglyLinkedList class and prove its funcionality with different data types 
 * Class: Spring - COSC 2436.83448
 * Assignment 4: SinglyLinkedList
 * Date: 04/14/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class SinglyLinkedListDemo
{
    /**
     * Description: This main method will perform all the methods from the SinglyLinkedList class by creating two different objects of different data types
     * @params: args as String[]
     * @returns nothing
     * @throws nothing
     */
    public static void main(String args[]){
    SinglyLinkedList<Integer> scores = new SinglyLinkedList<Integer>();
    //We proceed to insert 5 five different scores.
    scores.Insert(67);
    scores.Insert(73);
    scores.Insert(84);
    scores.Insert(98);
    scores.Insert(100);
    //We make sure that all of them are in the list
    scores.showAll();
    System.out.println("\n\n");
    //We fetch a node that exists in the list and another one that does not.
    System.out.println("Is 84 on the list ?    " + scores.Fetch(84));
    System.out.println("Is 95 on the list ?    " + scores.Fetch(95));
    //Dropping an element
    System.out.println("Has '98' been deleted from the list?    " + scores.Delete(98));
    //Now, the list will be printed without "98"
    scores.showAll();
    System.out.println("\n\n");
    //We will update the 4th element by adding the number "99"
    System.out.println("Has '99' been updated on the list?   " + scores.Update(100, 99));
    //The final list will be showed
    scores.showAll();
    System.out.println("\n\n\n\n");
    SinglyLinkedList<String> names = new SinglyLinkedList<String>();
    //We proceed to insert 5 five different scores.
    names.Insert("James");
    names.Insert("John");
    names.Insert("Marco");
    names.Insert("Phillip");
    names.Insert("Eric");
    //We make sure that all of them are in the list
    names.showAll();
    System.out.println("\n\n");
    //We fetch a node that exists in the list and another one that does not.
    System.out.println("Is Marco on the list ?    " + names.Fetch("Marco"));
    System.out.println("Is Maria on the list ?    " + names.Fetch("Maria"));
    //Dropping an element
    System.out.println("Has 'Phillip' been deleted from the list?    " + names.Delete("Phillip"));
    //Now, the list will be printed without "98"
    names.showAll();
    System.out.println("\n\n");
    //We will update the 4th element by adding the number "99"
    System.out.println("Has 'Hunter' been updated on the list?   " + names.Update("Eric", "Hunter"));
    //The final list will be showed
    names.showAll();
}
}
