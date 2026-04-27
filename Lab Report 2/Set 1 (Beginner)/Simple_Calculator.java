import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        double a = obj.nextDouble();
        double b = obj.nextDouble();
        char op = obj.next().charAt(0);

        switch (op) {
            case '+': System.out.println(a+b);
                      break;

            case '-': System.out.println(a-b);
                      break;

            case '*': System.out.println(a*b);
                      break;

            case '/': if(b!=0) System.out.println(a/b);
                      else System.err.println("Error");   
                      break;                             
            default:
                System.out.println("Invalid operator");
        }
    }
}
