import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String food;
        String drink;
        int foodc = 0;
        int drinkc = 0;
        System.out.println("Please choose your food: \n 1. Ayam goreng \n 2. Nasi goreng \n 3. Ikan goreng");
        food = sc.nextLine();
        switch (food) {
            case "Ayam goreng":
                    foodc = 22000;
                    break;
            case "Nasi goreng":
                    foodc = 19000;
                    break;
            case "Ikan goreng":
                    foodc = 21000;
                    break;
        }
        System.out.println("Please choose your drink: \n 1. Es teh \n 2. Lemon tea \n 3. Soda gembira");
        drink = sc.nextLine();
        switch (drink) {
            case "Es teh":
                    drinkc = 5000;
                    break;
            case "Lemon tea":
                    drinkc = 8000;
                    break;
            case "Soda gembira":
                    drinkc = 11000;
                    break;
        }
        System.out.println("You ordered: \n" + food + " "+ drink + "\n" + "The prices are: ");
        System.out.println(foodc + drinkc);
    }
}