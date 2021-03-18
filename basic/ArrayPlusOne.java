package programming.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPlusOne {
	
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        ArrayList<Integer> result = new ArrayList<Integer>();
    
        return result;
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>(N);
            
            for (int i = 0; i < N; i++) {
				arr.add(sc.nextInt());
			}	
            
            arr = increment(arr, N);
            for (int i = 0; i < N; i++) 
				System.out.print( arr.get(i) + " " );
			System.out.println();
			
        }
        sc.close();

	}

}

