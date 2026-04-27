import java.util.Scanner;

public class Search_element {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }

        int X = obj.nextInt();

        boolean found = false;

        for(int i=0;i<n;i++){
            if(arr[i]==X){
                found = true;
                break; 
            }
        }

        if(found) System.out.println("Found");
        else System.out.println("Not Found");
    } 
}
