public class Experiment5_03 {
    public static void main(String[] args) {
        show("Programming fundamentals 2023", 100, 200);
        show("Information technology", 1,2,3,4,5);
        show("Informatics");
    }

    static void show (String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Number of arguments/paramaters: " + a.length);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
