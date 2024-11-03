import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Enter an integer: ");
        while (true) {
            if (sc.hasNextInt()) {
                x = sc.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next(); 
            }
        }

        boolean isPalindrome = isPalindrome(x);
        System.out.println("Is the number a palindrome? " + isPalindrome);

        sc.close();
    }

    public static boolean isPalindrome(int x) {
        String original = String.valueOf(x);
        StringBuilder reversed = new StringBuilder(original).reverse();
        String rev = reversed.toString();
        System.out.println(rev);
        if (original.equals(rev)){
             return true;
        }
        return false;
    }
}
