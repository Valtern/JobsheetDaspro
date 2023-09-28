import java.util.Scanner;
public class Selection2StudentIDNumber {
    public static void main(String [] args) {
        Scanner input05 = new Scanner(System.in);
        int curGrade;
        float finalExam, midExam, quiz, assignment, total;
        String gradeLet, message;
        System.out.println("Nilai uas: ");
        finalExam =  input05.nextFloat();
        System.out.println("Nilai uts: ");
        midExam = input05.nextFloat();
        System.out.println("Nilai quiz: ");
        quiz = input05.nextFloat();
        System.out.println("Nilai tugas: ");
        assignment = input05.nextFloat();
        total = (finalExam * 0.4f) + (midExam * 0.3f) + (quiz * 0.1f) + (assignment * 0.2f);
        curGrade = (int) total;
        if (curGrade >= 80) {
            gradeLet = "A";
            message = "You passed with great marks !";
        } else if (curGrade >= 73) {
            gradeLet = "B+";
            message = "You passed with good marks !";
        } else if (curGrade >= 65) {
            gradeLet = "B";
            message = "You passed with above decent marks !";
        } else if (curGrade >= 60) {
            gradeLet = "C+";
            message = "you fail i hate you";
        } else if (curGrade >= 50) {
            gradeLet = "C";
            message = "bruh you dub lmao";
        } else if (curGrade >= 39) {
            gradeLet = "D";
            message = "you stinky poopy head";
        } else {
            gradeLet = "E";
            message = "i hate you \n die";
        }
        System.out.println("You got the final grade: " + gradeLet + "\nAnd the decision is:\t" + message);
    }
}
