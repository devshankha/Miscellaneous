//This is to find the number of islands
//the code is almost taken from 
// https://www.youtube.com/watch?v=o8S2bO3pmO4&t=15s
// this used DFS graph approach, BFS will also work
//actually it looks like we areent doing any BFS or DFS here, just recursion along the four sides
public class NumberOfIslands {
	static int dsf(int[][]a,int i, int j) {
		if (i < 0 || i >= a.length  || j < 0 || j >= a[0].length || a[i][j] != 1 ) {
			return 0;
			
			
		}
		//we set the 1 to 2 so that we do-not recount it
		a[i][j]= 2;
		dsf(a,i-1,j);
		dsf(a,i+1,j);
		dsf(a,i,j-1);
		dsf(a,i,j+1);
		return 1;
		
	}
	
	static int numberOfIslands(int arr[][]) {
		int numberOfIslands = 0;
		for (int i=0; i < arr.length;i++)
			for (int j=0; j < arr[i].length;j++) {
				if (arr[i][j] == 1) {
					numberOfIslands++;
					//numberOfIslands+=dsf(arr,i,j);
					dsf(arr,i,j);
					
				}
				
			}
		return numberOfIslands;
	}
	
	public static void main(String[] args) {
		/** int M[][] = new int[][] { { 1, 1, 0, 0, 0 },
                                   { 0, 1, 0, 0, 1 },
                                   { 1, 0, 0, 1, 1 },                                  
                                   { 1, 0, 1, 0, 1 } };
                                   
                                   */
		int M[][] = new int[][] { { 1, 1, 0, 0, 0 },
                                  { 0, 1, 1, 1, 1 },
                                  { 1, 0, 0, 1, 1 },                                  
                                  { 1, 1, 1, 0, 1 } };
	
		System.out.println(numberOfIslands(M));
		
	}

}
