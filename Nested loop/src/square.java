import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int value;
        value = inp.nextInt();
        int k = 0;
        k = value + k;
        for (int i = 0;i < value;i++) {
            for (int j = 0; j < value;j++) {
                if (i == 0 || i == value-1 || j >= value-1 || j == 0 ) {
                    System.out.print(i+1 + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
