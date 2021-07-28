
//this is the code for Pascals triangle
//very good expplanation given here ==https://www.geeksforgeeks.org/pascal-triangle/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

	
	static void printMatrix(int n) {
		// An auxiliary array to store generated pascal triangle values
		
		int[][] arr = new int[n][n];
		
		for (int i=0; i < n;i++) {
			for (int j=0; j <= i;j++) {
				// First and last values (diagonal) in every row are 1
				if (j == 0 || i == j) {
					arr[i][j] = 1;
					
					System.out.print(1);
				}
				else {
					arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
				System.out.print(arr[i][j]);
				}
					
			}
			System.out.println();
		}
		
	}

	
	public static void main(String[] args) {
		printMatrix(5);
		System.out.println("-------------");
		//printPascal(1);
		
		
		
	}

}
