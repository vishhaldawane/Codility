package lesson06;
import java.util.ArrayList;
import java.util.Collections; //its a utility class
import java.util.List;
class MaxProductOfThree {
	//-3,1,2,-2,5,6
	
	// 0  1 2 	3 4 5 
	//-3 -2 1 	2 5 6
	
	public int solution(int[] A) {
		List<Integer> tripletList = new ArrayList<Integer>(); 
		for(int i=0;i<A.length;i++) {
			tripletList.add(A[i]);//store in arraylist, which allows duplicates
		}
		Collections.sort(tripletList); //not Collection, sort this 
		//first 3 elements
int product1 = tripletList.get(0) * tripletList.get(1) * 
tripletList.get(2);
		//LAST 3 elements
int product2 = tripletList.get(tripletList.size()-3) * 
tripletList.get(tripletList.size()-2) * 
tripletList.get(tripletList.size()-1);

		//first 2 elements and last element
int product3 = tripletList.get(0) * tripletList.get(1) * 
tripletList.get(tripletList.size()-1);

		//first and last 2 elements
int product4 = tripletList.get(0) * tripletList.get(tripletList.size()-2)* 
tripletList.get(tripletList.size()-1); 

int maximum1 = Math.max(product1, product2);
		int maximum2 = Math.max(product3, product4);
		return Math.max(maximum1, maximum2);
	}
}
public class MaxProductOfThreeTest {
	public static void main(String[] args) {
		MaxProductOfThree maxProdThree= new MaxProductOfThree();
		
		int array1[]= {-3,1,2,-2,5,6};
		int maxProd1 = maxProdThree.solution(array1);
		System.out.println("Max Prod of Three : "+maxProd1);
		
		int array2[]= {10,10,10};
		int maxProd2 = maxProdThree.solution(array2);
		System.out.println("Max Prod of Three : "+maxProd2);
		
		int array3[]= {-3,1,2,0,-100};
		int maxProd3 = maxProdThree.solution(array3);
		System.out.println("Max Prod of Three : "+maxProd3);
		
		
		int array4[]= {-3,1,-100,2,-2,5,6};
		int maxProd4 = maxProdThree.solution(array4);
		System.out.println("Max Prod of Three : "+maxProd4);
		
		
	}
}
