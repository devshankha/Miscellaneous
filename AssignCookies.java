/**
 * This is my own implementation of assign cookies problem, appears to work fine
 * here is the problem == https://leetcode.com/problems/assign-cookies/
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssignCookies {
	
	static int process(int[] g,int[] c) {
		Arrays.sort(g);
		Arrays.sort(c);
		
		int cont=0;
		int l = g.length;		
		List<Integer> list=new ArrayList<>(c.length);
		for (int i : c)
		{
		    list.add(i);
		}
		
		for (int i=0; i < l;i++) {
			int j=0;
			
			boolean found = false;
			while (j < list.size()) {
				if (g[i] <= (Integer)list.get(j)) {
					cont++;
					list.remove(j);
					found = true;
					break;
				} else
				j++;
			}
			//This is an optimization, if we didnt find a cookie for g[i],
			//we will definitely not find for i+1, as the array g is sorted in increasing order.
			//so no need to process the loop further, just break out reporting the current value of cont
			if (!found) {
				System.out.println("IF ENTERS HERE !!!!");
				break;
			} 
		}
		return cont;
	}
	
	public static void main(String[] args) {
		
	
		int[] g= {3,5,7};
		int[] s= {1,2};
		System.out.println(process(g,s));
		
		
		
	}

}
