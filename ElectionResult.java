import java.util.*;
/**
 * Description: This class will simulate all the processes to run the elections
 * Class: Spring - COSC 2436.83448
 * Assignment: Final Project
 * Date: 05/16/2019
 * @author: Marco Delgado
 * @version 1.0.0
 */
public class ElectionResult
{
    /**
     * Description: This method will read the names from the file and will put them into the array
     * @params: inFile as Scanner, list as Candidate array, nu as int (number of candidates)
     * @returns nothing
     * @throws nothing
     */
    public static void names(Scanner inFile, Candidate[] list, int nu)
    {
        String name;
        Candidate t;
        for(int i = 0; i < nu; i++)
        {
            name = inFile.next();
            t = new Candidate();
            t.setName(name);
            list[i] = t;
        }
    }
    /**
     * Description: This method will sort the array
     * @params: list as Candidate array, length as int
     * @returns nothing
     * @throws nothing
     */
    public static void sorting(Candidate[] list, int length)
    {
        for(int i = 1; i < length; i++)
        {
            Candidate t = list[i];
            if(t.compareName(list[i - 1]) < 0)
             {
              Candidate temp = list[i];
              int l = i;
              do
              {
                  list[l] = list[l - 1];
                  l--;
              }
              while(l > 0 && temp.compareName(list[l -1]) < 0);
              list[l] = temp;
            }
        }  
    }       
    /**
     * Description: This method will search for a specific candidate in the system
     * @params: list as Candidate array, length as int, searchItem as Candidate
     * @returns nothing
     * @throws nothing
     */
    public static int search(Candidate[] list, int length, Candidate searchItem)
    {
        boolean item = false;
        int f = 0;
        int l = length - 1;
        int m = 0;
        while(f <= l && !item)
        {
            m = (f + l)/2;
            Candidate t = list[m];
            if(t.compareName(searchItem) == 0)
                item = true;
            else if(t.compareName(searchItem) > 0)
                l = m - 1;
            else
                f = m + 1;
                
        }
        if(!item)
            m = -1;
        return m;
    }
    /**
     * Description: This method will read the votes from the file and put them into the array
     * @params: infile as Scanner, list as Candidate array
     * @returns nothing
     * @throws nothing
     */
    public static void votes(Scanner inFile, Candidate[] list)
    {
        Candidate t;
        String name;
        int state;
        int v;
        int l;
        while(inFile.hasNext())
        {
            name = inFile.next();
            state = inFile.nextInt();
            v = inFile.nextInt();
            t = new Candidate();
            t.setName(name);
            t.setVotes(state, v);
            l = search(list, 6, t);
            if(l != -1)
            {
                t = list[l];
                t.UpdateVotes(state, v);
            }
        }
    }
    /**
     * Description: This method will insert the candidates into the array
     * @params: list as Candidate array, nu as int
     * @returns nothing
     * @throws nothing
     */
    public static void insert(Candidate[] list, int nu)
    {
     Candidate t;
     for(int i = 0; i < nu; i++)
     {
         list[i].total();
     }
    }
    /**
     * Description: This method will print the results for the election
     * @params: list as Candidate array, nu as int
     * @returns nothing
     * @throws nothing
     */
    public static void print(Candidate[] list, int nu)
    {
        int l =0;
        int sum = 0;
        int winner =0;
        for(int i = 0; i < nu; i++)
        {
         list[i].data(); 
         sum = sum + list[i].getTotal();
         if(l < list[i].getTotal())
          {
            l = list[i].getTotal();
            winner = i;
            }
        }
        System.out.print("\n Winner is " + list[winner].getName());
    }
}
