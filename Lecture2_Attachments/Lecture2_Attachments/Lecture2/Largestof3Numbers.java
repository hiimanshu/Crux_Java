package Lecture2;

public class Largestof3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 120;
		int c = 130;

		if (a >= b && a >= c) {
			System.out.println("A is Largest");
			return;
		} else {
			if (b >= a && b >= c) {
				System.out.println("B is Largest");
			} else {
				System.out.println("C is Largest");
			}
		}
	}

}
