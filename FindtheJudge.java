//This is the famous find town judge problem
//Here is the question --https://leetcode.com/problems/find-the-town-judge/  leetcode 997
//A very clever implementation is given here --
//https://massivealgorithms.blogspot.com/2019/03/leetcode-997-find-town-judge.html
//
/*
 * Consider trust as a graph, all pairs are directed edge.
The point with in-degree - out-degree = N - 1 become the judge.
Explanation:
Count the degree, and check at the end.
Time Complexity:
Time O(T + N), space O(N)
Since town judge trusts nobody, can we say thatthe point who has no out-degree and in-degree == N - 1 is
 the judge?
 * 
 * 
 */



import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindtheJudge {
	

	public static int findJudge(int N, int[][] trust) {
        int[] count = new int[N+1];
        for (int[] t: trust) {
            count[t[0]]--;
            count[t[1]]++;
        }
        for (int i = 1; i <= N; ++i) {
            if (count[i] == N - 1) return i;
        }
        return -1;
    }
	public static void main(String[] args) {
		int N=4;
		int [][]trust={{1,3},{2,3},{3,2}};
		System.out.println(findJudge(3, trust));
	
	
		
		
		
	}

}
