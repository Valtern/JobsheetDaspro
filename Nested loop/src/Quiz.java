import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Random rng = new Random();
        Scanner inp = new Scanner(System.in);
        char menu = 'y';
        do {
            int number = rng.nextInt(10)+1;
            boolean succ = false;
            do {
                System.out.println("Guess a number (1-10): ");
                int answer = inp.nextInt();
                inp.nextLine();
                succ = (answer == number);
                if (answer > number) {
                    if (answer == number+1) {
                        System.out.println("A bit too high");
                    } else {
                        System.out.println("Too high");
                    }
                } else if (answer < number){
                    if (answer == number-1) {
                        System.out.println("A bit too low");
                    } else {
                        System.out.println("Too low");
                    }
                } else {
                    System.out.println("Correct number");
                }
            } while (!succ);
            System.out.println("Do you want to retry the game ? (y/n)");
            menu = inp.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}
