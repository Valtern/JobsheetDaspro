import java.util.Scanner;
public class WeeklyGrade {
    static int[][] gradeT = new int[5][7];
    static Scanner inp = new Scanner(System.in);


    public static void main (String []args) {
        int count = 1, gradeTem, ind1, ind2;
        String name, grade;
        System.out.println("Enter how many rows do you want: ");
        ind1 = inp.nextInt();
        ind1+=1;
        System.out.println("Enter how many column do you want: ");
        ind2 = inp.nextInt();
        ind2+=1;
        String[][] stuData = new String[ind1][ind2];
        for (int i = 1; i < stuData.length; i++) {
            System.out.print("Enter a student name: ");
            name = inp.next();
            stuData[i][0] = name;
            for (int j = 1; j < stuData[0].length; j++) {
                System.out.println(j);
                stuData[0][j] = "Week "+j;
                if (count == 1) {
                    System.out.print("Input week " + count + ": ");
                    grade = inp.next();
                    stuData[i][j] = grade;
                    gradeTem = Integer.parseInt(grade);
                    gradeT[i-1][j-1] = gradeTem;
                    count++;
                } else if (count == 2) {
                    System.out.print("Input week " + count + ": ");
                    grade = inp.next();
                    stuData[i][j] = grade;
                    gradeTem = Integer.parseInt(grade);
                    gradeT[i-1][j-1] = gradeTem;
                    count++;
                } else if (count == 3) {
                    System.out.print("Input week " + count + ": ");
                    grade = inp.next();
                    stuData[i][j] = grade;
                    gradeTem = Integer.parseInt(grade);
                    gradeT[i-1][j-1] = gradeTem;
                    count++;
                } else if (count == 4) {
                    System.out.print("Input week " + count + ": ");
                    grade = inp.next();
                    stuData[i][j] = grade;
                    gradeTem = Integer.parseInt(grade);
                    gradeT[i-1][j-1] = gradeTem;
                    count++;
                } else if (count == 5) {
                    System.out.print("Input week " + count + ": ");
                    grade = inp.next();
                    stuData[i][j] = grade;
                    gradeTem = Integer.parseInt(grade);
                    gradeT[i-1][j-1] = gradeTem;
                    count++;
                } else if (count == 6) {
                    System.out.print("Input week " + count + ": ");
                    grade = inp.next();
                    stuData[i][j] = grade;
                    gradeTem = Integer.parseInt(grade);
                    gradeT[i-1][j-1] = gradeTem;
                    count++;
                } else if (count == 7) {
                    System.out.print("Input week " + count + ": ");
                    grade = inp.next();
                    stuData[i][j] = grade;
                    gradeTem = Integer.parseInt(grade);
                    gradeT[i-1][j-1] = gradeTem;
                    count = 1;
                }
            }
        }
        for (int i = 0; i < stuData.length; i++) {
            for (int j = 0; j < stuData[0].length; j++) {
                if (stuData[i][j] == null) {
                    String rep = "   ";
                    stuData[i][j] = rep;
                }
            }
            System.out.println(String.join("  |  ", stuData[i]));
        }
        int highestweek = HighestWeek();
        highestweek+=2;
        int highestgrade = highestgrade();
        System.out.println("Week with the highest grade: " + highestweek);
        System.out.println("highest grade: " + highestgrade);


    }

    static int HighestWeek() {
        int highestWeek = 0;
        int highestGrade = gradeT[0][0];

        for (int i = 1; i < gradeT.length; i++) {
            for (int j = 0; j < gradeT[0].length; j++) {
                if (gradeT[i][j] > highestGrade) {
                    highestGrade = gradeT[i][j];
                    highestWeek = i;
                }
            }
        }

        return highestWeek;

    }
     static int highestgrade() {
        int highestgrade = gradeT[0][0];
        for (int i = 0;i < gradeT.length;i++) {
            for (int j = 0;j < gradeT[0].length;j++) {
                if (gradeT[i][j] > highestgrade) {
                    highestgrade = gradeT[i][j];
                }
            }
        }
        return highestgrade;
     }
}
