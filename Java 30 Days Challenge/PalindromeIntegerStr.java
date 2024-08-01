import java.util.Scanner;

public class PalindromeIntegerStr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter an integer between 1 and 10000: ");
        int n = scanner.nextInt();
        
        if (n < 1 || n > 10000) {
            System.out.println("Integer out of range.");
        } else {
            
            String numStr = Integer.toString(n);
            
            if (isPalindrome(numStr)) {
                System.out.println("The integer " + n + " is a palindrome.");
            } else {
                System.out.println("The integer " + n + " is not a palindrome.");
            }
        }
        
        scanner.nextLine();
        
        System.out.print("Enter a string (length <= 10): ");
        String str = scanner.nextLine();
        
        if (str.length() > 10) {
            System.out.println("String length exceeds the limit.");
        } else {
            
            if (isPalindrome(str)) {
                System.out.println("The string \"" + str + "\" is a palindrome.");
            } else {
                System.out.println("The string \"" + str + "\" is not a palindrome.");
            }
        }
        
        scanner.close();
    } 

public static boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;
    
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    
    return true;
}
}
