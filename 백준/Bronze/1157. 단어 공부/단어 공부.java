
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text =  sc.nextLine().toLowerCase();

        int[] counts = new int['z' - 'a' + 1];
        int[] alpha = new int['z' - 'a' + 1];

        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = (char)('a' + i);
        }

        for (int i = 0; i< text.length(); i++) {
            counts[text.charAt(i) - 'a']++;
        }

        int max = -1;
        String popular = "";

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i];
                popular = Character.toString(alpha[i]).toUpperCase();
            } else if (counts[i] == max) {
                popular = "?";
            }
        }
        System.out.println(popular);
        sc.close();
    }
}
