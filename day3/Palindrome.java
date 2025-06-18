package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234321, rev=0;
		int realNum= num;
		
		while (num !=0) {
			int digit = num%10;
			rev = rev *10 + digit;
			num = num/10; 
		}
		
		if (realNum == rev) {
			System.out.println("Given Number " + realNum + " is Palindrome");
		} else {
			System.out.println("Given Number " + realNum + " is Not Palindrome");
		}
			
		
		

	}

}
