import java.util.*;

public class level1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.print("Enter question number (0 to exit): ");
            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            switch (choice) {

                // Q1
                case 1:
                    int[] ages = new int[10];
                    for (int i = 0; i < ages.length; i++) {
                        System.out.print("Enter age for student " + (i + 1) + ": ");
                        ages[i] = input.nextInt();
                    }
                    for (int age : ages) {
                        if (age < 0) {
                            System.out.println("Invalid age!");
                        } else if (age >= 18) {
                            System.out.println("The student with the age " + age + " can vote.");
                        } else {
                            System.out.println("The student with the age " + age + " cannot vote.");
                        }
                    }
                    break;

                // Q2
                case 2:
                    int[] nums = new int[5];
                    for (int i = 0; i < nums.length; i++) {
                        System.out.print("Enter number " + (i + 1) + ": ");
                        nums[i] = input.nextInt();
                    }
                    for (int n : nums) {
                        if (n > 0) {
                            if (n % 2 == 0) {
                                System.out.println(n + " is Positive and Even");
                            } else {
                                System.out.println(n + " is Positive and Odd");
                            }
                        } else if (n < 0) {
                            System.out.println(n + " is Negative");
                        } else {
                            System.out.println(n + " is Zero");
                        }
                    }
                    if (nums[0] == nums[4]) {
                        System.out.println("First and last numbers are equal.");
                    } else if (nums[0] > nums[4]) {
                        System.out.println("First number is greater than last.");
                    } else {
                        System.out.println("First number is less than last.");
                    }
                    break;

                // Q3
                case 3:
                    System.out.print("Enter a number for multiplication table: ");
                    int num = input.nextInt();
                    int[] table = new int[10];
                    for (int i = 0; i < 10; i++) {
                        table[i] = num * (i + 1);
                        System.out.println(num + " * " + (i + 1) + " = " + table[i]);
                    }
                    break;

                // Q4
                case 4:
                    double[] arr = new double[10];
                    double total = 0.0;
                    int index = 0;
                    while (true) {
                        System.out.print("Enter number (0 or negative to stop): ");
                        double val = input.nextDouble();
                        if (val <= 0 || index == 10) {
                            break;
                        }
                        arr[index++] = val;
                    }
                    for (int i = 0; i < index; i++) {
                        total += arr[i];
                        System.out.println("Value " + (i + 1) + ": " + arr[i]);
                    }
                    System.out.println("Total sum = " + total);
                    break;

                // Q5
                case 5:
                    System.out.print("Enter a number: ");
                    int number = input.nextInt();
                    for (int i = 6; i <= 9; i++) {
                        System.out.println(number + " * " + i + " = " + (number * i));
                    }
                    break;

                // Q6
                case 6:
                    double[] heights = new double[11];
                    double sum = 0.0;
                    for (int i = 0; i < heights.length; i++) {
                        System.out.print("Enter height of player " + (i + 1) + ": ");
                        heights[i] = input.nextDouble();
                        sum += heights[i];
                    }
                    double mean = sum / heights.length;
                    System.out.println("Mean height of football team = " + mean);
                    break;

                // Q7
                case 7:
                    System.out.print("Enter a natural number: ");
                    int natural = input.nextInt();
                    if (natural <= 0) {
                        System.out.println("Error: not a natural number!");
                    } else {
                        int[] evenArr = new int[natural / 2 + 1];
                        int[] oddArr = new int[natural / 2 + 1];
                        int eIndex = 0, oIndex = 0;
                        for (int i = 1; i <= natural; i++) {
                            if (i % 2 == 0) {
                                evenArr[eIndex++] = i;
                            } else {
                                oddArr[oIndex++] = i;
                            }
                        }
                        System.out.print("Even numbers: ");
                        for (int i = 0; i < eIndex; i++) {
                            System.out.print(evenArr[i] + " ");
                        }
                        System.out.print("\nOdd numbers: ");
                        for (int i = 0; i < oIndex; i++) {
                            System.out.print(oddArr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                // Q8
                case 8:
                    System.out.print("Enter a number: ");
                    int factNum = input.nextInt();
                    int maxFactor = 10;
                    int[] factors = new int[maxFactor];
                    int fIndex = 0;
                    for (int i = 1; i <= factNum; i++) {
                        if (factNum % i == 0) {
                            if (fIndex == maxFactor) {
                                maxFactor *= 2;
                                int[] temp = new int[maxFactor];
                                System.arraycopy(factors, 0, temp, 0, factors.length);
                                factors = temp;
                            }
                            factors[fIndex++] = i;
                        }
                    }
                    System.out.print("Factors: ");
                    for (int i = 0; i < fIndex; i++) {
                        System.out.print(factors[i] + " ");
                    }
                    System.out.println();
                    break;

                // Q9
                case 9:
                    System.out.print("Enter number of rows: ");
                    int rows = input.nextInt();
                    System.out.print("Enter number of cols: ");
                    int cols = input.nextInt();
                    int[][] matrix = new int[rows][cols];
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print("Enter element [" + i + "][" + j + "]: ");
                            matrix[i][j] = input.nextInt();
                        }
                    }
                    int[] oneD = new int[rows * cols];
                    int k = 0;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            oneD[k++] = matrix[i][j];
                        }
                    }
                    System.out.print("1D Array: ");
                    for (int x : oneD) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                    break;

                // Q10
                case 10:
                    System.out.print("Enter a number: ");
                    int fbNum = input.nextInt();
                    if (fbNum <= 0) {
                        System.out.println("Not a positive integer!");
                    } else {
                        String[] fbArr = new String[fbNum + 1];
                        for (int i = 1; i <= fbNum; i++) {
                            if (i % 3 == 0 && i % 5 == 0) {
                                fbArr[i] = "FizzBuzz";
                            } else if (i % 3 == 0) {
                                fbArr[i] = "Fizz";
                            } else if (i % 5 == 0) {
                                fbArr[i] = "Buzz";
                            } else {
                                fbArr[i] = String.valueOf(i);
                            }
                        }
                        for (int i = 1; i <= fbNum; i++) {
                            System.out.println("Position " + i + " = " + fbArr[i]);
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        input.close();
    }
}