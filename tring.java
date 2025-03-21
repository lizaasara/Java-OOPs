import java.util.Scanner;

public class tring{

    // Function to concatenate two strings
    public static String concatenateStrings(String str1, String str2) {
        return str1.concat(str2);
    }

    // Function to convert a string to uppercase
    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    // Function to check if a string contains a substring
    public static void checkContains(String str, String subStr) {
        System.out.println(str.contains(subStr));
    }

    // Function to compare two strings for equality
    public static boolean checkEquality(String str1, String str2) {
        return str1.equals(str2);
    }

    // Function to get the length of a string
    public static int getStringLength(String str) {
        return str.length();
    }

    // Function to replace characters in a string
    public static String replaceCharacter(String str, char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user inputs
        System.out.println("Enter the first name:");
        String str1 = sc.nextLine();
        
        System.out.println("Enter the second name:");
        String str2 = sc.nextLine();
        
        // String concatenation
        String result = concatenateStrings(str1, str2);
        System.out.println("Concatenation: " + result);
        
        // Converting to uppercase
        System.out.println("Uppercase: " + convertToUpperCase(result));
        
        // Demonstrating contains method
        String myStr = "Hello";
        checkContains(myStr, "Hel");
        checkContains(myStr, "e");
        checkContains(myStr, "Hi");
        
        // Comparing strings
        System.out.println("Strings are equal: " + checkEquality(str1, str2));
        System.out.println("Strings are equal: " + checkEquality(str1, "Another String"));
        
        // Getting the length of a string
        String myStr3 = "Another String";
        System.out.println("Length: " + getStringLength(myStr3));
        
        // Replacing characters in a string
        System.out.println("Replaced string: " + replaceCharacter(myStr, 'l', 'p'));
    }
}
