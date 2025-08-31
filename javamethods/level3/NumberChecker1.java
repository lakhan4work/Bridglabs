public class NumberChecker1 {
    public static void main(String[] args) {
        int num = 153;

        int count = countDigits(num);
        int[] digits = getDigits(num);

        System.out.println("Count = " + count);
        System.out.println("Duck Number? " + isDuck(digits));
        System.out.println("Armstrong Number? " + isArmstrong(digits));
        findLargestSmallest(digits);
    }

    static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    static boolean isDuck(int[] d) {
        for (int x : d) if (x == 0) return true;
        return false;
    }

    static boolean isArmstrong(int[] d) {
        int n = d.length, sum = 0, num = 0;
        for (int x : d) {
            sum += Math.pow(x, n);
            num = num * 10 + x;
        }
        return sum == num;
    }

    static void findLargestSmallest(int[] d) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int x : d) {
            if (x > max1) { max2 = max1; max1 = x; }
            else if (x > max2 && x != max1) max2 = x;

            if (x < min1) { min2 = min1; min1 = x; }
            else if (x < min2 && x != min1) min2 = x;
        }
        System.out.println("Largest = " + max1 + ", 2nd Largest = " + max2);
        System.out.println("Smallest = " + min1 + ", 2nd Smallest = " + min2);
    }
}
