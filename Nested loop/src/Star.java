import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter value N = ");
        int n = inp.nextInt();
        for (int iOuter = 1; iOuter<=n; iOuter++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}