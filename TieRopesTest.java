package greedy;

class TieRopes
{
	public int solution(int K, int[] A)
	{
		int maximumLength = A.length;
		int countOfRopesRequired = 0;
		int currentLength=0;
		//0 1 2 3 4 5 6
		//1,2,3,4,1,1,3
		for(int i=0; i<maximumLength; i++)
		{
			int eachRopeLength = A[i];
			System.out.println("Each rope : "+eachRopeLength);
			currentLength = currentLength + eachRopeLength;
			System.out.println("\tcurrent length: "+currentLength);
			
			if(currentLength >= K) {
				System.out.println("\t\tcurrentLength is more than K..setting back to 0");
				countOfRopesRequired++;
				currentLength =0;
			}
		}
		return countOfRopesRequired;
	}
}

public class TieRopesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,2,3,4,1,1,3};
		int K=4;
		
		TieRopes tieRopes = new TieRopes();
		int maxRopes = tieRopes.solution(K,A);
		System.out.println("Max Ropes : "+maxRopes);
	}

}
