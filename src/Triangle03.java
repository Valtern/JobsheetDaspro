import java.util.Scanner;

public class Triangle03 {
    Scanner sc = new Scanner(System.in);
    float base, height, area;

System.out.print("Input base: ");
    base = sc.nextFloat();

System.out.print("Input height: ");
    height = sc.nextFloat();

    area = base * height / 2;
System.out.println("Area of the triangle: " + area);

}
