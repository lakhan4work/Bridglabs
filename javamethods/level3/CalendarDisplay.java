import java.util.*;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }

    static void printCalendar(int month, int year) {
        String[] months = {"January","February","March","April","May","June",
                           "July","August","September","October","November","December"};
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            daysInMonth[1] = 29; // leap year

        System.out.println("\n   " + months[month-1] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        Calendar cal = new GregorianCalendar(year, month-1, 1);
        int startDay = cal.get(Calendar.DAY_OF_WEEK);

        for (int i = 1; i < startDay; i++) System.out.print("   ");

        for (int day = 1; day <= daysInMonth[month-1]; day++) {
            System.out.printf("%2d ", day);
            if ((day + startDay - 1) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
}
