package lesson06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Triangle
{
	public int solution(int A[]) {
		List<Integer> pointsList = new ArrayList<Integer>();
		for(int i=0;i<A.length;i++)
			pointsList.add(A[i]); //push it to arraylist
		Collections.sort(pointsList); // sort it, since it only takes Object types 
		//after sort hold these values into an array of long integers [−2,147,483,648..2,147,483,647].
		long orderedIntegers [] =new long[ A.length ]; //its primitive
		int indexValue=0;
		for(Integer value : pointsList) 
			orderedIntegers[ indexValue++ ] = value;
		for (int j = 0; j < orderedIntegers.length; j++) {
			System.out.println("ov "+orderedIntegers[j]);	
		}
			//  i=     5                -1 ie 5        
		for(int i=orderedIntegers.length-1; i>=2; i--) {
			if(orderedIntegers[i-1]+orderedIntegers[i-2] > orderedIntegers[i]) {
				return 1;
			}
		}
		return 0;
	}
}

public class TriangleTest {
	public static void main(String[] args) {
		int array[]= {10,2,5,1,8,20};
		Triangle tri = new Triangle();
		int ans = tri.solution(array);
		System.out.println("ans "+ans);
	}
}
