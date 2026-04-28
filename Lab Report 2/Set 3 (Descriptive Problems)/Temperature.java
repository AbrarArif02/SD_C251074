import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int A = obj.nextInt();
        int B = obj.nextInt();
        int C = obj.nextInt();

        if(A<=B && C<=B){
            System.out.println("They agree on some Temperature");
        } else 
            System.out.println("They don't agree on some Temperature");
    }
}
