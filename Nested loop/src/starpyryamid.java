import java.util.Scanner;
public class starpyryamid {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;
        System.out.println("Enter a value");
        num = inp.nextInt();
        for (int i = 1;i <= num;i++) {
            for (int j = num;j >= i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
