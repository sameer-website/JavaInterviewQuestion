package Questions;

import java.util.Arrays;

public class Palidrome {

	public static void main(String[] args) {
		System.out.println("please check the input is palindrome or not !!");
		String Palindrome = "madam";
		String reverse = "";
		for (int j = Palindrome.length()-1; j >= 0; j--) {
			reverse+=Palindrome.charAt(j);
		}
		if (Palindrome.equals(reverse)) {
			System.out.println("It is palindrome");
		}
		int arr[] = {7,5,3,5,2};
		System.out.println(Arrays.toString(arr));

	}

}
