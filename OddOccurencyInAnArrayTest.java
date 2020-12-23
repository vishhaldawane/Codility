package lti.codility.lesson02.arrays;

import java.util.HashMap;
import java.util.Set;

public class OddOccurencyInAnArrayTest {

	public static void main(String[] args) {
		
		int array1[]= {9,3,9,3,9,7,9};
		
		OddOccurencyInAnArray oddOccSoln = new OddOccurencyInAnArray();
		int oddMan1 = oddOccSoln.solution(array1);
		System.out.println("Odd Man : "+oddMan1);
		
		int array2[]= {1,2,1,3,5,2,3};
		int array3[]= {1,2,1,3,5,2,3,1,1,2,2};
		
	}

}

class OddOccurencyInAnArray
{
	public int solution(int A[]) {
		
		HashMap<Integer,Integer> occurencesMap = new HashMap<Integer,Integer>(); //key and value
		
		for(int i=0;i<A.length;i++) {
			if(occurencesMap.containsKey(A[i])) {
				int occurences = occurencesMap.get(A[i]);
				occurences++;
				occurencesMap.put(A[i],occurences); //store it after increment
			}
			else {
				occurencesMap.put(A[i], 1); //1st occurence 
			}
		}
		
		Set<Integer> keySet = occurencesMap.keySet(); //get the keys
		
		for (Integer currentKey : keySet) {
			int occcurences = occurencesMap.get(currentKey);
			if(occcurences %2 != 0 ) //if odd number of time, means we can 
				return currentKey;  //find the unpaired..
		}
		return 0;
	}
}