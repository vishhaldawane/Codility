package dynamic.programming;
/*
 * shortest path algorithm

	int fibo(int n)
	{
		 if (n<=1)
			return n;
		return fibo(n-2) + fibo(n-1)
	}
			fibo(5)
			|
		--------------------------------
		|			|
		fibo(3)	    +	      fibo(4)
		|			  |
	----------------		----------------------------
	|		|		|		|
    fibo(1)!   +      fibo(2)@		fibo(2)@  +	fibo(3)
			|		  |		   |
		------------------	------------	 --------
		|		|	|	|	 |	 |
	   fibo(0)# 	+    fibo(1) fibo(0)# + fibo(1)! fibo(1)!+fibo(2)@
								|
							-----------
							|         |
						     fibo(0)   fibo(1)!
15 calls are given to the function

 * 
 * 
 */
class Fibonacci
{
	static int memoizationCount;
	static int iteravtiveCount;
	
	public static int Memoization(int n) { //10
		System.out.println((++memoizationCount)+" recursive call to Memoization "+n);
		if(n<=1) 
			return n;
		
		return Memoization(n-2) + Memoization(n-1);
	}
	
	public static int Iterative(int n) { //10
		System.out.println("Call to Iterative "+n);
		if(n<=1) 
			return n;
		
		int F[] = new int[n+1];
		
		F[0] = 0; F[1]=1 ;
		
		int i=2;
		for(;i<=n;i++)
		{
			F[i] = F[i-2] + F[i-1];
			System.out.println((++iteravtiveCount)+" Loop is running "+i+" "+F[i]);
		}
		return F[n];
	}
	
}
public class FibonacciTest {
	public static void main(String[] args) {
		int elementAt = Integer.parseInt(args[0]);
		int num1 = Fibonacci.Memoization(elementAt);
		System.out.println("num1 : "+num1);
		int num2 = Fibonacci.Iterative(elementAt);
		System.out.println("num2 : "+num2);
		
	}
}
