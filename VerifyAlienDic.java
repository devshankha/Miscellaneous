/** 953. Verifying an Alien Dictionary
Easy

1945

753

Add to List

Share
In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. 
The order of the alphabet is some permutation of lowercase letters.

**/


import java.util.ArrayList;
import java.util.List;

public class VerifyAlienDic {
	
	  public boolean isAlienSorted(String[] words, String order) {
	        int[] alphabet = new int[26];
	       
	        for (int i=0; i < order.length();i++) {
	            
	            alphabet[order.charAt(i)-'a'] =  i;
	        }
	        for (int i=0 ; i < words.length;i++) {
	            for (int j=i+1; j < words.length;j++) {
	            	int min = Math.min(words[i].length(),words[j].length());
	            	for (int k=0; k < min;k++) {
	            		char iChar  = words[i].charAt(k);
	            		char jChar  = words[j].charAt(k);
	            		if ( alphabet[iChar-'a'] < alphabet[jChar-'a']) {
	            			break;
	            		} else 
	            		if (alphabet[iChar-'a'] > alphabet[jChar-'a'])
	            			return false;
	            		if ((k == (min-1)) && (words[i].length() > words[j].length() )) {
	            			return false;
	            			
	            		}
	            		
	            	}
	            	
	            }
	        }
	        return false;
	}
	
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("wqdqwd");
		
	}

}
