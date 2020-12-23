package lti.codility.lesson03.timecomplexity;

import java.util.HashSet;
import java.util.Set;

public class PermutationMissingElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationMissingElement pme = new PermutationMissingElement();
		
		int ary1[]= {};
		int ans1 = pme.solution(ary1);
		System.out.println("ans1 "+ans1);
		
		
		int ary2[]= {2};
		int ans2 = pme.solution(ary2);
		System.out.println("ans2 "+ans2);
		
		int ary3[]= {1};
		int ans3 = pme.solution(ary3);
		System.out.println("ans3 "+ans3);
		
		int ary4[]= {1,3};
		int ans4 = pme.solution(ary4);
		System.out.println("ans3 "+ans4);
		
	}

}

class PermutationMissingElement
{
	public int solution(int A[])
	{
		int max = A.length + 1;
		int value=1;
		Set<Integer> incompleteSet = new HashSet<Integer>();
		for(int i=0; i<A.length;i++) {
			incompleteSet.add(A[i]);
		}
		for(int i=1;i<=max;i++) 
		{
			if(!incompleteSet.contains(i) ) 
			{
				value = i;
				break;
			}
		}
		return value;
	}
}