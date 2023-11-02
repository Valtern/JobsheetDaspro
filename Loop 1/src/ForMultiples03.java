import java.util.Scanner;
public class ForMultiples03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int multiple, sum = 0, counter = 0, i = 1, sumav1 , sumav = 0;
        System.out.print("Input the multiple = ");
        multiple = inp.nextInt();
        for (;i<=50;i++) {
            if (i%multiple == 0) {
                sum = sum + i;
                sumav = sum + sumav;
                counter++;
            }
        }
        i = i - 1;
        sumav1 = sumav / i;
        System.out.println(i);
        System.out.printf("There are %d numbers that are multiple of %d in range of 1 to 50.\n", counter, multiple);
        System.out.printf("The sum from all multiple of %d in range 1 s.d. 50 is %d. \n", multiple, sum);
        System.out.printf("The sum average from all multiple of %d in range 1 s.d. 50 is %d. \n", multiple, sumav1);
    }
}