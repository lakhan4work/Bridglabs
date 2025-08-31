import java.util.Scanner;

public class NumbersCheck {
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();

            if (isPositive(nums[i])) {
                if (isEven(nums[i]))
                    System.out.println(nums[i] + " is Positive & Even");
                else
                    System.out.println(nums[i] + " is Positive & Odd");
            } else {
                System.out.println(nums[i] + " is Negative");
            }
        }

        int cmp = compare(nums[0], nums[nums.length - 1]);
        if (cmp == 0) System.out.println("First and Last are Equal");
        else if (cmp == 1) System.out.println("First is Greater");
        else System.out.println("Last is Greater");
    }
}
