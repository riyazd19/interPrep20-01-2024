package javaRealatedQuestions;

import java.util.Scanner;

public class StringClassPrograms {

	public static void main(String[] args) {
		String s;
		System.out.println("enter the value for string s");
		Scanner scan = new Scanner(System.in);
		s = scan.nextLine();
		String afterReverse = reverse(s);
		System.out.println(afterReverse);

	}

	public static String reverse(String s) {
		System.out.println("lets check the reverse");
		char[] chararray = s.toCharArray();
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			char temp = chararray[left];
			chararray[left] = chararray[right];
			chararray[right] = temp;
			left++;
			right--;
		}
		return new String(chararray);
	}

}
