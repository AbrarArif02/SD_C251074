import java.util.Scanner;

public class Monopoly_in_Market {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int P = obj.nextInt();
        int Q = obj.nextInt();
        int R = obj.nextInt();
        int S = obj.nextInt();

        if((P > Q + R + S) || (Q > P + R + S) || (R > P + Q + S) || (S > P + Q + R)){
            System.out.println("There is a Monopoly in Market");
        } else
            System.out.println("There is no Monopoly In Market");
    }
}
