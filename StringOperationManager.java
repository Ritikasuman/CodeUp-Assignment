/***
 *TASK--> When the program is run, the user will first enter a string. After that, the program should ask the user which operation they want to execute on the string. The available operations are
listed below: > Append                             > Split                                                 
              > CountWords                         > MaxRepeatingCharacter
              > Replace                            > Sort
              > isPalindrome                       > Shift 
              > Splice                             > Reverse
*Each method should perform its respective operation based on the user's input.
*Owner-->Ritika suman 
*DATE-->04/09/2024
 */


import java.util.*;

public class StringOperationManager{

    public static String UserString;
    public static void main(String[] args){
        while(true){
           
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string (type 'exit' to end program):");
        
         UserString = input.nextLine();
         if (UserString.equals("exit")) {
            System.out.println("Exiting...");
            input.close();
            return;
        }
         boolean check = true ; 
          ValidString(UserString);
           if(!ValidString(UserString)){
            check = false; 
           }
 
          if (check){
                System.out.println("CH00SE A OPERATION");
       
                System.out.println("Select 1 to append a new String");
                System.out.println("Select 2 to Count the Words of the String");
                System.out.println("Select 3 to replace a character from the String");
                System.out.println("Select 4 to find Whether the String is Palindrome or not");
                System.out.println("Select 5 to splice the String");
                System.out.println("Select 6 to split the String");
                System.out.println("Select 7 to find Maximum Repeating Characters");
                System.out.println("Select 8 to sort the String");
                System.out.println("Select 10 to Reverse the String");
                System.out.println("Enter your Choice"); 
            }
          
            int a;
             a = input.nextInt();
             input.nextLine();
            
            switch(a){
                        case 1:
                        System.out.print("Enter string to append: ");
                        String appendString = input.nextLine();
                        System.out.println("Result: " + AppendString( UserString , appendString));
                                break;
                     
                        case 2:
                        System.out.println("Word count: " + countWords(UserString));
                                break;

                        case 3:
                        System.out.print("Enter substring to replace: ");
                        char oldSubstring = input.nextLine().charAt(0);;
                        System.out.print("Enter new substring: ");
                        char newSubstring = input.nextLine().charAt(0);;
                        System.out.println("Result: " + replace(UserString , oldSubstring, newSubstring));
                               break;


                        case 4:
                        System.out.println("Is palindrome: " + isPalindrome(UserString));
                               break;

                        case 5:
                        System.out.print(" not available ");
;
                                break;

                        case 6:
                        System.out.println("not available ");
                        // String[] splitResult = split(UserString);
                        // for (String word : splitResult) {
                        //     System.out.println(word);
                        // }
                              break;

                        case 7:
                        System.out.println("not available ");
                              break;

                        case 8:
                        System.out.println("Sorted string: " + sort(UserString));
                              break;

                        case 9:
                        System.out.print("not available ");
                        
                               break;

                        case 10:
                        System.out.println("Reversed string: " + reverse(UserString ));
                               break;

                        default: 
                        System.out.println("Invalid choice.");
                }
        
                
            }
        
    }    
    
    public static boolean ValidString(String S){
        for( int i = 0 ; i < S.length() ; i++){
          if (Character.isDigit(S.charAt(i))){
            System.out.println("enter a valid string");
            return false;  
           }   
        }
          return true;
    }


    public static String AppendString(String first ,String next ){
         return UserString + " " + next ;

    }


    public static int countWords(String str) {
        int count = 0;
		boolean choice  = false;
		int endword = str.length() - 1;
		for (int i = 0;i < str.length();i++)
		{
			if (Character.isLetter(str.charAt(i)) && i != endword)
					{
				choice  = true;
					}
			else if ( !Character.isLetter(str.charAt(i)) && choice )
			{
				count ++;
				choice  = false;
			}
			else if (Character.isLetter(str.charAt(i)) && i == endword)
			{
				count ++;
			}
		}
		return count ;
    }

   
    public static String replace(String str, char oldSubstring, char newSubstring) {
     
        char[] result = new char[str.length()];

		for(int i = 0;i < str.length();i++)

		   {
			if(str.charAt(i) == oldSubstring){
			
				result[i] = newSubstring;
			}
			else 
			{
				result[i] = str.charAt(i);
			}
			}
		return new String(result);
    }



    public static boolean isPalindrome(String in) {
        if(in == null || in.length() == 0)
		{
			return true;
		}

		for(int i = 0; i <= in.length()/2;i++)
		{
			char start = in.charAt(i);
			char end =in.charAt(in.length() - 1 - i);

		if (start != end)
		{
			return false;
		}
		}
		return true;
    }


    // public static String[] split(String str) {
    //     return str.split("\\s+");
    // }

   
    public static String sort(String str) {
      
    	char temp;
    	char string[] = str.toCharArray();
    	for(int i = 0 ;i < string.length; i++)
    	{
    		for(int j = i + 1;j < string.length; j++ )
    		{
    			if(string[i]>string[j])
    			{
    				temp = string[i];
    				string[i] = string[j];
    				string[j] = temp;
     			}
    		}
    	}
    	return new String(string);
    }


    
    public static String reverse(String str) {
        char[] result = new char[str.length()];
           for (int i = 0; i < str.length(); i++)
            {
            result[i] = str.charAt(str.length() - 1 - i);
            }
        return new String(result);
        }

}





