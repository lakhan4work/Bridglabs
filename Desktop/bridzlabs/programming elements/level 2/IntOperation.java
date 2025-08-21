import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;   // multiplication first
        int result2 = a * b + c;   // multiplication first
        int result3 = c + a / b;   // division first
        int result4 = a % b + c;   // modulus first

        System.out.println("The results of Int Operations are " +
                result1 + ", " + result2 + ", " + result3 + ", " + result4);
        sc.close();
    }
}
