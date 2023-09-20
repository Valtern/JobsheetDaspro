import java.util.Scanner;
 class PurchasePriceStudentID {
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        String bookBrand;
        int price, quantity, pageCount;
        double discount, totalPrice, purchasePrice, totalDiscount;
        System.out.println("Input book brand: ");
        bookBrand = input.nextLine();
        System.out.println("Input price: ");
        price = input.nextInt();
        System.out.println("Input quantity: ");
        quantity = input.nextInt();
        System.out.println("Input page count: ");
        pageCount = input.nextInt();
        System.out.println("Input discount: ");
        discount = input.nextDouble();
        totalPrice = price*quantity*pageCount;
        totalDiscount = totalPrice*discount;
        purchasePrice = totalPrice-totalDiscount;
        System.out.println("The brand of the book: "+bookBrand);
        System.out.println("Total discount: "+totalDiscount);
        System.out.println("Final purchase price: "+purchasePrice);

    }
}
