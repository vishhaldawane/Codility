package lesson07;

import java.util.Stack;

class Bracket {
	 public int solution(String S) //{ [ (  )  ( ) ] }
	 {							   // {[(( <-- opening brackets		
		 //if the S has odd number of characters
		 //then its not proper nesting
		 if(S.length()%2!=0) 
			 return 0;
		 
		 //make a stack to hold each character of S
		 Stack<Character> charactersStack = new Stack<Character>();
		 for(int index=0;index<S.length();index++) 
		 {
			 char theCharacter = S.charAt(index); //retrieve each symbol
			 
			 //compare opening bracket types e.g { [ ( etc and push 
			 if(theCharacter=='{' || theCharacter=='[' || theCharacter=='(') 
			 {
				 charactersStack.push(theCharacter); //we are pushing opening brackets in the stack
			//	 System.out.println("\t\tOpening char : "+theCharacter);
			 }
			// System.out.println("each char : "+theCharacter);
			 //will check the empty stack exception
			 else
			 {
				 if(charactersStack.size()==0) {
					 return 0;
				 }
				 char extractedCharacter = charactersStack.pop();
				 	//		now we dont know which character is extracted
				 	//	plus we dont know what is the current character
				 	//on the stack
				 	//but we have to compare the matched closing
				 if(isClosingBracketMatched(extractedCharacter,theCharacter))
				 {
					 continue;
				 }
				 else
					 return 0;
			 }
		 }
		 //since the pop might empty the array
		 if(charactersStack.isEmpty())  return 1;
		 
		 return 0;
	 }
	 
	 //make a separate route for this
	 boolean isClosingBracketMatched(char c1, char c2) {
		 if(c1=='{' && c2=='}')  return true;
		 if(c1=='(' && c2==')')  return true;
		 if(c1=='[' && c2==']')  return true;
		 return false;
	 }
}
public class BracketTest {
	public static void main(String[] args) {
		String str1 = "{[()()]}";
		String str2 = "([)()]";
		Bracket br = new Bracket();
		int ans = br.solution(str2);
		System.out.println("Ans : "+ans);
	}

}
