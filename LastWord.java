/*
 * ICPC Practice Problem
 * @author Asher Hamrick
 * Google Code Jam Practice Problems
 * Problem: Last Word
 * https://code.google.com/codejam/contest/4304486/dashboard
 */
import java.util.*;
public class LastWord{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String input = scan.next();
        char ch;
        String nString = " ";
        
        //Loop through input string
        for(int c = 0; c < input.length(); c++){
            ch = input.charAt(c);
            if(c == 0){
                //Initial letter becomes first word
                nString = Character.toString(ch);
            }
            else{
                //If the ASCII value of the selected character is greater than the first character in the string, make it the first character
                if(ch >= nString.charAt(0)){
                    nString = Character.toString(ch).concat(nString);
                }
                
                else{
                    //Otherwise, make it the last character
                    nString = nString.concat(Character.toString(ch));
                }
            }
        }
        System.out.println(nString);
    }
}