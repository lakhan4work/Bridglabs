public class NumberChecker2 {
    public static void main(String[] args) {
        int num = 21;
        int[] digits = getDigits(num);

        System.out.println("Sum of digits = " + sumDigits(digits));
        System.out.println("Sum of squares = " + sumSquares(digits));
        System.out.println("Harshad Number? " + isHarshad(num, digits));
        frequency(digits);
    }

    static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    static int sumDigits(int[] d) {
        int sum = 0; for (int x : d) sum += x; return sum;
    }

    static int sumSquares(int[] d) {
        int sum = 0; for (int x : d) sum += Math.pow(x, 2); return sum;
    }

    static boolean isHarshad(int n, int[] d) {
        return n % sumDigits(d) == 0;
    }

    static void frequency(int[] d) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;

        for (int x : d) freq[x][1]++;
        System.out.println("Digit Frequency:");
        for (int[] row : freq) if (row[1] > 0)
            System.out.println(row[0] + " → " + row[1]);
    }
}
