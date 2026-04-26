public class Java_Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break; 
            }
            System.out.print(i+" ");
        }
    }
}
