import java.util.Scanner;

public class Smallest_Num_Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
    
        int n = obj.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }

        int smallest = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest = arr[i]; 
            }
        }

        System.out.println("Smallest: " + smallest);
    }
}
