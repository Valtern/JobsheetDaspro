public class Buku03 {
    String title, author;
    int page, stock, price;

    void showInformation() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of page: " + page);
        System.out.println("Stocks: " + stock);
        System.out.println("Prices: " + price);
    }
    void sold(int total) {
        if (stock > 0) {
            stock -= total;
        }
    }
    void restock(int total) {
        stock += total;
    }
    void changePrice(int prc) {
        price = prc;
    }
}
