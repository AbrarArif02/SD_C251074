import java.util.Scanner;

public class Water_Filling {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int B1 = obj.nextInt();
        int B2 = obj.nextInt();
        int B3 = obj.nextInt();

        if((B1 + B2 + B3)<=1)
            System.out.println("Water filling time");
        else 
            System.out.println("Not now");
    }    
}
