
/**
 * 
 * 31. Next Permutation
Medium

6410

2123

Add to List

Share
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of 
numbers.
 * 
 * 
 * 
 */
//this is a very good solution==the code is taken from 
//https://www.youtube.com/watch?v=LuLCLgMElus

import java.util.Arrays;

public class FindNextPermutation {
	static void nextPermute(int[] arr) {
		if (arr == null || arr.length <= 1)
			return;
		int i = arr.length - 2;
		while ((i >= 0) && arr[i] > arr[i + 1])
			i--;

		if (i >= 0) {
			int j = arr.length - 1;
			while (arr[j] < arr[i])
				j--;
			swap(arr, i, j);

		}
		reverse(arr,i+1,arr.length-1);

	}

	static void swap(int[] l, int x, int y) {
		int temp = l[x];
		l[x] = l[y];
		l[y] = temp;
	}

	static void reverse(int[] l,int i,int j) {
		
		while (i < j)
			swap(l, i++, j--);
	}

	public static void main(String[] args) {
		int[] k = {1,4,5,2,7};
		nextPermute(k);
		System.out.println(Arrays.toString(k));
		

	}

}
