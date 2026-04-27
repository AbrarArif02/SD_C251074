import java.util.Scanner;

public class Largest_Num_in_Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int n = obj.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }

        int largest = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i]; 
            }
        }

        System.out.println("Largest: " + largest);
    }
}
