import java.util.Scanner;

public class IIUC_TV {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int N = obj.nextInt();
        int X = obj.nextInt();

        int subscript = (N+5)/6;
        
        int Total = subscript * X;

        System.out.println("Total cost: " + Total);
    }
}
