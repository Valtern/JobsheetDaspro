import java.util.Scanner;

public class Selection2Exp103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        year = sc.nextInt();
        if (year%4 == 0) {
            if (year%100 != 0){
                System.out.println("A leap year");
            } else {
                System.out.println("not a leap year");
            }
        } else  {
            System.out.println("not a leap year");
        }

    }
}