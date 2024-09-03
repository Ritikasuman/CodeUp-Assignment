/***
 * Task 2:  Character Frequency in a String
 * Example 1:
            ● Input: "aabcccdeee"
            ● Output: "a2b1c3d1e3"
            ● Explanation:
                        The character 'a' appears 2 times.
                        The character 'b' appears 1 time.
                        The character 'c' appears 3 times.
                        The character 'd' appears 1 time.
                        The character 'e' appears 3 times.
           Concatenating these frequencies results in "a2b1c3d1e3". 
 * Owner = Ritika suman
 * Date = 09/02/2024
 */

import java.util.Scanner;


public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        while (true) {
            System.out.println(Constants.PROMPT_MESSAGE);
            String input = reader.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
           
            String compressedString = compressString(input);                        
            System.out.println(Constants.COMPRESSED_MESSAGE + compressedString);
        }
        
        reader.close();
    }
    
    // Method to compress the string
    public static String compressString(String input) {
        String compress = "";
        int count = 1;
       
        for (int i = 0; i < input.length(); i++) {
          
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compress += input.charAt(i) + String.valueOf(count);
                count = 1; 
            }
        }
        
        return compress;
    }
}
