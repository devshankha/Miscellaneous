//This is the leetcode problem
//this code is taken from == https://www.youtube.com/watch?v=0y7pU6PPrc4

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DNASequences {
	
	static List<String> repeatedSequences(String str) {
		List<String> rep = new ArrayList<String>();
		int i = 0;
		Map<String,Integer> map = new HashMap<String,Integer>();
		while ((i+10) < str.length()) {
			String subsequence = str.substring(i,i+10);
			map.put(subsequence, map.getOrDefault(subsequence, 0)+1);
			if (map.get(subsequence) == 2) {
				rep.add(subsequence);
			}
			i++;
			
		}
		return rep;
	}
	
	public static void main(String[] args) {
		String ls ="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		List<String> a=repeatedSequences(ls);
		System.out.println(a);
		
	}

}
