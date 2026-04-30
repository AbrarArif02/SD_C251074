import java.util.Scanner;

public class Candy {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int N = obj.nextInt();
        int X = obj.nextInt();

        int min = N - X;

        if(min<=0)
            System.out.println(0);
        else {
            System.out.println("Number of Packets: " + (min+3)/4);
        }
    }
}
