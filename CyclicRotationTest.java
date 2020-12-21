package lesson02;

import java.util.Arrays;

class CyclicRotation
{
	//if u look at the problem, the return value is an array
	public int[] solution(int [] A, int K) 
	{
		int rotatedArray[] = new int [ A.length ]; //copy it
		
		for (int i = 0; i < A.length; i++) { //its all MATH logic
			int rotatedIndex = (i + K) % A.length;// new index
			rotatedArray [ rotatedIndex ] = A [ i ]; 
		}
		return rotatedArray;
	}
}
public class CyclicRotationTest {
	public static void main(String[] args) {
		
		CyclicRotation cycRot = new CyclicRotation();
		
		int ary1[] = { 3,8,9,7,6 };
		int ans1[] = cycRot.solution(ary1, 3);
		
		System.out.println(Arrays.toString(ary1));
		System.out.println(Arrays.toString(ans1));
		

		int ary2[] = { 1,2,3,4,5 };
		int ans2[] = cycRot.solution(ary2, 5);
		
		System.out.println(Arrays.toString(ary2));
		System.out.println(Arrays.toString(ans2));
		
		int ary3[] = { 0,0,0,0,0 };
		int ans3[] = cycRot.solution(ary3, 5);
		
		System.out.println(Arrays.toString(ary3));
		System.out.println(Arrays.toString(ans3));

		int ary4[] = { -1,-2,-3,4 };
		int ans4[] = cycRot.solution(ary4, 3); 
		
		System.out.println(Arrays.toString(ary4));
		System.out.println(Arrays.toString(ans4));
	}
}


