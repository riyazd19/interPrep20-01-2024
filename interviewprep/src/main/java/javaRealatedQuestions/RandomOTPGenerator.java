package javaRealatedQuestions;
import java.util.Random;

public class RandomOTPGenerator {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a 4-digit OTP
        int otp = 100+ random.nextInt(900000);

        // Print the generated OTP
        System.out.println("Generated OTP: " + otp);
    }
}
