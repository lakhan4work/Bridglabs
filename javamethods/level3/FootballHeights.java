import java.util.Random;

public class FootballHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150–250
        }

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Players' Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nSum = " + sum);
        System.out.println("Mean = " + mean);
        System.out.println("Shortest = " + shortest);
        System.out.println("Tallest = " + tallest);
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    static int findShortest(int[] arr) {
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        return min;
    }

    static int findTallest(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }
}
