package lesson07;

import java.util.Stack;

//check if the stone block is available

//add the block if its unique and unable to reuse
//from the stack

class StoneWall
{ //same as fish size and fish direction type
	public int solution(int[] H)
	{
		//make a stack, lower height and upper height
		Stack<StoneBlock> stoneBlockStack = new Stack<StoneBlock>();//0,8
		
		//add the first block, eg. First fish added earlier
		StoneBlock firstBlock = new StoneBlock(0,H[0]); // (0,8)
		stoneBlockStack.add(firstBlock);
		int minBlockRequired=1; //first block is added above
		
		//                i
		// 0      1 2 3 4 5 6 7 8
		//{8,     8,5,7,9,8,7,4,8};
		for(int i=1; i<H.length;i++) 
		{
			//pickup the block on the top of the stack
			StoneBlock topBlock = stoneBlockStack.peek(); // 0,8
			
			//find the taller block, if found remove it
							// 9        > 8  
			while( topBlock.upperHeight > H[i]) 
			{
				stoneBlockStack.pop(); //remove it
				
				//check empty stack exception below, if stack is empty remove is not possible
				if(!stoneBlockStack.isEmpty()) {
					topBlock = stoneBlockStack.peek();
				}
				else
					break;
			}//end of while
			
			if(stoneBlockStack.isEmpty()) {
				StoneBlock newStone = new StoneBlock(0, H[i]); //0,7
				stoneBlockStack.push(newStone);
				minBlockRequired++;
			}
			else if(stoneBlockStack.peek().upperHeight - H[i] == 0 ) { //of same height
					continue;
				}
				else { //add a new block
					topBlock = stoneBlockStack.peek();
					int temp = stoneBlockStack.peek().upperHeight;
					StoneBlock newStone = new StoneBlock(temp, H[i]);
					stoneBlockStack.push(newStone);
					minBlockRequired++;
				}
		}//end of for
		
		return minBlockRequired;
	}
}
//int height[]= {8,8,5,7,9,8,7,4,8};
/* minBlockRequired=2
 * 
 *0 0,8<=,  8 is added
 *1 0,8<=,  8 is added
 *2 0,5<=   //after clearing the stack  // 5 is added 
 *3 0,5, 5,7<= 							//7 is added
 *4 0,5, 5,7  7,9<= 					//9 is added
 *5 0,5, 5,7  7,8<=    // after pop 	//8 is added  
 *6 0,5, 5,7<=  // after pop			//7 is added
 *7 0,4<= 		// after clearing       //4 is added
 *8 0,4  4,8<=
 *
 *	we cant keep adding items in the stack as the height is
 *  coming, we have to tune the height of the stack 
 *  
 *									->	8
 *								->	4	4
 *							->	7	7	7
 *						->	8	8	8	8
 *					->	9	9	9	9	9
 *				->	7	7	7	7	7	7
 *			->	5   5	5	5	5	5	5
 *		->	8	8	8	8	8	8	8	8 
 *	-> 	8	8	8	8	8	8	8	8	8 <---
 *      0   0   0   0   0   0   0   0   0 <-- lowest height
 *
 *      8,  8,  5,  7,  9,  8,  7,  4,  8		
 */
class StoneBlock
{
	int lowerHeight;
	int upperHeight;
	
	public StoneBlock(int lowerHeight,int upperHeight) {
		super();
		this.lowerHeight = lowerHeight;
		this.upperHeight = upperHeight;
	}
}

public class StoneWallTest {
	public static void main(String[] args) {
		StoneWall stoneWall = new StoneWall();
		int height[]= {8,8,5,7,9,8,7,4,8};
		int minBlocksNeeded = stoneWall.solution(height);
		System.out.println("Min Blocks needed : "+minBlocksNeeded);
	}
}
