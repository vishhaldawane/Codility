package lesson06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class NumberOfDiscIntersections {
	public int solution(int[] A)
	{
		//unordered list of circles below
		List<Circle> circlesList = new ArrayList<Circle>();
		for (int i = 0; i < A.length; i++) {
			long leftEdge = i-A[i];
			long rightEdge = i+A[i];
			Circle circle = new Circle(leftEdge, rightEdge);
			circlesList.add(circle);	
		}
		//all the circles are added in the list, now sort them
		//using the Circles comparator
		CirclesComparator circCmp = new CirclesComparator();
		Collections.sort(circlesList,circCmp);//sort the list based on cmp
		//above list is sorted based on the comparison defined in it
		
		//now create an ORDERED array of Circles 
		Circle orderedCircles [] = new Circle[A.length];
		int index=0;
		for (Circle circle : circlesList) {
			orderedCircles[index++] = circle;//push all circles in an array
		}
		
		int countIntersections=0;
		
		//now simpley iterate through the above array to compare edges
		for (int i = 0; i < orderedCircles.length-1; i++) 
		{
			for (int j = i+1; j < orderedCircles.length; j++) 
			{
				if(orderedCircles[i].rightEdge >= orderedCircles[j].leftEdge)
				{
					countIntersections++;
					if(countIntersections > 100000)
						return -1;
				}
				else 
					break;
			}
		}
		return countIntersections;
	}
} // L<----------C---------->R
	//           0
public class NumberOfDiscIntersectionsTest {
	public static void main(String[] args) {
		//            0 1 2 3 4 5 <-- are they center?
		int array[]= {1,5,2,1,4,0}; //<-- are they radiuses
		NumberOfDiscIntersections numOfDiscInter= new NumberOfDiscIntersections();
		int numOfInt = numOfDiscInter.solution(array);
		System.out.println("Number of intersections : "+numOfInt);
	}
}

class Circle
{
	long leftEdge;
	long rightEdge;
	
	public Circle(long leftMostXPoint, long rightMostXPoint) {
		super();
		this.leftEdge = leftMostXPoint;
		this.rightEdge = rightMostXPoint;
	}
}
class CirclesComparator implements Comparator<Circle>
{
	public int compare(Circle o1, Circle o2) {
		//check the left edges of o1 and o2
		if(o1.leftEdge < o2.leftEdge )
			return -1;
		
		//check the right edges of o1 and o2
		if(o2.leftEdge < o1.leftEdge )
			return 1;
		
		//check the right edges of o1 and o2
		if(o1.rightEdge < o2.rightEdge )
			return -1;
				
		//check the right edges of o1 and o2
		if(o2.rightEdge < o1.rightEdge )
			return 1;
		
		return 0; //if both are same
	}
	
}

