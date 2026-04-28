import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int X = obj.nextInt();

        if(X+3<=10) 
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
