import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 771. Jewels and Stones
Easy

2891

439

Add to List

Share
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones
 you have. Each character in stones is a type of stone you have. You want to know how many of the stones you 
 have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * 
 * 
 * 
 * 
 * @author devshankhasharm
 *
 */

public class StonesJewels {
	
	public int numJewelsInStones(String jewels, String stones) {
		char[] jew = jewels.toCharArray();
		char[] ston = stones.toCharArray();
		int count = 0;
		for (int i=0; i < jew.length;i++) {
			for (int j=0; j < stones.length();j++) {
				if (jew[i] == ston[j])
					count++;
				
			}
		}
		return count;

	}
	
	public int numJewelsInStonesM(String jewels, String stones) {
		
		char[] ston = stones.toCharArray();
		for (int i=0; i < ston.length;i++) {
			//do something
		}
		
		//this can be replaced as ====
		
		for (char c:stones.toCharArray()) {
			
			//do something
		}
		
		int count = 0;
		Set<Character> set = new HashSet<>();
		for (Character c:jewels.toCharArray())
			set.add(c);
		for (Character c:stones.toCharArray()) {
			if (set.contains(c))
				count++;
			
		}
			
		
	
		
		
		return count;

	}
	
	

	

	
	

		

	
	
	
	public static void main(String[] args) {
	
		
	}

}
