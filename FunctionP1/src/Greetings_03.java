import java.util.Scanner;
public class Greetings_03 {
    public static String getGreetingsRecipient() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input the name you want to greet: ");
        String recipientName = inp.nextLine();
        inp.close();
        return recipientName;
    }
    public static void main(String[] args) {
        String Name = getGreetingsRecipient();
        System.out.println("Thank you " + Name + " May the force be with you!");
    }
}
