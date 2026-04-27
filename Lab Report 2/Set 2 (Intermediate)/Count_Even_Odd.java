import java.util.Scanner;

public class Count_Even_Odd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }

        int even = 0, odd = 0;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0) even++;
            else odd++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
