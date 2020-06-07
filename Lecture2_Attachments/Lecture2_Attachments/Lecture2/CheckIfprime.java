package Lecture2;

public class CheckIfprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 256;
		int divisor = 2;
		while (divisor < number) {
			if (number % divisor == 0) {
				System.out.println("The number is not prime");
				return;

			}
			divisor++;
		}
		System.out.println("The number is prime");

	}

}
