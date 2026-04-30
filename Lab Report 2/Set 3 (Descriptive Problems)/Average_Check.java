import java.util.Scanner;

public class Average_Check {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int A = obj.nextInt();
        int B = obj.nextInt();
        int C = obj.nextInt();

        double avg = (double) (A+B)/2;

        if(avg>C){
            System.out.println("Avg of A and B is Greater than C");
        } else 
            System.out.println("Avg of A and B is not Greater than C");

    }
}
