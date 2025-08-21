import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        System.out.println("The addition = " + (number1 + number2));
        System.out.println("The subtraction = " + (number1 - number2));
        System.out.println("The multiplication = " + (number1 * number2));
        System.out.println("The division = " + (number1 / number2));
        sc.close();
    }
}
