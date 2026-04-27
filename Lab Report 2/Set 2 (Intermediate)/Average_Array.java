import java.util.Scanner;

public class Average_Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int n = obj.nextInt();
        int[] arr = new int[n];

        int sum = 0;

        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
            sum+=arr[i];
        }

        double average = (double)sum/n;

        System.out.println("Average: " + average);

    }
}
