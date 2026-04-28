import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String S = obj.nextLine();

        if(S.length()>10){
            int MidCount = S.length()-2;

            String Result =""+ S.charAt(0) + MidCount + S.charAt(S.length()-1);
            System.out.println(Result);
        } else 
            System.out.println(S); 
    }
}
