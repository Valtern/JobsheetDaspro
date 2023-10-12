import java.util.Scanner;
public class WhileOvertimePayS03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numEmployee, overtimeHours = 0, i = 0;
        double overtimePay = 0, totalOvertimePay = 0.0;
        String position;
        System.out.println("Employee number = ");
        numEmployee = inp.nextInt();
        while (i<numEmployee) {
            System.out.print("Position of empoyee" + (i+1) + " (director, manager, staff) = ");
            position = inp.next();
            System.out.println("Employee " + (i+1) + " overtime hours = ");
            overtimeHours = inp.nextInt();
            i++;
            if (position.equalsIgnoreCase("director")) {
                System.out.println("This does something");
                continue;
            } else if (position.equalsIgnoreCase("manager")) {
                overtimePay = overtimeHours * 100000;
            } else if (position.equalsIgnoreCase("staff")) {
                overtimePay = overtimeHours * 75000;
            } else {
                System.out.println("Invalid position !");
                i--;
            }
            totalOvertimePay += overtimePay;

        }
        System.out.println("Total of Overtime Pay = " + totalOvertimePay);
    }
}
