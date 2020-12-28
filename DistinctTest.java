package lesson06;

import java.util.HashSet;
import java.util.Set;

class Distinct
{
	 public int solution(int[] A)
	 {
		 if(A.length == 0) 
			 return 0;
	//equals() and hashCode() are predefined in Object class
		 Set<Integer> numberSet = new HashSet<Integer>();
		 for(int i=0;i< A.length;i++) {
//add method will skip duplicate if the value is already there
			 numberSet.add(A[i]);//its a predefined predicate
		 }
		 return numberSet.size(); //hence the unique size
	 }
}
public class DistinctTest {
	public static void main(String[] args) {
		int array[] = {2,1,1,2,3,1};
		Distinct dist = new Distinct();
		int distinctValuesCount = dist.solution(array);
		System.out.println("Distinct Values Count : "+distinctValuesCount);
	}
}
