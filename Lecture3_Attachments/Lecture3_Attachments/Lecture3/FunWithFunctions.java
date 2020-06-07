package Lecture3;

public class FunWithFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		//Part 1
		HelloFun();
		HelloFun();
		
		//Part 2
		HelloFun();
		HelloGun();
		
		//Part 3
		HelloFunGun();
		
		//Part 4
		String name="Rishab";
		name=FunWithArguments(name);
		System.out.println(name);
		
		//Part 5
		int a=10,b=20;
		System.out.println(a+" "+b);
		swap(a, b);
		System.out.println(a+" "+b);
		

	}
	
	public static void HelloFun(){
		System.out.println("HelloFun");
	}
	
	public static void HelloGun(){
		System.out.println("HelloGun");
	}
	
	public static void HelloFunGun(){
		System.out.println("HelloFunGun");
		HelloFun();
	}
	
	public static String FunWithArguments(String name){
		name="Deepak";
		System.out.println(name);
		return name;
	}
	
	public static void swap(int a,int b){
		System.out.println(a+" "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
	

}
