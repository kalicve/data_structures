package com.fib01;

import java.util.HashMap;

//recursive
public class FibRecMemory01 {
	
 
	public static Long fibmemory(int fibPos, HashMap<Integer, Long> fibStore)
	{
		System.out.println("fibPos:"+fibPos+" "+fibStore.toString());
		Long val = (long) 1;
		if( fibPos <= 1)
		{
			System.out.println("\tfibPos:"+fibPos);
			return (long) fibPos;
		}
		else if(fibStore.containsKey(fibPos)) {
			System.out.println("\tfibPos in map:"+fibPos+ "val:"+fibStore.get(fibPos));
			return fibStore.get(fibPos);
		}
		else
		 {
			System.out.println("\tfibPos in map:"+fibPos+ "val:"+fibStore.get(fibPos));
			val = fibmemory(fibPos - 1, fibStore)+ fibmemory(fibPos - 2, fibStore);
		 }
		fibStore.put(fibPos, val);
		return val;
	}
	
	public  static long fib(int nthFibpos) {
		
		System.out.println("nthFibpos:"+nthFibpos);
		if(nthFibpos == 0 || nthFibpos == 1)
		{
			System.out.println("\t"+ 1);
			return nthFibpos;
		}
		
		HashMap<Integer, Long> fibStore = new HashMap<>();
		
		long nthFibVal = fibmemory(nthFibpos - 1, fibStore) + fibmemory(nthFibpos - 2, fibStore);
		System.out.println("Values nthFibVal:\t"+ nthFibVal);
		return nthFibVal;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Fib value:"+ fib(100));

	}
	
	
	
	
	

}
