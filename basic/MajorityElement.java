package programming.basic;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement {
	
	static int majorityElement(int a[], int size)
    {
        int count=0, max_count=0, temp=a[0], major=-1;
        boolean found=false;
        
        Arrays.sort(a);
        for(int i=0; i<size; i++){
            
            if(temp == a[i]){
                count++;
                
            }else{
                count =1;
                temp = a[i];
            }
            
            if(max_count < count){
                max_count = count;
                major = a[i];
                
                if( max_count > size/2){
                    found = true;
                    break;
                }
                
            }
            
        }
        
        return ( found ? major : -1 );
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
            int ans  = majorityElement( arr, n );
            System.out.println(ans);
        }
        sc.close();

	}

}
