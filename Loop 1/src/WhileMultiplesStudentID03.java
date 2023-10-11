import java.util.Scanner;
public class WhileMultiplesStudentID03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int multiple, sum = 0, i = 1, counter = 0;
        System.out.println("Input the multiple = ");
        multiple = inp.nextInt();
        while (i<=50) {
            if (i%multiple ==0) {
                sum = sum + i;
                counter++;
            }
            i++;
        }
        System.out.printf("There are %d numbers that are multiple of %d in range of 1 to 50.\n", counter, multiple);
        System.out.printf("The sum from all multiple of %d in range 1 s.d. 50 is %d. \n", multiple, sum);
    }

}
