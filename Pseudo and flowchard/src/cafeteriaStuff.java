import java.util.Scanner;
public class cafeteriaStuff {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String foodName, drinkName, currentDate, customerName;
        int foodPrice;
        int drinkPrice;
        int customerServiceFee;
        int totalPriceFoodDrink;
        int discFoodDrinkPrice;
        double totalPriceAll;
        double discount, tax = 1.11;
        boolean MorF, cashOrCredit;
        System.out.println("Input your food: ");
        foodName = input.nextLine();
        System.out.println("Input your drink: ");
        drinkName = input.nextLine();
        System.out.println("Enter the current date: ");
        currentDate = input.nextLine();
        System.out.println("Enter the customer name: ");
        customerName = input.nextLine();
        System.out.println("What is your gender ? (false for male | true for female)");
        MorF = input.nextBoolean();
        System.out.println("Cash or credit (false for cash | true for credit)");
        cashOrCredit = input.nextBoolean();
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
        System.out.println("The name of the food and drinks you have ordered: \n" + foodName + "\n " + drinkName);
        System.out.println("The prices are: " + totalPriceAll);
        System.out.println("The current transaction takes places at: "+ currentDate);
        System.out.println("The Customer name are: " + " "+ customerName + " " + MorF);
        System.out.println("Cash or credit (false for cash | true for credit)" + " " + cashOrCredit);

    }
}
