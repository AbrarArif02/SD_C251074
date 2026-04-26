public class Java_For_Loop {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.print(i +" ");
            sum += i;
        }

        System.out.println("\nSum is "+ sum);
    }
}
