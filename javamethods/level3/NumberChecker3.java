import java.util.Arrays;

public class NumberChecker3 {
    public static void main(String[] args) {
        int num = 1221;

        System.out.println("Reversed = " + reverse(num));
        System.out.println("Palindrome? " + isPalindrome(num));
        System.out.println("Duck Number? " + isDuck(num));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println("Arrays equal? " + Arrays.equals(arr1, arr2));
    }

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    static boolean isDuck(int n) {
        String s = String.valueOf(n);
        return s.substring(1).contains("0");
    }
}
