package Lecture5;

public class twodArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr;
       // System.out.println(arr);
        
       // arr=new int[3][3];
        
      //  arr=new int[][3];--Not Valid
        
        arr=new int[3][];
        arr[0]=new int[3];
        
        System.out.println(arr[0][2]);
       // System.out.println(arr[1][0]);--Null Pointer Exception
        
        
	}

}
