import java.util.Scanner;

public class Passed_Exam {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int X = obj.nextInt();
        int Y = obj.nextInt();
        int Z = obj.nextInt();
        
        int total = X * Y;

        if(Z>total/2){
            System.out.println("YES");
        } else
            System.out.println("NO");
    }    
}
