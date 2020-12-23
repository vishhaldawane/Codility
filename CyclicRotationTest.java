package lti.codility.lesson02.arrays;
/* C++ code

class Account
{
	Account *ptr; //self referential pointer
	
	Account() {
	  ptr = new Account();
	}
}

Account a ;


*/

class Account
{
	String name;
	Account(String s) {
		name = s;
	}
	void changeName(String newName) {
		name = newName;
	}
	void showName() {
		System.out.println("name is "+name);
	}
}

public class CyclicRotationTest {

	public static void main(String[] args) {
		Account a = new Account("Gagan");
		a.showName();
		a.changeName("Gagan Deep Singh");
		a.showName();
		
		// TODO Auto-generated method stub
		CyclicRotation cyclicRot = new CyclicRotation();
		/*		
		System.out.println("-------1");
		int array1[] = {3,8,9,7,6}; // if K=3 then 9 7 6 3 8
		printArray(array1);
		printArray(cyclicRot.solution(array1,3));
		
		System.out.println("-------2");
		
		int array2[] = {0,0,0}; 
		printArray(array2);
		printArray(cyclicRot.solution(array2,3));
		
		System.out.println("-------3");
		
		int array3[] = {1,2,3,4};
		printArray(array3);
		printArray(cyclicRot.solution(array3,4));
		
		System.out.println("-------4");
		
		int array4[] = {1,2,3,4};
		printArray(array4);
		printArray(cyclicRot.solution(array3,5));

		System.out.println("-------5");
		
		int array5[] = {-1,2,-3,4};
		printArray(array5);
		printArray(cyclicRot.solution(array5,10));
		
		System.out.println("-------6");
		
		int array6[] = {-1,2,-3,4};
		printArray(array6);
		printArray(cyclicRot.solution(array6,99));
		
		System.out.println("-------7");
		
		int array7[] = {-1,2,-3,4};
		printArray(array7);
		printArray(cyclicRot.solution(array7,100));
		*/
		
		/*System.out.println("-------8");
		
		int array8[] = {1,2,3,4,5,6,7,8,9,10};
		printArray(array8);
		printArray(cyclicRot.solution(array8,5)); */
		
		
		int ary[]= {10,20,30};
		
		
		
		String str="lti"; //immutable string 
		System.out.println("main: str "+str+" str "+str.hashCode());
		printString(str);
		
		System.out.println("main: str "+str+" str "+str.hashCode());
		
/*		System.out.println("Now in main()");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(" "+ary[i]);
		}
		
		
		printArray(ary); // we are not passing 10,20,30
						// here the value of ary is 12480	
					 // being passed
		
		System.out.println("Back to main()");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(" "+ary[i]);
		}*/
	}
	
	public static void printString(String str) {
		System.out.println("printString: str "+str+" str "+str.hashCode());
		str="LTI";
		System.out.println("printString: str "+str+" str "+str.hashCode());
	}

	public static void printArray(int a[]) {
		System.out.println("\ninside printArray()\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
			a[i]=i+100;
		}
		System.out.println("\n");	
	}
	
}



class CyclicRotation
{
	public int[] solution(int[] A, int K)
	{
		//first decide the end result storage
		int rotatedArray[] = new int [A.length];
		
		for(int i=0;i<A.length;i++) {
			int rotatedIndex = ( i + K ) % A.length;
			rotatedArray[rotatedIndex] = A[i];
		}
		return rotatedArray;
	}
}