public class NumberChecker4 {
    public static void main(String[] args) {
        int num = 19;

        System.out.println("Prime? " + isPrime(num));
        System.out.println("Neon? " + isNeon(num));
        System.out.println("Spy? " + isSpy(num));
        System.out.println("Automorphic? " + isAutomorphic(num));
        System.out.println("Buzz? " + isBuzz(num));
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    static boolean isNeon(int n) {
        int sq = n * n, sum = 0;
        while (sq > 0) { sum += sq % 10; sq /= 10; }
        return sum == n;
    }

    static boolean isSpy(int n) {
        int sum = 0, prod = 1, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += d; prod *= d; temp /= 10;
        }
        return sum == prod;
    }

    static boolean isAutomorphic(int n) {
        return String.valueOf(n * n).endsWith(String.valueOf(n));
    }

    static boolean isBuzz(int n) {
        return (n % 7 == 0 || n % 10 == 7);
    }
}
