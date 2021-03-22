package programming.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayPlusOne {
	
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
    	
        int carry=0;
        for(int i=N-1; i>= 0; i--){
            if( (arr.get(i)+1) % 10 == 0 ) {
            	carry =1;
            	arr.set(i, 0);
            }else {
            	if(carry == 1) {
            		arr.set(i, arr.get(i)+carry);
            		carry =0;
            	}else {
            		arr.set(i, arr.get(i)+1);
            	}
            	break;
            }
        }
        
        LinkedList<Integer> likedList = new LinkedList<Integer>(arr);
        if( carry == 1 )
        	likedList.addFirst(1);
            
        return new ArrayList<Integer>(likedList);
    }
    
    static ArrayList<Integer> incrementMethodString(ArrayList<Integer> arr , int N) {
    	
    	StringBuilder number = new StringBuilder();
    	for (Iterator iterator = arr.iterator(); iterator.hasNext();) {
			 number.append(iterator.next());
		}
    	long no = Long.parseLong(number.toString());
    	long plusOne = no + 1;
    	
    	
    	
    	char[] chararr = String.valueOf(plusOne).toCharArray();
    	ArrayList<Integer> finalList = new ArrayList<Integer>();
    	for (int i = 0; i < chararr.length; i++) {
			finalList.add( Character.getNumericValue(chararr[i]) );
		}
    	return finalList;
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
            
//            arr = increment(arr, N);
//            for (int i = 0; i < arr.size(); i++) 
//				System.out.print( arr.get(i) + " " );
//			System.out.println();
			
			arr = incrementMethodString(arr, N);
           for (int i = 0; i < arr.size(); i++) 
				System.out.print( arr.get(i) + " " );
			System.out.println();
			
        }
        sc.close();

	}

}

