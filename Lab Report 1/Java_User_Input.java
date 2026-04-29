import java.util.Scanner;
public class Java_User_Input {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            String name =obj.nextLine();

            System.out.println("My name is "+ name);
        }        
    }
}
