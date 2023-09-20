import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double circumference, area;
        double phi = 3.14;
        System.out.println("Input radius: ");
        r = input.nextInt();
        area = phi*r*r;
        circumference = 2*phi*r;
        System.out.println("Area: "+area);
        System.out.println("Circumference: "+circumference);
    }
}