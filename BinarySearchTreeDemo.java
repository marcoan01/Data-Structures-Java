/**
 * Description: This class will simulate the trees 7.3f and 7.3e from the book and then it will traverse them
 * Class: Spring - COSC 2436.83448
 * Assignment 7: Binary Search Tree NLR
 * Date: 05/05/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class BinarySearchTreeDemo
{
    /**
     * Description: This main method will create two trees, insert some numbers into them and then traverse them
     * @params: args as String[]
     * @returns nothing
     * @throws nothing
     */
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        BinarySearchTree tree1 = new BinarySearchTree();
        
        //Tree 7.3f
        tree.insert(50);
        tree.insert(55);
        tree.insert(60);
        tree.insert(40);
        tree.insert(45);
        tree.insert(30);
        tree.insert(62);
        tree.scan();
        System.out.println("\n\n");
        //Tree 7.3e
        tree1.insert(50);
        tree1.insert(30);
        tree1.insert(15);
        tree1.insert(40);
        tree1.insert(60);
        tree1.insert(55);
        tree1.scan();
        
    }



}
