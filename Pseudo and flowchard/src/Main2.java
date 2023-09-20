import java.util.Scanner;
public class Main2 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int salary, salaryDeduction, numAttendance, numAbsence, totalSalary;
        System.out.println("Input your salary");
        salary = input.nextInt();
        System.out.println("Input your salary Deduction");
        salaryDeduction = input.nextInt();
        System.out.println("Input your number of attendances");
        numAttendance = input.nextInt();
        System.out.println("Input your number of absences");
        numAbsence = input.nextInt();
        totalSalary = (numAttendance*salary)-(numAbsence*salaryDeduction);
        System.out.println("Total salary: "+totalSalary);

    }
}
