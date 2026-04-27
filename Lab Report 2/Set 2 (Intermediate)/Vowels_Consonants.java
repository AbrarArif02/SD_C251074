import java.util.Scanner;

public class Vowels_Consonants {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String S = obj.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);

            if(ch>='a' && ch<='z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else 
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

    }
}
