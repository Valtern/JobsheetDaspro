import java.util.Scanner;
public class Scannerclassstuff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height;
        double heightsum;
        double bmi;
        System.out.println("Enter your Weight (Kilograms)");
        weight = sc.nextDouble();
        System.out.println("Enter your Height (Meters)");
        height = sc.nextDouble();
        heightsum = (double) Math.pow(height,2);
        bmi = weight / heightsum;
        System.out.println("Your BMI is: " + bmi);
        System.out.println("If your BMI is in the range of 18.5-24.9 You're a healthy adult");

       

    }
}
