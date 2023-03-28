import java.io.*;
import java.util.*;
/**
 * Description: This driver class will simulate the elections and it will the results
 * Class: Spring - COSC 2436.83448
 * Assignment: Final Project
 * Date: 05/16/2019
 * @author: Marco Delgado
 * @version 1.0.0
 */
public class TestProgElectionResult
{
    /**
     * Description: This main method will call the methods from the other classes and will simulate the elections
     * @params: args as String[]
     * @returns nothing
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Candidate t;
        Candidate[] list = new Candidate[6];
        Scanner file = new Scanner(new FileReader("candData.txt"));
        System.out.println("Welcome the presidential elections of Richland College \n\n\nHere are the results ");
        System.out.println("Name           State1   State2  State3 State4  Total");
        ElectionResult.names(file, list, 6);
        ElectionResult.sorting(list, 6);
        file = null;
        file = new Scanner(new FileReader("voteData.txt"));
        ElectionResult.votes(file, list);
        ElectionResult.insert(list, 6);
        ElectionResult.print(list, 6);
    }

}
