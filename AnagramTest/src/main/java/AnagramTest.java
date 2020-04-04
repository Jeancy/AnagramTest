
// Importing the Arrays class that will help us manipulate arrays.
import java.util.Arrays;

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
		Arrays.parallelSort(leftArray);
		Arrays.parallelSort(rightArray);
		
		if(leftArray.length != rightArray.length){
		        return false;
		}
		// Both char arrays have the same number of characters
		for(int i = 0; i < leftArray.length; i++){
		    if(leftArray[i] != rightArray[i]){
			return false;  
		    }
		}
		// We only get to this stage if all the elements pass the if test
		// which means leftArra[i] == rightArray[i] pour tout i.
		return true;
	}
				    
	public static void main(String [] args)	{
            // Test case		
            String a = "integral"; // initializing first string
            String b = "Triangle"; // initializing second string
            System.out.println(isAnagram(a,b));	// will print true	
       }		    
}

