import java.util.Scanner;

public class Different_Digit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if(a==b) System.out.println("Different One is: " + c);
        else if(b==c) System.out.println("Different One is: " + a);
        else if(a==c) System.out.println("Different One is: " + b); 
        else System.out.println("All Numbers are Different");
    }
}
