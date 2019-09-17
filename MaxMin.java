/*
 * ICPC Practice Problem
 * @author Asher Hamrick
 * Hackerrank Practice Problems
 * Problem: Max Min
 * https://www.hackerrank.com/challenges/angry-children/problem
 */
import java.util.*;
public class MaxMin{
    public static void main(String [] args){
        int k, num;
        Scanner scan = new Scanner(System.in);
        
        //Take input from tester for Array Size
        System.out.println("Enter Number of Numbers: ");
        num = scan.nextInt();
        //Determine the Number of terms that will be involved
        System.out.println("Enter k: ");
        k = scan.nextInt();
        //Take input of the numbers
        System.out.println("Enter Numbers: ");
        int [] arr = new int[num];
        for(int c = 0; c<arr.length; c++){
            arr[c] = scan.nextInt();
        }
        
        System.out.println(min(k, arr));
    }
    
    public static int min(int k, int [] arr){
        int low = 0;
        //Sort array for easy subtraction
        Arrays.sort(arr);
        //Loop through array of numbers, subtracting the numbers based off of the k value
        for(int c = 0; c < arr.length - k; c++){
            if (c==0){
                low = arr[c+(k-1)] - arr[c];
            }
            else{
                //Find the lowest difference value based on the number of terms
                if(arr[c+k] - arr[c] < low){
                    System.out.println(arr[c+(k-1)] - arr[c]);
                    low = arr[c+(k-1)] - arr[c];
                }
            }
        }
        return low;
    }
}