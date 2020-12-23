package lti.codility.lesson04.countingelements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = {1,3,1,4,2,3,5,4};
		int x1 = 5;
		FrogRiverOne frogRivOne = new FrogRiverOne();
		int ans1 = frogRivOne.solution(x1, array1);
		System.out.println("ans1 "+ans1);
	}
}
class FrogRiverOne {
	public int solution(int X, int A[])	{
		Set<Integer> requiredLeavesSet = new HashSet<Integer>();
		for(int i=1; i<=X; i++) {
			requiredLeavesSet.add(i);
		} //1		2		3		4		5
	
		Set<Integer> currentLeavesSet = new HashSet<Integer>();
		
		for(int p=0; p<A.length; p++) {
			currentLeavesSet.add(A[p]);
			if(currentLeavesSet.size() < requiredLeavesSet.size())
				continue;
			
			if(currentLeavesSet.containsAll(requiredLeavesSet)) {
				return p;
			}
		}
		return -1;
	}
}