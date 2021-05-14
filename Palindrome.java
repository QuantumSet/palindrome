import java.util.ArrayList;
public class Palindrome {
	public static void main (String []args) {
		int set = 50;
		int set1 = set % 100;
		System.out.println(set + set1);
		System.out.println(checkPalindrome(200));

		
	}
	
	public static ArrayList<Integer> checkPalindrome(int num) {
		String wnum = Integer.toString(num);
		String[] newset = wnum.split("");
		ArrayList<Integer> digits = new ArrayList<Integer>(newset.length);
		while (num > 0) {
			for (int i = 1; i < digits.size(); i++) {
				digits.set(-i, num % 10);
				num = num/10;
			}
		}
		return digits;
		
		
		
	}
	
	
	
}

