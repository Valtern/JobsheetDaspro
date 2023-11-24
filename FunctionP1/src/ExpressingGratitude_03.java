import java.util.Scanner;
public class ExpressingGratitude_03 {

    public static String getGreetingRecipient() {
       Scanner inp = new Scanner(System.in);
        System.out.println("Input the name of people you want to greet: ");
        String recipientName = inp.nextLine();
        inp.close();
        return recipientName;
    }

    public static void sayThankYou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world. \n" + "You inspired in me a love for learning and made me feel like i could ask you anything.");
    }

    public static void sayAdditionalGreetings(String death, String wack) {
        System.out.println(death + wack);
    }
    public static void main(String[] args) {
        sayThankYou();
        sayAdditionalGreetings("hello ", "Hi");
    }


}
