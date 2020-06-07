package Lecture2;

public class SumOfOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 64821;
		int counter = 1;
		int sumEven = 0;
		int sumOdd = 0;

		while (N != 0) {
			int rem = N % 10;
			if (counter % 2 == 0) {
				sumEven = sumEven + rem;
			} else {
				sumOdd = sumOdd + rem;
			}
			N = N / 10;
			counter++;
		}
		System.out.println("The sum of Odd Numbers is " + sumOdd);
		System.out.println("The sum of Even Numbers is " + sumEven);
	}

}
