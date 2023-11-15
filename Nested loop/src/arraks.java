import java.util.Scanner;
public class arraks {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a value");
        int num = inp.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--){
                System.out.print(k + "");
            }
            System.out.println();
        }
    }
}
