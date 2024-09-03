/***
 *Task 1: Expand Characters in a String
 *Given a string containing characters followed by digits, expand each character by repeating it according to the digit that follows.
 *Example 1:
           ● Input: "a1b4c3"
           ● Output: "abbbbccc"
           ● Explanation:
           The character 'a' is followed by 1, so it appears once.
           The character 'b' is followed by 4, so it appears four times: "bbbb".
           The character 'c' is followed by 3, so it appears three times: "ccc".
           The final output is "abbbbccc".
 * Owner = Ritika suman
 * Date = 09/02/2024
 */


import java.util.Scanner;

public class ExpandCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        while (true) {
            System.out.println(Constants.PROMPT_MESSAGE);
            String str = reader.nextLine();
                    
            if (str.equalsIgnoreCase("exit")) {
                break;
            }
            
            String expandedString = expandString(str);
            System.out.println("Expanded string: " + expandedString);
        }
        
        reader.close(); 
    }

    // Method to expand the characters in the string
    public static String expandString(String str) {
        String expanded = "";
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                expanded += currentChar;
            } else {
                int repeatCount = Character.getNumericValue(currentChar);
                for (int j = 1; j < repeatCount; j++) {
                    expanded += str.charAt(i - 1);
                }
            }
        }
        
        return expanded;
    }
}


