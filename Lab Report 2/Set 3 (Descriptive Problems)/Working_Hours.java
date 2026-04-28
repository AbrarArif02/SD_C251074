import java.util.Scanner;

public class Working_Hours {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int X = obj.nextInt();
        int Y = obj.nextInt();

        int TotalHours = (X * 4) + Y;

        System.out.println("Total Working Hours: " + TotalHours);
    }    
}
