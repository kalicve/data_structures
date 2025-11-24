package com.fib01;

public class FibBottomUp {

	
	
	//in this approuch we genarete the fin sequnce from 0 to nth position as nth position needs prev values.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		long fibSeq[] = new long[n+1];
		fibSeq[0]=0;
		fibSeq[1]= 1;
		for(int i=2; i<=n; i++)
		{
			fibSeq[i] = fibSeq[i - 1] + fibSeq[ i - 2];
			System.out.println("fib seq:"+ fibSeq[i]);
		}

		
	}

}
