import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String S1 = obj.nextLine();

        String S2 = S1.substring(0,1).toUpperCase() + S1.substring(1);
        
        System.out.println(S2);
    }
}
