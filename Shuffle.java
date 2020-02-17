import java.util.Arrays;
import java.util.Random;

public class Shuffle {
	// A Function to generate a random permutation of arr[] 
	static void randomize(int arr[], int n) {
		// Creating a object for Random class
		Random r = new Random();

		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n - 1; i > 0; i--) {

			// Pick a random index from 0 to i
			int j = r.nextInt(i);

			// Swap arr[i] with the element at random index
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		// Prints the random array
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] shuffleRecursively(int arr[], int n) {
		//System.out.println("Entering for "+n);
		if (n == 0)
			return arr;
		shuffleRecursively(arr, n-1);
		Random r = new Random();		
		int k = r.nextInt(n);
		// System.out.println("this Entering for "+n);
		int t = arr[n];
		arr[n] = arr[k];
		arr[k] = t;
		return arr;
		
	}
	
	public static void main(String[] args) {
		 Random r = new Random(); 
		// for (int i=0; i < 6;i++)
		// System.out.print(r.nextInt(3+1)+" , ");
		 int arr[] = {1,2,3,4};
		 randomize(arr, arr.length-1);
		 int arr1[] = {1,2,3,4};
		 //System.out.println();
		 int[] k=shuffleRecursively(arr1, arr1.length-1);
		 System.out.println(Arrays.toString(k));
	}

}
