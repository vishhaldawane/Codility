package lesson07;

import java.util.Stack;

class VoraciousFish  // U D U U U
//					    < 			> < < <
{		//				4,			3,2,1,5 <-A
		//				0,			1,0,0,0 <-B
		//              0 			1 2 3 4 <--i	
	public int solution(int[] A, int[] B)
	{
		//add item on the stack or remove item from the stack
		//under certain condition
		
		Stack<Fish> fishStack = new Stack<Fish>();
		
		Fish theFish = new Fish(A[0],B[0]); 
		System.out.println("adding first fish..");
		fishStack.push(theFish); //first one  4,0
		
		for(int i=1;i<A.length;i++) //second onwards..
		{
			if( fishStack.peek().fishDirection == B[i] ) // 0 == 1
			{
				System.out.println("adding fish..of downstream");
				Fish fish = new Fish(A[i],B[i]);
				fishStack.push(fish);
			}
			else if( fishStack.peek().fishDirection == 0 ) //0 == 0 check for upstream
			{
				System.out.println("adding fish..of upstream");
				Fish fish = new Fish(A[i],B[i]);
				fishStack.push(fish); //
			}
			else 
			{
				while(!fishStack.isEmpty()) {
					if(fishStack.peek().fishDirection == B[i]) { //same direction as of the first fish
						Fish fish = new Fish(A[i],B[i]);
						fishStack.push(fish); //
						break;
					}
					else  {
						
						if(fishStack.peek().fishSize > A[i]) {
							System.out.println("eating..."+A[i]+" "+B[i]);
							break;
						}
						else {
							fishStack.pop();
							continue;
						}
						
					} // end of else
				} //end of while
				
				if(fishStack.isEmpty()) {
					Fish fish = new Fish(A[i],B[i]);
					fishStack.push(fish);
				}
			}
		}
		
		//for (int i = 0; i < fishStack.size(); i++) {
		/*System.out.println("the fish : "+fishStack.pop());
		System.out.println("the fish : "+fishStack.pop());
		System.out.println("the fish : "+fishStack.pop());
		System.out.println("the fish : "+fishStack.pop());
		System.out.println("the fish : "+fishStack.pop());*/
		//System.out.println("the fish : "+fishStack.pop());
	//	System.out.println("the fish : "+fishStack.pop());
		//}
		
		return fishStack.size();
	}
}
class Fish
{
	@Override
	public String toString() {
		return "Fish [fishSize=" + fishSize + ", fishDirection=" + fishDirection + "]";
	}

	int fishSize;
	int fishDirection;
	//fishType
	//waterType
	//waterTemp
	//geoLocation
	
	public Fish(int fishSize, int fishDirection) {
		super();
		this.fishSize = fishSize;
		this.fishDirection = fishDirection;
	}
	
}

public class VoraciousFishTest  {
	public static void main(String[] args) {
		VoraciousFish voraFish = new VoraciousFish();
		int      fish[]= {4,3,2,1,5};
		int direction[]= {0,1,0,0,0};
		
		int fishRemaining=voraFish.solution(fish, direction);
		System.out.println("Fish Remaining : "+fishRemaining);
	}
}

