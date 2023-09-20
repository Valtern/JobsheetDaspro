import java.util.Scanner;
public class cafeteriaStuff {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String foodName, drinkName;
        int foodPrice;
        int drinkPrice;
        int customerServiceFee;
        int totalPriceFoodDrink;
        int discFoodDrinkPrice;
        double totalPriceAll;
        double discount, tax = 1.11;
        System.out.println("Input your food: ");
        foodName = input.nextLine();
        System.out.println("Input your drink: ");
        drinkName = input.nextLine();
        System.out.println("Input the prices of the food: ");
        foodPrice = input.nextInt();
        System.out.println("Input the prices of the drink: ");
        drinkPrice = input.nextInt();
        System.out.println("Input the customer service fee: ");
        customerServiceFee = input.nextInt();
        System.out.println("Enter the discount: ");
        discount = input.nextDouble();
        totalPriceFoodDrink = foodPrice + drinkPrice;
        discFoodDrinkPrice = (int) (totalPriceFoodDrink * discount);
        totalPriceAll = (discFoodDrinkPrice + customerServiceFee) * tax;
        System.out.println("The name of the food and drinks you ordered: \n" + foodName + " " + drinkName);
        System.out.println("The prices are: " + totalPriceAll);

    }
}
