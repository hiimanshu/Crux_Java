package Lecture4;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Part 1 Declaration
		int[] arr;
		// System.out.println(arr);

		// Part 2 Initialisation

		arr = new int[5];
		// System.out.println(arr);

		System.out.println(arr.length);
//	    System.out.println(arr[0]);
//	    System.out.println(arr[1]);
//	    System.out.println(arr[2]);
	  //  System.out.println(arr[5]);--Index out of Bound
	    
	    //Part 3
	   // display(arr);
	    
	    //Part 4
	    arr[0]=10;
	    arr[1]=20;
	    arr[2]=30;
//	    
//	    display(arr);
	    
	    //Part 5
	    int a=0, b=2;
	    System.out.println(arr[a]+" "+arr[b]);
	    swap(arr, a, b);
	    System.out.println(arr[a]+" "+arr[b]);
	    display(arr);
	    System.out.println("**********************************");
	    //Part 6
	    
	    int[] myarr={10,20,30,40,50};
	    display(myarr);
	    
	  //part 7
	    System.out.println("**********************************");
		ArrayList<Integer> list=new ArrayList<>();
	    list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(40);
	    System.out.println(list.size());
	    System.out.println(list);
	    
	    
	}
	
	public static void swap(int[] arr,int a,int b){
		System.out.println(arr[a]+" "+arr[b]);
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		System.out.println(arr[a]+" "+arr[b]);
		
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	

}
