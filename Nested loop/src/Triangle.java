import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter value N = ");
        int N = inp.nextInt();
        int i = 0;
        while (i<= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
