package lesson05;
class MinimumAverageTwoSlice {
	public int solution(int[] A) 	{
		int sum1=0, sum2=0;
		double avg1 = Double.MAX_VALUE; 	double avg2 = Double.MAX_VALUE;;
		double minAvg = Double.MAX_VALUE; 	int minAvgSliceIndex = 0;
		for(int i=0;i < A.length-2; i++ ) { //0 1 2 3 4 5 6
			sum1 = A[i] + A[i+1]; 	avg1 = (double) sum1 / 2;
			
			if(avg1 < minAvg) { minAvg = avg1; 	minAvgSliceIndex = i;	}
			
			sum2 = sum1 + A[i+2]; 	avg2 = (double) sum2 / 3;
			
			if(avg2 < minAvg) { minAvg = avg2; 	minAvgSliceIndex = i; 	}
		}
								//5		  +     6
		avg1 = (double) (A[A.length-2] + A[A.length-1]) / 2;
		if(avg1 < minAvg) { minAvg = avg1;	minAvgSliceIndex = A.length-2;}
		return minAvgSliceIndex;
	}
}
public class MinimumAverageTwoSliceTest {
	public static void main(String[] args) {
		MinimumAverageTwoSlice minAvg2Slice = new MinimumAverageTwoSlice();
		int array[] = {4,2,2,5,1,5,8 };
		int minAvgsliceIndex1=minAvg2Slice.solution(array);
		System.out.println("Min Avg Slice Index : "+minAvgsliceIndex1);
	}
}
// i-------->| 
// 0 1 2 3 4 5 6
// 4,2,2,5,1,5,8
//sum1= 4+2 = 6
