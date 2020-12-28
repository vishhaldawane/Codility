package lesson06;

public class BubbleSortTest {
	public static void main(String[] args) {
		//im on mute
		
				 //   0  1   2   3   4   5
		int array[]= {5, 2,  8,  14, 1,  16};
		for (int i = 0; i < array.length; i++) {
			System.out.println("array["+i+"] "+array[i]);
		}
		
		System.out.println("=================");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("array["+i+"] "+array[i]);
			for (int j = i+1; j < array.length; j++) {
				System.out.println("\tarray["+j+"] "+array[j]);
				
				if(array[i] > array[j]) {
					System.out.println("swapping..."+array[i]+" "+array[j]);
					int temp = array[i];
					array[i]=array[j];
					array[j] = temp;
				}
				else {
					System.out.println("NOT swapping..."+array[i]+" "+array[j]);
				}
			}
			System.out.println("---------");
		}
		//select distict job from emp
		
		//select job from emp order by job;
		
		System.out.println("=================");
		for (int i = 0; i < array.length; i++) {
			System.out.println("array["+i+"] "+array[i]);
		}
		
	}
}
