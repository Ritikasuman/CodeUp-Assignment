/***
 *Task 5: Longest Substring Without Repeating Characters
 *Given a string s, find the length of the longest substring without repeating characters.
 *Example 1:
          ● Input: s = "abcabcbb"
          ● Output: 3
          ● Explanation: The answer is "abc", with the length of 3.
 * Owner = Ritika suman
 * Date = 09/02/2024
 */

import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        while (true) {
            System.out.println(Constants.PROMPT_MESSAGE);
            String s = reader.nextLine();
            
            // Check if the user wants to exit
            if (s.equalsIgnoreCase("exit")) {
                break;
            }
            
            System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(s));
        }
        
        reader.close();
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        int[] charIndex = new int[128]; // Assuming ASCII characters

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            left = Math.max(charIndex[currentChar], left);
            maxLength = Math.max(maxLength, right - left + 1);
            charIndex[currentChar] = right + 1;
        }

        return maxLength;
    }
}
