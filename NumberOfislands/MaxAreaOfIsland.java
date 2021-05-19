//This is a variation of the number of islands issue
//code inspired from here == https://www.youtube.com/watch?v=W8VuDt0eb5c&t=278s
public class MaxAreaOfIsland {
	static int dsf(int[][]a,int i, int j) {
		if (i < 0 || i >= a.length  || j < 0 || j >= a[0].length || a[i][j] != 1 ) {
			return 0;
			
			
		}
		a[i][j] = 2;
	
		return 1+dsf(a,i-1,j)+dsf(a,i+1,j)+dsf(a,i,j-1)+dsf(a,i,j+1);
		
	}
	
	static int numberOfIslands(int arr[][]) {
		int numberOfIslands = 0;
		int maxArea = 0;
		for (int i=0; i < arr.length;i++)
			for (int j=0; j < arr[i].length;j++) {
				if (arr[i][j] == 1) {
					numberOfIslands++;
					//numberOfIslands+=dsf(arr,i,j);
					int max =dsf(arr,i,j);
					maxArea = Math.max(maxArea,max);
					
				}
				
			}
		return maxArea;
	}
	public static void main(String[] args) {
		int M[][] = new int[][] { { 1, 1, 0, 0, 0 },
                                  { 0, 1, 1, 1, 1 },
                                  { 1, 0, 0, 1, 1 },                                  
                                  { 1, 1, 1, 0, 1 } }; 

        System.out.println(numberOfIslands(M));

		
	}

}
