import java.util.Arrays;
/**
 * Description: This class will simulate a binary search tree by having an insert method and the traversal method
 * Class: Spring - COSC 2436.83448
 * Assignment 7: Binary Search Tree NLR
 * Date: 05/05/2019
 * @author: Marco Delgado
 * @version 1.0.1
 */
public class BinarySearchTree
{
    int tree[];
    
    /**
     * Description: This constructor will initialize the array with 50 elements
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public BinarySearchTree()
    {
        tree = new int[50];
        Arrays.fill(tree, Integer.MIN_VALUE);
        
    
    }
    /**
     * Description: This method will determine the root node and the left and right children
     * @params: nu as int (number being added) and i as int(index in the array)
     * @returns nothing
     * @throws nothing
     */
    public void insertNumber(int nu, int i)
    {
        if(tree[i] == Integer.MIN_VALUE)
            tree[i] = nu;
        else if(nu < tree[i])
            insertNumber(nu, getL(i));
        else 
            insertNumber(nu, getR(i));
    }
    /**
     * Description: This method will finally insert the value into the BST by calling the insertNumber method to determine the children
     * @params: nu as int (number being added)
     * @returns nothing
     * @throws nothing
     */
    public void insert(int nu)
    {
        insertNumber(nu, 0);
    }
    /**
     * Description: This method will serve as the traversal method in a recursive way
     * @params: nu as int(number being added)
     * @returns nothing
     * @throws nothing
     */
    public void NLR(int nu)
    {
        int l, r;
        System.out.print(tree[nu] + " ");
        l = getL(nu);
        if(tree[l] != Integer.MIN_VALUE)
            NLR(l);
        r = getR(nu);
        if(tree[r] != Integer.MIN_VALUE)
            NLR(r);
    }
    /**
     * Description: This method will return the left child of the number given
     * @params: nu as int(number being added)
     * @returns the number * 2 + 1
     * @throws nothing
     */
    public int getL(int nu)
    {
        return nu*2+1;
        
    }
    /**
     * Description: This method will get the right chuild of the number
     * @params: nu as int (number being added)
     * @returns the number * 2 + 2
     * @throws nothing
     */
    public int getR(int nu)
    {
        return nu*2+2;
    }
    /**
     * Description: This method will be called to print the traversal of the tree
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public void scan()
    {
        NLR(0);
        System.out.println();
    }
}
