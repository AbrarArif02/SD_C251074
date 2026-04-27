import java.util.Scanner;

public class Store_in_Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i=0;i<5;i++) {
            arr[i] = obj.nextInt();
        }

        for (int i=0;i<5;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
