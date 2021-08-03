import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 11. Container With Most Water
Medium

10927

759

Add to List

Share
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical 
lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, 
together with the x-axis forms a container, such that the container contains the most water.
 * 
 * 
 * 
 * 
 * 
 * @author devshankhasharm
 *
 */

public class ContainerwithmostWater {
	
	  //this is a brute inefficient solution
	
	  public int maxArea(int[] height) {
	        int max = Integer.MIN_VALUE;
	        for (int i=0; i < height.length;i++) {
	        	for (int j=i+1;j < height.length;j++) {
	        		int min = Math.min(height[i],height[j]);
	        		int area = min*(j-i);
	        		max = Math.max(area,max);
	        		
	        		
	        	}
	        }
	        return max;
	        
	    }
	  //this is efficient one, using two pointer approach
	  public int maxAreaE(int[] height) {
	        int l =0;
	        int r = height.length-1;
	        int max = Integer.MIN_VALUE;
	        while (l < r) {
	        	int min = Math.min(height[l],height[r]);
	        	int area = min*(r-l);
	        	max = Math.max(max,area );
	        	if (height[l] < height[r])
	        		l++;
	        	else
	        		r--;
	        	
	        	
	        }
	      
	        return max;
	        
	    }
	
	
	

	
	

	

	
	

		

	
	
	
	public static void main(String[] args) {
	
		
	}

}
