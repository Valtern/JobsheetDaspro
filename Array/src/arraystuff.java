import java.util.Scanner;
public class arraystuff {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int index, value = 0, total;
        System.out.println("Input how many element you want to put");
        index = inp.nextInt();
        int[] elements = new int[index];
        for (int i = 0;i < elements.length;i++) {
            System.out.print("Input the value to the element: ");
            elements[i] = inp.nextInt();
        }
        int min = elements[0], max = elements[0];
        for (int i = 0;i < elements.length;i++) {
            value = elements[i] + value;
            if (min > elements[i]) {
                min = elements[i];
                } else if (max < elements[i]) {
                max = elements[i];
            }
            }
        total = value / elements.length;
        System.out.println("The lowest value is : " + min);
        System.out.println("The highest value is : " + max);
        System.out.println("The average value is : " + total);

    }
}
