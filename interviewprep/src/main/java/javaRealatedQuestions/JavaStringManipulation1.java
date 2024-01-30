package javaRealatedQuestions;

public class JavaStringManipulation1 {
	public static void main(String[] args) {
        String input = "abcd12efgh34ijkl";
        String output = segregateString(input);
        System.out.println("Input:  " + input);
        System.out.println("Output: " + output);
    }

    private static String segregateString(String input) {
        char[] charArray = input.toCharArray();
        //char[] charArray1 = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        

        while (left < right) {
            // Skip numeric characters from the left
            while (left < right && Character.isDigit(charArray[left])) {
                left++;
            }

            // Skip non-numeric characters from the right
            // This checks if the character at the right position in the
            //charArray is a digit (0-9). It returns true
            //if it is a digit, and false otherwise.
            while (left < right && !Character.isDigit(charArray[right])) {
                right--;
            }

            // Swap characters at left and right positions
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }

}
