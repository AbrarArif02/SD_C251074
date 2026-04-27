import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int num = obj.nextInt();
        int fact = 1;

        for (int i=1; i<=num; i++) {
            fact*=i;
        }

         System.out.println("Factorial: " + fact);
    }
}
