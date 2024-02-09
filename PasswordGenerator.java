import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

    public static void main(String[] args) {
        int length = 12; // Set the desired length of the password
        String password = generatePassword(length);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();

        // Define the character sets to use in the password
        String validCharacters = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;

        // Ensure at least one character from each character set
        password.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
        password.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
        password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        password.append(SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length())));

        // Generate the rest of the password
        for (int i = 4; i < length; i++) {
            password.append(validCharacters.charAt(random.nextInt(validCharacters.length())));
        }

        // Shuffle the characters in the password
        String shuffledPassword = shufflePassword(password.toString());

        return shuffledPassword;
    }

    public static String shufflePassword(String password) {
        char[] passwordArray = password.toCharArray();
        SecureRandom random = new SecureRandom();

        for (int i = passwordArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = passwordArray[index];
            passwordArray[index] = passwordArray[i];
            passwordArray[i] = temp;
        }

        return new String(passwordArray);
    }
}
