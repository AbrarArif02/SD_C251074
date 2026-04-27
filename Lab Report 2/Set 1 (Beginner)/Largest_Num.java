import java.util.Scanner;

public class Largest_Num {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        int largest = a;

        if(b>largest) largest = b;

        if(c>largest) largest = c;

        System.out.println("Largest: " + largest);
    }
}
