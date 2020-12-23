package lti.codility.lesson04.countingelements;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MissingIntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		MissingInteger missInt = new MissingInteger();
		int array[]= {1,3,6,4,1,2};
		int missedVal = missInt.solution(array);
		System.out.println("missed int : "+missedVal);
		*/
		Account a = new Account(101,"Jack",5000);
		Account b = new Account(101,"Jack",5000);
		Account c = a;
		
		Set<Account> accSet = new HashSet<Account>();
		accSet.add(a);
		accSet.add(b);
		accSet.add(c);
		
		/*System.out.println("a "+a.hashCode());
		System.out.println("b "+b.hashCode());
		System.out.println("c "+c.hashCode());*/
		
		for (Account account : accSet) {
			System.out.println(" account "+account);
		}
		
		
	}

}
class Account
{
	int accountNumber;
	String accountHolderName;
	double accountBalance;
	public Account(int accountNumber, String accountHolderName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((accountHolderName == null) ? 0 : accountHolderName.hashCode());
		result = prime * result + accountNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Account other = (Account) obj;
		if (Double.doubleToLongBits(accountBalance) != Double.doubleToLongBits(other.accountBalance))
			return false;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}
	
	
}
//for TreeSet -> Comparable
//for HashSet -> equals() and hashCode() together

class MissingInteger
{
	public int solution(int A[])
	{
		Set<Integer> testedSet = new TreeSet<Integer>();
		Set<Integer> perfectSet = new TreeSet<Integer>();
		
		for(int i=0; i<A.length; i++)
		{
			testedSet.add(A[i]); //sort it
			perfectSet.add(A[i]+1); //set to find missing int 
		}
		for(int current : perfectSet) 
		{
			if(!testedSet.contains(current)) {
				return current;
			}
		}
		if(perfectSet.size() == testedSet.size()) {
			return perfectSet.size() + 1;
		}
		return 1;
	}
}