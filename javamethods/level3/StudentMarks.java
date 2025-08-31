import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        int p = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int c = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int m = sc.nextInt();

        int total = p + c + m;
        double average = total / 3.0;
        double percentage = (total / 300.0) * 100;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Percentage = " + percentage + "%");
    }
}
