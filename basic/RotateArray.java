package programming.basic;

import java.util.*;

public class RotateArray {
	
    static void reverse(int a[], int low, int high){
        while(low < high){
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;high--;
        }
    }
    static void rotate(int a[],int n,int d){
        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);	
    }

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test>0)
        {
            int N = in.nextInt();
            int D = in.nextInt();
            int a[]= new int[N];
            for(int i=0; i<N; i++)
            {
               a[i] = in.nextInt();
            }
            
            rotate(a,N,D);
            for(int i = 0;i<N;i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
            test--;
        }
		in.close();
	}

}
