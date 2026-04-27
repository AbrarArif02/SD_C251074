import java.util.Scanner;

public class Sum_1_to_N {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int N = obj.nextInt();
        int sum = 0;

        for(int i=1;i<=N;i++){
           sum+=i;
        }

        System.out.print( "Sum: " + sum);
    }
}

