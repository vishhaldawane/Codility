package lesson01;

import java.util.ArrayList;
import java.util.List;

//any fool can write a complex code which machine wont deny to run
//but no one can understand the code
//OR

//a   wise person will write a simple code which everyone can 
//understand

public class BinaryGap {
	static int solution(int N) {
		
	
		   String binaryString = Integer.toBinaryString(N);
		   //System.out.println(binaryString + " its length is : "+binaryString.length());
			List<Integer> listOfOnes = new ArrayList<Integer>();
			int longestBinaryGap = 0;	

			for(int i=0;i<binaryString.length();i++) //till 30
			{
				char ch = binaryString.charAt(i); //pickup each bit

				if(ch=='0') //if zero skip it
					continue;
						
				listOfOnes.add(i); //hold all 1s positions
			} 
			
			/*
			S binaryString	  00001010000100100000010000010000 - length ? 32
				      			  | |    |  |      |     |
			AL listOfOnes index-> 0 1    2  3      4     5	
			  	|		 values-> 4 6    11 14     21    27
			  	size			  
			  	|
			  	6	
			*/
			//  D   D    D	 D 	
			// i=0 i=1  i=2  i=3  [exit when i=4 ]
			for(int i=0; i< listOfOnes.size() - 1; i++)
				//longestBinaryGap=7
										//		A				      B		C	
			{							//		26					  22  - 1
				int indicesDiff = listOfOnes.get(i+1) - listOfOnes.get(i) - 1; 
				longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
			}			//							7				3				

		   System.out.println("Longest binary gap length is : "+longestBinaryGap);	
		   System.out.println("-----------------------------");

		   return longestBinaryGap; //we can print here also but not a good choice
					//since we have to return the answer to codility
		  }
}
