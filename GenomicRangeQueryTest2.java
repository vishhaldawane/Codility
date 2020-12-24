package lesson05;

import java.util.Arrays;

//now im feeling proud of u guys and  gals
// u all have crossed the road map of almost 70 days training
//its all because of your efforts and the Grace of GOD
class GenomicRangeQuery2
{                          //CCAGGGCCTGCGTAC
	public int[] solution(String dnaString, int[] P, int[] Q)
	{
		
		int A[] = new int[ dnaString.length()+1 ];
		int C[] = new int[ dnaString.length()+1 ];
		int G[] = new int[ dnaString.length()+1 ];
		int T[] = new int[ dnaString.length()+1 ];
		
		for(int i=0; i<dnaString.length();i++) {
			if(dnaString.charAt(i)=='A') {
				A[i+1]=A[i]+1;
				C[i+1]=C[i];
				G[i+1]=G[i];
				T[i+1]=T[i];
			}
			else if(dnaString.charAt(i)=='C') {
				A[i+1]=A[i];
				C[i+1]=C[i]+1;
				G[i+1]=G[i];
				T[i+1]=T[i];
			}
			else if(dnaString.charAt(i)=='G') {
				A[i+1]=A[i];
				C[i+1]=C[i];
				G[i+1]=G[i]+1;
				T[i+1]=T[i];
			}
			else if(dnaString.charAt(i)=='T') {
				A[i+1]=A[i];
				C[i+1]=C[i];
				G[i+1]=G[i];
				T[i+1]=T[i]+1;
			}
		}
		System.out.println(dnaString);
		System.out.println("A ="+Arrays.toString(A));
		System.out.println("C ="+Arrays.toString(C));
		System.out.println("G ="+Arrays.toString(G));
		System.out.println("T ="+Arrays.toString(T));
		
		int answer[] = new int [ P.length ];
		
		for(int i=0;i<P.length;i++) {
			int countA = A[Q[i]+1] - A[P[i]];
			int countC = C[Q[i]+1] - C[P[i]];
			int countG = G[Q[i]+1] - G[P[i]];
			int countT = T[Q[i]+1] - T[P[i]];
			
			if(countA > 0) 
				answer[i] = 1;
			else if (countC > 0) 
				answer[i] = 2;
			else if (countG > 0) 
				answer[i] = 3;
			else if (countT > 0) 
				answer[i] = 4;
			
		}
		return answer;
	}
}

public class GenomicRangeQueryTest2 {
	public static void main(String[] args) {
		GenomicRangeQuery2 genoRangeQry = new GenomicRangeQuery2();
		//String DNA="CCAGGGCCTGCGTAC";
		String DNA="CAGCCTA";
		
		int P[]= {2,5,0};
		int Q[]= {4,5,6};
		
		int minNecRange[]=genoRangeQry.solution(DNA, P, Q);
		System.out.println(Arrays.toString(minNecRange));
	}
}
