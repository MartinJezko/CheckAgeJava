import java.util.Scanner;

public class checkAge {
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("You are not old enough for this.");
        }
        if (age >= 18) {
            System.out.println("You are okay, go ahead.");
        }
    }
    public static void main(String[] args) {
        System.out.println("What is your age?: ");
        Scanner ageObj = new Scanner(System.in);
        String age_str = ageObj.nextLine();

        int age = Integer.parseInt(age_str);

        checkAge(age);
    }
}
