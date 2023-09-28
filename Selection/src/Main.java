import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        int number;
        String output;
        System.out.println("Input a number = ");
        number = input05.nextInt();
        output = (number%2 == 0) ?  "is a even number" : "is a odd number";
        System.out.println(output);
    }
}