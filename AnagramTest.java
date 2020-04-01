public class AnagramTest {
	
	private static boolean isAnagram(String str1 , String str2){
		// Using the StringBuffer Class that can be manipulated and changed accordingly.
		StringBuilder leftString = new StringBuilder( str1.trim().toLowerCase());
		StringBuilder rightString = new StringBuilder( str2.trim().toLowerCase());
		
		if(leftString.length() != rightString.length()){
		        return false;
		}
		int l = leftString.length();
		int k = rightString.length();
		for(int i = 0; i < l < i++){
			for(int j = o; j < k ; j{
				if(leftString.charAt(i) == rightString.charAt(j)){
					leftString.deleteCharAt(i);
					rightString.deleteCharAt(j);
					//Leaving the inner loop to avoid deleting twice
					break; 
				}
			}
		}
		//Testing if both strings have zero character
		if(leftString.length() == 0) && (rightString.length()==0){
			return true;
		}else {
			return false;
		}
	}
				    
	public static void main(String [] args)	{
	String a = "integral";
        String b = "Triangle";
        System.out.println(isAnagram(a,b));		
	
	}		    
}
