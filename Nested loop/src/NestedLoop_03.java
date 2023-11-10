import java.util.Scanner;
public class NestedLoop_03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[][] temps = new double[5][7];
        double[] sum = new double[5];
        double temp = 0;
        for (int i = 0;i < temps.length;i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = inp.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0;i < temps.length;i++) {
            System.out.println("Kota ke-" + (i+1) + ": ");
            for (int j = 0;j < temps[0].length;j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0;i < temps.length;i++) {
            for (int j = 0; j < temps[0].length;j++) {
                sum[i] = sum[i] + temps[i][j];
            }
        } for (int i = 0;i < sum.length;i++) {
            System.out.println("Average temperature between city");
            double sumall = sum[i] / temps[0].length;
            System.out.println("City: " + (i+1) + " " + "\n" + sumall);
        }
    }
}
