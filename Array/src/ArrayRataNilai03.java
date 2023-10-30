import java.util.Scanner;
public class ArrayRataNilai03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int banyakLulus = 0, index, index1 = 0, index2 = 0;
        System.out.print("How many student are there :");
        index = inp.nextInt();
        int[] nilaiMhs = new int[index];
        String[] lulus = new String[index];
        double total = 0, total2 = 0, rata2, rata2tidakLulus;
        for (int i = 0;i < nilaiMhs.length;i++) {
            System.out.println("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = inp.nextInt();
            if (nilaiMhs[i] > 70) {
                lulus[i] = "lulus";
                banyakLulus +=1;
            } else {
                lulus[i] = "tidak lulus";
            }
        }
        for (int i = 0;i < nilaiMhs.length;i++) {
            if (nilaiMhs[i] > 70) {
                total += nilaiMhs[i];
                index1 += 1;
            } else {
                total2 += nilaiMhs[i];
                index2 += 1;
            }
        }
        for (int i = 0;i < lulus.length;i++) {
            System.out.println("Mahasiswa ke-"+ (i+1) + " " +lulus[i]);
        }
        rata2 = total/index1;
        rata2tidakLulus = total2/index2;
        System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rata2);
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rata2tidakLulus);
        System.out.println("Banyaknya mahasiswa yang lulus: " + banyakLulus);
    }
}
