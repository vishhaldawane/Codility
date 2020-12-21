package lesson02;

import java.util.HashMap;
import java.util.Set;

//      KEY  VALUE
//map - num occurence
//       9    4	
//       3    2
//		 7    1

//0 1 2 3 4 5 6 
//9 3 7 3 9 9 9

class OddOccurencesInArray {
	public int solution(int array[]) {
		int key=-1;
//	  key    value    
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	// make a repository of all numbers and their occurences
		for(int i=0;i<array.length;i++)   {
			if(map.containsKey(array[i])) {
				int occurences = map.get(array[i]); 	
					occurences++;
					map.put(array[i], occurences);
			}
			else { 	map.put(array[i],1); }
		}
		Set<Integer> keySet = map.keySet(); // 9 3 7
		for (Integer currentKey : keySet) {//9
			int occurences = map.get(currentKey); //7->1
			if(occurences%2!=0) {	key = currentKey;	break;	}
		}
		return key;
	}
}
	
public class OddOccurencesInArrayTest {
	public static void main(String[] args) {
		
		int array1[]= {9,3,9,3,9,7,9	};
		int array2[]= {1,2,1,3,5,2,5	};
		int array3[]= {1,2,1,3,5,2,3,1,1,2,2};
		int array4[]= {100000,200000,100000,300000,500000,200000,500000	};
		
		
		OddOccurencesInArray oddOccInAry = new OddOccurencesInArray();
		int number= oddOccInAry.solution(array4);
		System.out.println("Odd number is : "+number);
		
	}
}
