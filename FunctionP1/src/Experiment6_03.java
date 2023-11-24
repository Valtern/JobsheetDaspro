import java.util.Scanner;
public class Experiment6_03 {
 /*   public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.println("Input length = ");
        p = inp.nextInt();
        System.out.println("Input width = ");
        l = inp.nextInt();
        System.out.println("Input height = ");
        t = inp.nextInt();

        L = calculateArea(p, l);
        System.out.println("Area of the rectangle = " + L);
        vol = calculateVolume(t, p ,l);
        System.out.println("Volume of the rectangle = " + vol);
    }
    static int calculateArea (int l, int w) {
        int area = l * w;
        return area;
    }
    static int calculateVolume (int l, int w, int h) {
        int vol = calculateArea(l, w) * h;
        return vol;
    }
}*/
    public static void tampilh(int i) {
        for (int j = 1;j <= i;j++) {
            System.out.print(j);
        }
    }
    public static int jumlah (int bil1, int bil2) {
        return bil1 + bil2;
    }
    public static void tampilJ (int bil1, int bil2) {
        tampilh(jumlah(bil1,bil2));
    }
 public static void main(String[] args) {
     int temp = jumlah(1, 1);
     tampilJ(temp, 5);
 }
}
