package lesson05;
class PassingCar { //observe the following logic, analyze it, study it
	public int solution(int A[]) {
		int carPassed =0;
		int zerosCount = 0;
		//0,1,0,1,1
		for(int i=0;i<A.length;i++) {
			if(A[i]==0) { //find travelling to east
				zerosCount = zerosCount + 1;
			}
			else if ( A[i] == 1) { //travelling to west
				carPassed = carPassed + zerosCount;
				if(carPassed > 1000000000) {
					return -1;
				}
			}
		}
		return carPassed;
	}
}

public class PassingCarTest {
	public static void main(String[] args) {
		PassingCar passCar = new PassingCar();
		int array[]= {0,1,0,1,1};
		int cars1 = passCar.solution(array);
		System.out.println("Cars Passed : "+cars1);
	}
}
