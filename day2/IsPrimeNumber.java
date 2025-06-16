package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// Declare a variable 
		int num =13;
		boolean isPrime = true;
		
		for (int i=2; i<num; i++) {
			
			if(num %i ==0) {
			isPrime = false;
			break;
			}
			
		}
		if (isPrime) {
			System.out.println("Given Number is prime number");
		}
		else
			System.out.println("Given Number is Not prime number");
			
		}
	}


