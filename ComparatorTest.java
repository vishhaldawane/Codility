package lesson06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Rectangle //implements Comparable<Rectangle>
{
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	//this function would be used by TreeSet
	//to order the Rectangles...
	/*@Override
	public int compareTo(Rectangle o) {
		// TODO Auto-generated method stub
		return 0;
	}*/
}
class RectangleLengthComparator implements Comparator<Rectangle>
{
	public int compare(Rectangle o1, Rectangle o2) {
		System.out.println("Comparing o1's "+o1.length +" with o2's "+o2.length);
		return Integer.compare(o1.length, o2.length); // -1 0 or 1
	}
	
}

class RectangleBreadthComparator implements Comparator<Rectangle>
{
	public int compare(Rectangle o1, Rectangle o2) {
		System.out.println("Comparing o1's breadth with o2's breadth...");
		return Integer.compare(o1.breadth, o2.breadth); // -1 0 or 1
	}
	
}

public class ComparatorTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 5);
		Rectangle r2 = new Rectangle(15, 7);
		Rectangle r3 = new Rectangle(9, 13); 
		
		System.out.println("r1 "+r1);
		System.out.println("r2 "+r2);
		System.out.println("r3 "+r3);
		
		List<Rectangle> rectList = new ArrayList<Rectangle>();
		rectList.add(r1);
		rectList.add(r2);
		rectList.add(r3);
		
		for (Rectangle rect : rectList) {
			System.out.println("Rectangle : "+rect);
		}
		RectangleLengthComparator rectLenCmp = new RectangleLengthComparator();
		//RectangleBreadthComparator rectBreCmp = new RectangleBreadthComparator();
		
		Collections.sort(rectList,rectLenCmp);
		//Collections.sort(rectList,rectBreCmp);
		
		System.out.println("after sort...");
		
		for (Rectangle rect : rectList) {
			System.out.println("Rectangle : "+rect);
		}
	}
}
