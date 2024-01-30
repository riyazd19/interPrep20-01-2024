package javaRealatedQuestions;

public class ReverseStringBasic {

	public static void main(String[] args) {
		String s="abcdef";
		String rev= reverse(s);
		System.out.println(rev);

	}

	private static String reverse(String s) {
	char temp;
		char[] chararray= s.toCharArray();
	
		int left= 0;
		int right= s.length()-1;
		while(left<right) {
			temp=chararray[left];
			chararray[left]=chararray[right];
			chararray[right]=temp;
			left++;
			right--;
		}		
		return new String(chararray);
	}

	

}
