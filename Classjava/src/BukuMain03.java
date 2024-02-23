import java.awt.print.Book;

public class BukuMain03 {
    public static void main(String[] args) {
        Buku03 bk1 = new Buku03();
        bk1.title = "Today Ends Tomorrow Comes"; // this just sounds like "people die when they're killed"
        bk1.author = "Denanda Pratiwi";
        bk1.page = 198;
        bk1.stock = 13;
        bk1.price = 71000;

        bk1.showInformation();
        bk1.sold(5);
        bk1.changePrice(60000);
        bk1.showInformation();



        Buku03 bk2 = new Buku03("Self reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.sold(11);
        bk2.showInformation();

        Buku03 bk3 = new Buku03("Buku Antonius", "Antonius Kaharap Kautsar");
        bk3.showInfoBook();

    }
}