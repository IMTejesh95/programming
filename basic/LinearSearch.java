package programming.basic;

import java.util.Scanner;

public class LinearSearch {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Array Size: ");
		int N = sc.nextInt();
		
		System.out.println("Array elements: ");
		int[] nums = new int[N];
		for(int i=0; i<N; i++) 
			nums[i] = sc.nextInt();
		
		System.out.println("To find: ");
		int tofind = sc.nextInt();
		
		
		System.out.println("Element found at index: " + linearSearch(nums, tofind));

	}
	
	static int linearSearch(int[] nums, int tofind) {
		int foundAt = -1;
		for(int i=0; i<nums.length; i++) 
			if( nums[i] == tofind )
				foundAt = i;
		return foundAt;
	}

}
