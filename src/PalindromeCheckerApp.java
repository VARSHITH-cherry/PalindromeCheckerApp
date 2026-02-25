public class PalindromeCheckerApp {

    // ================= UC3 - Reverse String Method =================
    public static boolean reverseCheck(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }

    // ================= MAIN METHOD =================
    public static void main(String[] args) {

        // ================= UC1 - Welcome Message =================
        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER APP      ");
        System.out.println("     Version 1.0                 ");
        System.out.println("=================================");
        System.out.println("Application Started Successfully!");

        String word = "madam";

        // ================= UC2 - Manual Half Comparison =================
        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println(word + " is a Palindrome (UC2 - Manual)");
        else
            System.out.println(word + " is NOT a Palindrome (UC2 - Manual)");

        // ================= UC3 - Reverse Method =================
        if (reverseCheck(word))
            System.out.println(word + " is a Palindrome (UC3 - Reverse)");
        else
            System.out.println(word + " is NOT a Palindrome (UC3 - Reverse)");
    }
}