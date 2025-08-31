import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter employee grade: ");
        char grade = sc.next().charAt(0);

        double bonus = (grade == 'A') ? 0.05*salary : 0.10*salary;
        if (salary < 10000) bonus += 0.02*salary;

        double newSalary = salary + bonus;
        System.out.println("Bonus: " + bonus);
        System.out.println("New Salary: " + newSalary);
    }
}
