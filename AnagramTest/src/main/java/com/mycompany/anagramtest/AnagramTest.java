package com.mycompany.anagramtest;


// Importing the Arrays class that will help us manipulate arrays.
import java.util.Arrays;

// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// For example, the word anagram itself can be rearranged into nag a ram, also the word binary into brainy and the word adobe into abode.
public class AnagramTest {
    /** 
    *@param str1 str2
    *@return return true if both strings are anagram of each other and false otherwise
    *@author Jeancy Tshibemba
    *@since April 2020
    */
	private static boolean isAnagram(String str1 , String str2){
            // Converting both strings to char arrays as strings do not have direct
            // sorting method in java.
            char [] leftArray = ( str1.trim().toLowerCase()).toCharArray();
            char [] rightArray = ( str2.trim().toLowerCase()).toCharArray();
            Arrays.parallelSort(leftArray); // Sorting the first array or left array
            Arrays.parallelSort(rightArray); // Sorting the second array or right array
            return Arrays.equals(leftArray, rightArray); // The equals method of the Arrays class checks if 2 arrays have the same elements in the same order
        }			    
	public static void main(String [] args){
            //Test cases;
            String a = "integral"; // initializing first string
            String b = "Triangle"; // initializing second string
            System.out.println("The statement "+ a + " is anagram of "+b+" is "+isAnagram(a,b));// Print true
            
            String c = "silent"; // initializing first string
            String d = "listen"; // initializing second string
            System.out.println("The statement "+ c + " is anagram of "+d+" is "+isAnagram(c,d));// Print true
            
            String e = "fried"; // initializing first string
            String f = "fired"; // initializing second string
            System.out.println("The statement "+ e + " is anagram of "+f+" is "+isAnagram(e,f));// true            
            String g = "ball"; // initializing first string
            String h = "call"; // initializing second string
            System.out.println("The statement "+ g + " is anagram of "+h+"is "+isAnagram(g,h));// Print false                       
        }		    
}
