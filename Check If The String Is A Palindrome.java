import java.util.* ;
import java.io.*; 
public class Solution {

	public static boolean checkPalindrome(String str) {
		StringBuilder stb = new StringBuilder();

		for(int i=0;i<str.length();i++){
			
			char ch = str.charAt(i);
			if(ch >= 'a' && ch<= 'z' || ch >= 'A' && ch<= 'Z' ||
			 ch >= '0' && ch <=
			'9'){
				stb.append(Character.toLowerCase(ch));
			}
		}
	    // WRITE YOUR CODE HERE
		int start=0,end=stb.length()-1;
		
		while(start <end){
			char ch1 = stb.charAt(start);
			char ch2 = stb.charAt(end);
			
			if(ch1 != ch2){
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	 
	}
}
