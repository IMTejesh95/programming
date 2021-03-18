package programming.basic;

import java.util.Scanner;

class TrailingZerosInFactorial
{
    static int trailingZeroes(int N){
        int zeros=0;
        for(int i=5; N/i>0; i*=5){
            zeros += N/i;
        }
        return zeros;
    }
	
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
			
            int ans  = trailingZeroes(N);
            System.out.println(ans);
        }
        sc.close();
    }
}
