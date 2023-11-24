import java.util.Scanner;
public class CubeStudent03 {
    static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        int Len, Wid, Hei;
        System.out.print("Enter a length: ");
        Len = inp.nextInt();
        System.out.print("Enter a width: ");
        Wid = inp.nextInt();
        System.out.print("Enter a height: ");
        Hei = inp.nextInt();
        inp.close();
        int resArea = area (Len, Wid);
        int resVol = volume (Len, Wid, Hei);
        System.out.println("The area of the rectangle is: "+ resArea + "\n" + "The volume of the rectangle is: " + resVol);

    }
    public static int area (int len, int wid) {
       return len * wid;
    }
    public static int volume (int len, int wid, int hei) {
        return len * wid * hei;
    }

}
