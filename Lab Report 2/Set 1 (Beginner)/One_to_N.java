import java.util.Scanner;

public class One_to_N {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int N = obj.nextInt();

        for(int i=1;i<=N;i++){
            System.out.print(i + " ");
        }
    }
}