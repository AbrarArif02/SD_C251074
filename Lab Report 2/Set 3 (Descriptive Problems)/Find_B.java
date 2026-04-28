import java.util.Scanner;

public class Find_B {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int A = obj.nextInt();
        int C = obj.nextInt();
        
        if((A+C)%2 == 0) {
            int B = (A+C)/2;
            System.out.println(B);
        } else 
            System.out.println("Not Exist");
    }
}