package lti.codility.lesson01.iterations;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
	public int  solution(int N) 
	{
		String binaryString = Integer.toBinaryString(N);
		System.out.println("Binary String : "+binaryString);
		
		List<Integer> onesList = new ArrayList<Integer>();
		
		for(int i=0; i<binaryString.length();i++) {
			if(binaryString.charAt(i) =='0')
				continue;
			onesList.add(i);
		}
		int longestBinaryGap = 0; 
		for(int i=0;i<onesList.size()-1;i++) {
			int indicesDifference = onesList.get(i+1) - onesList.get(i)-1;
			longestBinaryGap = Math.max(longestBinaryGap, indicesDifference);
		} 
		
		return longestBinaryGap;
	}
	
}

