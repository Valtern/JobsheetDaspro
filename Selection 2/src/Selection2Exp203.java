import java.util.Scanner;

public class Selection2Exp203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1, angle2, angle3, totalAngle;
        System.out.println("Enter a value for angle 1");
        angle1 = sc.nextInt();
        System.out.println("Enter a value for angle 2");
        angle2 = sc.nextInt();
        System.out.println("Enter a value for angle 3");
        angle3 = sc.nextInt();
        totalAngle = angle1 + angle2 + angle3;
        if (totalAngle == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            System.out.println("right triangle");
            } else {
                System.out.println("Not a right triangle");
            }
            if (angle2 == angle3) {
                if (angle1 == angle2) {
                    System.out.println("equilateral triangle");
                } else {
                    System.out.println("Not a equilateral triangle");
                }
                System.out.println("isosceles triangle");
            } else {
                System.out.println("Not a isosceles triangle");
            }
        } else {
            System.out.println("Not a triangle");
        }
    }
}
