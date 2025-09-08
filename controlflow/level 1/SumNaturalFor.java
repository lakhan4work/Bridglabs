import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("Sum using for loop = " + sum);
            System.out.println("Sum using formula = " + formula);
            System.out.println("Results Match? " + (sum == formula));
        } else {
            System.out.println("Not a natural number!");
        }
    }
}
