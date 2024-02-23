public class Buku03 {
    String title, author, owner, ownerbook;
    int page, stock, price;
    public Buku03 (String titl, String aut, int pge, int sck, int pric) {
        title = titl;
        author = aut;
        page = pge;
        stock = sck;
        price = pric;
    }

    public Buku03 (String nameBook, String whoseBOok) {
        ownerbook = nameBook;
        owner = whoseBOok;

    }

    public Buku03() {

    }
    void showInfoBook() {
        System.out.println("Name of the book: " + ownerbook);
        System.out.println("Owner of the book: " + owner);
    }

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


