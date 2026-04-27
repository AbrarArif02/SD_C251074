import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String name = obj.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
