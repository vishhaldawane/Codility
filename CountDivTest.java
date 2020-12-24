package lesson05;

class CountDiv
{                  //5      11      2
	int solution(int A, int B, int K) {
		// A = 5, B = 11 and K = 2, ... return 3,
		return B/K - (A/K) + ( A%K == 0 ? 1 : 0 );
		//    11/2 -  5/2  + (5%2 == 0 ? 1 : 0 );
        //	  5    -  2    + ( 1  == 0 ? 1 : 0 );
		//    5    -  2    + (           0     );
		//         3    + (           0     );
		//                3    
	}
}
// 5 X 5 = 5 + 5 + 5 + 5 + 5
// 50 / 5 =  50-5  45-5  40-5  35-5  30-5 25-5
// 20-5 15-5 10-5 5-5 
public class CountDivTest {
	public static void main(String[] args) {
		CountDiv cntDiv = new CountDiv();
		int cnt1= cntDiv.solution(5, 11, 2);
		int cnt2= cntDiv.solution(6, 11, 2);
		int cnt3= cntDiv.solution(0, 11, 5);
		int cnt4= cntDiv.solution(0, 11, 12);
		int cnt5= cntDiv.solution(1, 11, 12);
		int cnt6= cntDiv.solution(0, 0, 12);
		int cnt7= cntDiv.solution(0, 2000000000,2000000000);
		int cnt8= cntDiv.solution(2000000000, 2000000000,2000000000);
		
		System.out.println("Cnt1 : "+cnt1);
		System.out.println("Cnt2 : "+cnt2);
		System.out.println("Cnt3 : "+cnt3);
		System.out.println("Cnt4 : "+cnt4);
		System.out.println("Cnt5 : "+cnt5);
		System.out.println("Cnt6 : "+cnt6);
		System.out.println("Cnt7 : "+cnt7);
		System.out.println("Cnt8 : "+cnt8);
	}
}
