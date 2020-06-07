package Lecture2;

public class PrimeNumbers2toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 2;
		int end = 50;

		boolean flag = true;
		while (start <= end) {
			int divisor = 2;
			flag = true;

			while (divisor < start) {
				if (start % divisor == 0) {
					flag = false;
					break;
				}
				divisor++;
			}

			if (flag == true) {
				System.out.println(start);
			}
			start++;
		}
	}

}
