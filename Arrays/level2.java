import java.util.*;

public class level2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.print("Enter question number: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            switch (choice) {
                // Q1 Bonus Calculation
                case 1:
                    double[] salary = new double[10];
                    int[] years = new int[10];
                    double[] bonus = new double[10];
                    double[] newSalary = new double[10];
                    double totalOld = 0,
                     totalNew = 0,
                     totalBonus = 0;

                    for (int i = 0; i < 10; i++) {
                        System.out.print("Enter salary of employee " + (i + 1) + ": ");
                        double s = sc.nextDouble();
                        System.out.print("Enter years of service: ");
                        int y = sc.nextInt();

                        if (s <= 0 || y < 0) {
                            System.out.println("Invalid input! Enter again.");
                            i--;
                            continue;
                        }

                        salary[i] = s;
                        years[i] = y;
                        bonus[i] = (y > 5) ? s * 0.05 : s * 0.02;
                        newSalary[i] = s + bonus[i];
                        totalOld += s;
                        totalNew += newSalary[i];
                        totalBonus += bonus[i];
                    }

                    System.out.println("Total Old Salary: " + totalOld);
                    System.out.println("Total New Salary: " + totalNew);
                    System.out.println("Total Bonus Paid: " + totalBonus);
                    break;

                // Q2 Youngest & Tallest
                case 2:
                    String[] names = {"Amar", "Akbar", "Anthony"};
                    int[] ages = new int[3];
                    int[] heights = new int[3];

                    for (int i = 0; i < 3; i++) {
                        System.out.print("Enter age of " + names[i] + ": ");
                        ages[i] = sc.nextInt();
                        System.out.print("Enter height of " + names[i] + ": ");
                        heights[i] = sc.nextInt();
                    }

                    int minAgeIndex = 0,
                     maxHeightIndex = 0;
                    for (int i = 1; i < 3; i++) {
                        if (ages[i] < ages[minAgeIndex]) {
                            minAgeIndex = i;
                        }
                        if (heights[i] > heights[maxHeightIndex]) {
                            maxHeightIndex = i;
                        }
                    }

                    System.out.println("Youngest is " + names[minAgeIndex]);
                    System.out.println("Tallest is " + names[maxHeightIndex]);
                    break;

                // Q3 Digits - Fixed size
                case 3:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    int maxDigit = 10;
                    int[] digits = new int[maxDigit];
                    int index = 0;

                    while (num != 0 && index < maxDigit) {
                        digits[index++] = num % 10;
                        num /= 10;
                    }

                    int largest = 0,
                     secondLargest = 0;
                    for (int i = 0; i < index; i++) {
                        if (digits[i] > largest) {
                            secondLargest = largest;
                            largest = digits[i];
                        } else if (digits[i] > secondLargest && digits[i] != largest) {
                            secondLargest = digits[i];
                        }
                    }

                    System.out.println("Largest digit: " + largest);
                    System.out.println("Second Largest digit: " + secondLargest);
                    break;

                // Q4 Digits - Dynamic expansion
                case 4:
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();
                    maxDigit = 10;
                    digits = new int[maxDigit];
                    index = 0;

                    while (num != 0) {
                        if (index == maxDigit) {
                            maxDigit += 10;
                            int[] temp = new int[maxDigit];
                            for (int i = 0; i < digits.length; i++) {
                                temp[i] = digits[i];
                            }
                            digits = temp;
                        }
                        digits[index++] = num % 10;
                        num /= 10;
                    }

                    largest = 0;
                    secondLargest = 0;
                    for (int i = 0; i < index; i++) {
                        if (digits[i] > largest) {
                            secondLargest = largest;
                            largest = digits[i];
                        } else if (digits[i] > secondLargest && digits[i] != largest) {
                            secondLargest = digits[i];
                        }
                    }

                    System.out.println("Largest digit: " + largest);
                    System.out.println("Second Largest digit: " + secondLargest);
                    break;

                // Q5 Reverse number
                case 5:
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();
                    String numStr = Integer.toString(num);
                    int[] arr = new int[numStr.length()];
                    for (int i = 0; i < numStr.length(); i++) {
                        arr[i] = numStr.charAt(i) - '0';
                    }
                    System.out.print("Reversed number: ");
                    for (int i = arr.length - 1; i >= 0; i--) {
                        System.out.print(arr[i]);
                    }
                    System.out.println();
                    break;

                // Q6 BMI 1D
                case 6:
                    System.out.print("Enter number of persons: ");
                    int n = sc.nextInt();
                    double[] weight = new double[n];
                    double[] height = new double[n];
                    double[] bmi = new double[n];
                    String[] status = new String[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter weight of person " + (i + 1) + ": ");
                        weight[i] = sc.nextDouble();
                        System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
                        height[i] = sc.nextDouble();

                        bmi[i] = weight[i] / (height[i] * height[i]);

                        if (bmi[i] <= 18.4) {
                            status[i] = "Underweight";
                        } else if (bmi[i] <= 24.9) {
                            status[i] = "Normal";
                        } else if (bmi[i] <= 39.9) {
                            status[i] = "Overweight";
                        } else {
                            status[i] = "Obese";
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("Person " + (i + 1) + ": H=" + height[i] + ", W=" + weight[i]
                                + ", BMI=" + bmi[i] + ", Status=" + status[i]);
                    }
                    break;

                // Q7 BMI 2D
                case 7:
                    System.out.print("Enter number of persons: ");
                    n = sc.nextInt();
                    double[][] personData = new double[n][3]; // weight, height, bmi
                    String[] weightStatus = new String[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter weight of person " + (i + 1) + ": ");
                        personData[i][0] = sc.nextDouble();
                        System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
                        personData[i][1] = sc.nextDouble();

                        personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

                        if (personData[i][2] <= 18.4) {
                            weightStatus[i] = "Underweight";
                        } else if (personData[i][2] <= 24.9) {
                            weightStatus[i] = "Normal";
                        } else if (personData[i][2] <= 39.9) {
                            weightStatus[i] = "Overweight";
                        } else {
                            weightStatus[i] = "Obese";
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("Person " + (i + 1) + ": H=" + personData[i][1] + ", W=" + personData[i][0]
                                + ", BMI=" + personData[i][2] + ", Status=" + weightStatus[i]);
                    }
                    break;

                // Q8 Marks & Grades 1D
                case 8:
                    System.out.print("Enter number of students: ");
                    n = sc.nextInt();
                    int[][] marks = new int[n][3];
                    double[] percent = new double[n];
                    String[] grade = new String[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter marks in Physics, Chemistry, Maths for student " + (i + 1) + ": ");
                        marks[i][0] = sc.nextInt();
                        marks[i][1] = sc.nextInt();
                        marks[i][2] = sc.nextInt();

                        int total = marks[i][0] + marks[i][1] + marks[i][2];
                        percent[i] = total / 3.0;

                        if (percent[i] >= 80) {
                            grade[i] = "A";
                        } else if (percent[i] >= 70) {
                            grade[i] = "B";
                        } else if (percent[i] >= 60) {
                            grade[i] = "C";
                        } else if (percent[i] >= 50) {
                            grade[i] = "D";
                        } else if (percent[i] >= 40) {
                            grade[i] = "E";
                        } else {
                            grade[i] = "R";
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("Student " + (i + 1) + " -> %=" + percent[i] + ", Grade=" + grade[i]);
                    }
                    break;

                // Q9 Marks & Grades 2D
                case 9:
                    System.out.print("Enter number of students: ");
                    n = sc.nextInt();
                    int[][] marks2 = new int[n][3];
                    double[] percent2 = new double[n];
                    String[] grade2 = new String[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter marks in Physics, Chemistry, Maths for student " + (i + 1) + ": ");
                        marks2[i][0] = sc.nextInt();
                        marks2[i][1] = sc.nextInt();
                        marks2[i][2] = sc.nextInt();

                        int total = marks2[i][0] + marks2[i][1] + marks2[i][2];
                        percent2[i] = total / 3.0;

                        if (percent2[i] >= 80) {
                            grade2[i] = "A";
                        } else if (percent2[i] >= 70) {
                            grade2[i] = "B";
                        } else if (percent2[i] >= 60) {
                            grade2[i] = "C";
                        } else if (percent2[i] >= 50) {
                            grade2[i] = "D";
                        } else if (percent2[i] >= 40) {
                            grade2[i] = "E";
                        } else {
                            grade2[i] = "R";
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("Student " + (i + 1) + " -> %=" + percent2[i] + ", Grade=" + grade2[i]);
                    }
                    break;

                // Q10 Digit Frequency
                case 10:
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();
                    String str = Integer.toString(num);
                    int[] freq = new int[10];
                    for (int i = 0; i < str.length(); i++) {
                        freq[str.charAt(i) - '0']++;
                    }
                    System.out.println("Digit Frequencies:");
                    for (int i = 0; i < 10; i++) {
                        if (freq[i] > 0) {
                            System.out.println(i + " -> " + freq[i]);
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}