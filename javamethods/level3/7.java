public class FactorOperations {
    public static void main(String[] args) {
        int num = 12;

        System.out.println("Sum of factors = " + sumFactors(num));
        System.out.println("Product of factors = " + productFactors(num));
        System.out.println("Product of cubes = " + productCubes(num));
        System.out.println("Greatest factor = " + greatestFactor(num));
    }

    static int sumFactors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) sum += i;
        return sum;
    }

    static long productFactors(int n) {
        long prod = 1;
        for (int i = 1; i <= n; i++) if (n % i == 0) prod *= i;
        return prod;
    }

    static long productCubes(int n) {
        long prod = 1;
        for (int i = 1; i <= n; i++) if (n % i == 0) prod *= (i * i * i);
        return prod;
    }

    static int greatestFactor(int n) {
        for (int i = n / 2; i >= 1; i--)
            if (n % i == 0) return i;
        return 1;
    }
}
