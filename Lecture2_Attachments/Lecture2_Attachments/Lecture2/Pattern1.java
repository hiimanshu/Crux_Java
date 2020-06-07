package Lecture2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int row = 1, value = 1;
		while (row <= n) {
          int col=1;
          while(col<=row){
        	  System.out.print(value+"\t");
        	  value++;
        	  col++;
          }
          row++;
          System.out.println();
		}
	}

}
