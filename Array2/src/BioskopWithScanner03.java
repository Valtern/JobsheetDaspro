import java.util.Arrays;
import java.util.Scanner;
public class BioskopWithScanner03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = 0, column = 0, menuSelect;
        String name = "", next, avail;
        boolean list = false, wack = false;
        String[][] audience = new String[4][2];
        while (!wack) {
            System.out.println("What would you like to do ? \n1. Input audience data \n2. Display the list of audience \n3. Exit");
            menuSelect = inp.nextInt();
            if (menuSelect == 1) {
                while (true) {
                    while (!list) {
                        System.out.println("Enter your name: ");
                        name = inp.next();
                        System.out.println("Enter the rows: ");
                        rows = inp.nextInt();
                        if (rows > 4) {
                            System.out.println("Invalid position");
                            break;
                        }
                        System.out.println("Enter the column: ");
                        column = inp.nextInt();
                        if (column > 2) {
                            System.out.println("Invalid position");
                            break;
                        }
                        if (audience[rows - 1][column - 1] == null) {
                            System.out.println("This seat is available");
                            list = true;
                        } else {
                            System.out.println("This seat is not available");
                            name = audience[rows - 1][column - 1];
                            System.out.println("Would you like to try another seat ? y/n");
                            avail = inp.next();
                            if (avail.equalsIgnoreCase("n")) {
                                break;
                            }
                        }
                    }

                    inp.nextLine();
                    audience[rows - 1][column - 1] = name;

                    System.out.println("Enter another audience ? (y/n): ");
                    next = inp.nextLine();
                    if (next.equalsIgnoreCase("y")) {
                        list = false;
                    } else {
                        break;
                    }
                }
            } else if (menuSelect == 2){
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length;j++) {
                            if (audience[i][j] == null) {
                                String rep = "***";
                                audience[i][j] = rep;
                            }
                        }
                        System.out.println(String.join(", ", audience[i]));
                    }
            } else {
                wack = true;
            }
        }
    }
}
