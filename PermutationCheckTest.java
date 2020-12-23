package lti.codility.lesson04.countingelements;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PermutationCheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PermutationCheck permCheck = new PermutationCheck();
		int array[]= {4,1,3,2};
		int notFound = permCheck.solution(array);
		System.out.println("not found int : "+notFound);
		
	}

}

class PermutationCheck
{
	public int solution(int A[])
	{
		Set<Integer> testedSet = new TreeSet<Integer>();
		Set<Integer> perfectSet = new TreeSet<Integer>();
		
		for(int i=0; i<A.length; i++)
		{
			testedSet.add(A[i]); //sort it
			perfectSet.add(i+1); //set to find missing int 
		}
		for(int current : perfectSet) 
		{
			if(!testedSet.contains(current)) {
				return 0;
			}
		}
		
		return 1;
	}
}