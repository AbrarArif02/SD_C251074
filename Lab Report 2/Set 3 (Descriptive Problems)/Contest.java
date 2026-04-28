import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int A = obj.nextInt();
        int B = obj.nextInt();
        int C = obj.nextInt();
        int X = obj.nextInt();

        if(X==A || X==B || X==C)
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
}
