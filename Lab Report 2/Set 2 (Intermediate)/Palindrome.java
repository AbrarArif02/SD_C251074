import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String S = obj.nextLine();

        String reverse = "";

        for (int i=S.length()-1; i>=0; i--) {
            reverse += S.charAt(i);
        }

        if(S.equals(reverse)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
