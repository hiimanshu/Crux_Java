package Lecture3;

public class Conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin = 100000;
//		int ans=BinToDec(bin);
//		System.out.println(ans);
		System.out.println(BinToDec(bin));
		System.out.println(DecToBin(32));
		System.out.println(AnyToDec(37,8));
		System.out.println(DecToAny(31,8));

	}

	public static int BinToDec(int bin) {
		int twopowers = 1;
		int dec = 0;
		while (bin != 0) {
			int rem = bin % 10;
			dec = dec + rem * twopowers;
			twopowers = twopowers * 2;
			bin = bin / 10;
		}

		return dec;
	}

	public static int DecToBin(int dec) {
		int tenpowers=1;
		int bin=0;
		while(dec!=0){
			int rem=dec%2;
			bin=bin+rem*tenpowers;
			tenpowers=tenpowers*10;
			dec=dec/2;
		}
		return bin;
	}

	public static int AnyToDec(int num, int sb) {
		int sbpowers = 1;
		int dec = 0;
		while (num != 0) {
			int rem = num % 10;
			dec = dec + rem * sbpowers;
			sbpowers = sbpowers * sb;
			num = num / 10;
		}

		return dec;
	}

	public static int DecToAny(int dec, int db) {
		int tenpowers=1;
		int num=0;
		while(dec!=0){
			int rem=dec%db;
			num=num+rem*tenpowers;
			tenpowers=tenpowers*10;
			dec=dec/db;
		}
		return num;
	}
	
	public static int AnyToAny(int num,int sb,int db){
		int dec=AnyToDec(num, sb);
		int ans=DecToAny(dec, db);
		
		return ans;
	}

}
