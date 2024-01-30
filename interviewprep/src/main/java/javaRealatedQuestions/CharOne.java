package javaRealatedQuestions;

public class CharOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char myChar = 'A';
		if (Character.isLetter(myChar)) {
		    System.out.println("The character is a letter.");
		}
		else
		System.out.println("wrong");
		
		char myChar1 = 'X';
		String charAsString = Character.toString(myChar1);
		System.out.println("Character as String: " + charAsString);


	}

}
