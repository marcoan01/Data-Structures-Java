/**
 * Description: This class will simulate each candidate with their votes
 * Class: Spring - COSC 2436.83448
 * Assignment: Final Project
 * Date: 05/16/2019
 * @author: Marco Delgado
 * @version 1.0.0
 */
public class Candidate 
{
    private int[] votes;
    private int states = 4;
    private String name;
    private int total;
    /**
     * Description: This constructor will initialize the variable total and the votes array
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public Candidate()
    {
        total = 0;
        votes = new int[states];
    }
    /**
     * Description: This method will return the name of the candidate
     * @params: nothing
     * @returns name
     * @throws nothing
     */
    public String getName()
    {
        return name;
    }
    /**
     * Description: This method will return the total of votes for a candidate
     * @params: nothing
     * @returns total of votes
     * @throws nothing
     */
    public int getTotal()
    {
        return total;
    }
    /**
     * Description: This method will set the name of the candidate
     * @params: na as String (name of the person)
     * @returns nothing
     * @throws nothing
     */
    public void setName(String na)
    {
        name = na;
    
    }
    /**
     * Description: This method will print the candidate with their votes
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public void data()
    {
        System.out.printf("%-14s ", name + " ");

        for (int i = 0; i < 4; i++)
             System.out.printf("%6d ", votes[i]);

        System.out.printf("%5d%n", total);
    }
    /**
     * Description: This method will calculate the total votes of the election
     * @params: nothing
     * @returns nothing
     * @throws nothing
     */
    public void total()
    {
        total = 0;
        for(int i = 0; i < 4; i++)
        {
            total = votes[i] + total;
        }
    }
    /**
     * Description: This method will set the votes per state
     * @params: s as int (number of states), v as int (votes)
     * @returns nothing
     * @throws nothing
     */
    public void setVotes(int s, int v)
    {
        votes[s - 1] = v;
    }
    /**
     * Description: This method will update the votes per state
     * @params: s as int (number of states), v as int (votes)
     * @returns nothing
     * @throws nothing
     */
    public void UpdateVotes(int s, int v)
    {
        votes[s - 1] = votes[s -1] + v;
    
    }
    /**
     * Description: This method will compare two names of candidates
     * @params: otherCan Candidate 
     * @returns true(if they are equal) or false
     * @throws nothing
     */
    public boolean equalsName(Candidate otherCan)
    {
        if(name.equals(otherCan.name))
            return true;
        else
            return false;
    }
    /**
     * Description: This method will also compare two names of candidates
     * @params: otherCan Candidate 
     * @returns 0, 1, or -1
     * @throws nothing
     */
    public int compareName(Candidate otherCan)
    {
        int na = name.compareTo(otherCan.name);
        if(na == 0)
            return 0;
        else if (na > 0)
            return 1;
        else
            return -1;
    
    }
    
}
