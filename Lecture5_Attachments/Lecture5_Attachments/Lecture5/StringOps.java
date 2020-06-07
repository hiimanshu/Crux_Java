package Lecture5;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		// printChars(s);
		System.out.println("********************************");
		// printAllSS(s);
		System.out.println("********************************");
		System.out.println(isPalindrome("abbdbba"));
		System.out.println(countAllPalSS("Hello"));
		System.out.println(toggleCase("HeLLo"));
		System.out.println(modifyString("afc"));

	}

	public static void printChars(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void printAllSS(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

	public static boolean isPalindrome(String str) {
		int left = 0, right = str.length() - 1;
		boolean flag = true;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				flag = false;
				break;
			}
			left++;
			right--;
		}
		return flag;
	}

	public static int countAllPalSS(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String tocheck = str.substring(i, j);
				if (isPalindrome(tocheck)) {
					System.out.println(tocheck);
					count++;
				}
			}
		}
		return count;
	}

	public static String toggleCase(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (cc >= 97 && cc <= 122) {
				char tbi = (char) (cc - 32);
				sb.append(tbi);
			}
			if (cc >= 65 && cc <= 90) {
				char tbi = (char) (cc + 32);
				sb.append(tbi);
			}
		}
		return sb.toString();
	}

	public static String modifyString(String str) {
		StringBuilder sb = new StringBuilder();
		char prev = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char cc = str.charAt(i);
			sb.append(prev);
			sb.append(cc - prev);
			prev = cc;
		}
		sb.append(prev);
		return sb.toString();
	}

}
