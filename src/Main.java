// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// add package here
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // get string from user
        System.out.println("this program will count the number of vowels in a string");
        System.out.println("Enter a text: ");
        Scanner userInput = new Scanner(System.in);
        String userString = userInput.nextLine();
        // runs the loop that itterares through the string and finds vowels
        int vowelCount = 0;
        for (int i = 0; i < userString.length(); i++) {
            char vowel = userString.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
                vowelCount++;
            }
        }
    }
}
