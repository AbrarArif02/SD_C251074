import java.util.Scanner;

public class UpperCase_LowerCase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String S = obj.nextLine();

        System.out.println("Uppercase: " + S.toUpperCase());
        System.out.println("Lowercase: " + S.toLowerCase());
    }
}
