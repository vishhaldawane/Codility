package lti.codility.lesson03.timecomplexity;

public class FrogJumpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrogJump jump = new FrogJump();
		int jumpsReq1 = jump.solution(10, 85, 30);
		System.out.println("jumps "+jumpsReq1);
		
		int jumpsReq2 = jump.solution(1, 14, 3);
		System.out.println("jumps "+jumpsReq2);
		
		int jumpsReq3 = jump.solution(100, 1001, 100);
		System.out.println("jumps "+jumpsReq3);
		
		int jumpsReq4 = jump.solution(14, 14, 3);
		System.out.println("jumps "+jumpsReq4);
		
	}

}

class FrogJump
{
	public int solution(int X, int Y, int D) {
		int distanceToJump = Y - X;
		int jumpsRequired =  distanceToJump / D;
		
		if(distanceToJump % D != 0 ) {
			jumpsRequired++;
		}
		return jumpsRequired;
	}
}
