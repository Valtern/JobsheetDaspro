public class ExampleVariabel03 {
    public static void main(String[] args) {
        String oneOfMyHobbies ="Listening to music and playing games";
        boolean isSmart = true;
        char gender = 'm';
        byte _age = 18;
        double $gpa = 3.30, height = 1.53;
        System.out.println(oneOfMyHobbies);
        System.out.println("Are you smart ?\t" + isSmart);
        System.out.println("Gender: " + gender);
        System.out.println("My current age is " + _age);
        System.out.println(String.format("My GPA is %s and my height is %s meters", $gpa, height));

    }
}