package Lecture2;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		int row = 1;
		int col = 1;
		boolean flag = true;

		while (row != 0) {
			col = 1;
			while (col <= N - row) {
				System.out.print("\t");
				col++;
			}
			col = 1;
			int value = row;
			while (col <= row) {
				System.out.print(value + "\t");
				col++;
				value++;
			}

			col = 1;
			value = value - 2;
			while (col < row) {
				System.out.print(value + "\t");
				value--;
				col++;
			}

			if (row == N) {
				flag = false;
			}

			if (flag == true) {
				row = row + 1;
			} else {
				row = row - 1;
			}

			System.out.println();

		}
	}

}
