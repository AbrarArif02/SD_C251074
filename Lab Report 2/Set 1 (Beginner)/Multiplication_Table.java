import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int num = obj.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }

    }
}
